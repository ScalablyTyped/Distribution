package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource bundles contain locale-specific objects.
  *
  * When your program needs a locale-specific resource, such as `String` for example, your program can load it from the resource bundle that is
  * appropriate for the current user's locale. In this way, you can write program code that is largely independent of the user's locale, which isolates
  * most, if not all, of the locale-specific information in resource bundles.
  *
  * This allows you to write programs that can:
  *
  * be easily localized, or translated, into different languages.
  *
  * handle multiple locales at once.
  *
  * be easily modified, later, to support even more locales.
  *
  *
  *
  * One resource bundle is, conceptually, a set of related services that supports `XResourceBundle` . Each related service of `XResourceBundle` has the
  * same base name plus an additional component that identifies its locale. For example, suppose your resource bundle is named `MyResources` . The first
  * service you are likely to implement is the default resource bundle, which has the same name as its family  - `MyResources` . You can also provide as
  * many related locale-specific services as you need.
  *
  * For example, perhaps you would provide a German one named `MyResources_de` .
  *
  * Each related implementation of `XResourceBundle` contains the same items, but the items have been translated for the locale represented by that
  * `XResourceBundle` implementation. For example, both `MyResources` and `MyResources_de` may have a `String` that is used on a button for confirming
  * operations. In `MyResources` the `String` may contain `OK` and in `MyResources_de` it may contain `Gut` .
  *
  * If there are different resources for different countries, you can make specializations: for example, `MyResources_de_CH` is the German language (de)
  * in Switzerland (CH). If you only want to modify some of the resources in the specialization, you can do so.
  *
  * When your program needs a locale-specific object, it loads
  *
  * the `XResourceBundle` implementation using the {@link XResourceBundleLoader} service:
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * The first argument specifies the family name of the resource bundle that contains the object in question. The second argument indicates the desired
  * locale. `getBundle` uses these two arguments to construct the name of the `ResourceBundle` subclass it should load according to the following
  * specifications.
  *
  * The resource bundle lookup searches for services with various suffixes on the basis of (1) the desired locale and (2) the current default locale as
  * returned by Locale.getDefault(), and (3) the root resource bundle (baseclass), in the following order from lower-level (more specific) to parent-level
  * (less specific):
  *
  * baseclass + "_" + language1 + "_" + country1 + "_" + variant1 ;  baseclass + "_" + language1 + "_" + country1 ;  baseclass + "_" + language1 ;
  * baseclass + "_" + language2 + "_" + country2 + "_" + variant2 ;  baseclass + "_" + language2 + "_" + country2 ;  baseclass + "_" + language2 ;
  * baseclass
  *
  * For example, if the current default locale is `en_US` , the locale that the caller is interested in is `fr_CH` , and the resource bundle name is
  * `MyResources` ; resource bundle lookup will search for the following services, in order: ; `MyResources_fr_CH ;  MyResources_fr ;  MyResources_en_US ;
  *  MyResources_en ;  MyResources`
  *
  * The result of the lookup is a service, but that service may be backed by a property file on disk. If a lookup fails, `getBundle()` throws a
  * `MissingResourceException` .
  *
  * The base service **must** be fully qualified (for example, `myPackage::MyResources` , not just `MyResources` ).
  *
  * Resource bundles contain key/value pairs. The keys uniquely identify a locale-specific object in the bundle. Here is an example of a `XResourceBundle`
  * implementation that contains two key/value pairs:
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * Keys are always `String` s. In this example, the keys are `OkKey` and `CancelKey` . In the above example, the values are also `String` s  - `OK` and
  * `Cancel` -  but they do not have to be. The values can be any type of object.
  *
  * You retrieve an object from resource bundle using the appropriate get method. Because `OkKey` and `CancelKey` are both strings, you use `getByName` to
  * retrieve them:
  *
  * {{program example here, see documentation}}
  *
  *
  *
  * The get methods all require the key as an argument and return the object if found. If the object is not found, the get methods throw a {@link
  * com.sun.star.container.NoSuchElementException} .
  *
  * **NOTE:** You should always supply a base service with no suffixes. This will be the class of "last resort" if a locale is requested that does not
  * exist. In fact, you must provide **all** of the services in any given inheritance chain for which you provide a resource. For example, if you provide
  * `MyResources_fr_BE` , you must provide **both**`MyResources`**and**`MyResources_fr` , or the resource bundle lookup will not work right.
  *
  * You do not have to restrict yourself to using a single family of `ResourceBundle` s. For example, you could have a set of bundles for exception
  * messages, `ExceptionResources` ( `ExceptionResources_fr` , `ExceptionResources_de` , ...), and one for widgets, `WidgetResource` (
  * `WidgetResources_fr` , `WidgetResources_de` , ...); breaking up the resources however you like.
  * @author Mark Davis
  * @author Markus Meyer
  * @deprecated Deprecateddraft
  * @see MissingResourceException
  * @see Locale
  * @version 0.1 26 May 1999
  */
trait XResourceBundle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
  val Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * contains the parent bundle of this bundle.
    *
    * The parent bundle is searched by the method {@link com.sun.star.container.XNameAccess.getByName()} when this bundle does not contain a particular
    * resource.
    */
  var Parent: XResourceBundle
  /**
    * @param key specifies the element.
    * @returns an object from a resource bundle or NULL if no resource exists.  It does not look in the parents.
    */
  def getDirectElement(key: java.lang.String): js.Any
  /** @returns the locale for this resource bundle.  This function can be used to determine whether the resource bundle that is returned really corresponds to t */
  def getLocale(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
}

object XResourceBundle {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Parent: XResourceBundle,
    acquire: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getDirectElement: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XResourceBundle = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Locale = Locale, Parent = Parent, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getDirectElement = js.Any.fromFunction1(getDirectElement), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocale = js.Any.fromFunction0(getLocale), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XResourceBundle]
  }
}

