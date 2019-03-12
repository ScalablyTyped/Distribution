package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the context for data access beans. It allows to register aliases for database access beans. It is possible to have different aliases for different
  * locales.
  *
  * A {@link DatabaseContext} stores an alias for the URL of a database access component for a given locale. It is also allowed to work with a default
  * locale. This is useful in connection with Enumeration or NameAccess to the context. In common use, the default language is set during the
  * initialization of the component.
  *
  * The service also provides a default handling for locales, where an alias isn't set. The first time an alias is registered for a programmatic name, the
  * alias becomes the default for all other known locales.
  * @deprecated Deprecated
  * @see com.sun.star.util.XLocalizedAliases
  */
trait DatabaseAccessContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XLocalizedAliases
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XLocalizable

object DatabaseAccessContext {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: () => scala.Unit,
    bindAlias: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    listAliases: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.AliasProgrammaticPair],
    lookupAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => java.lang.String,
    lookupProgrammatic: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    rebindAliases: (java.lang.String, java.lang.String) => scala.Unit,
    release: () => scala.Unit,
    renameAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String, java.lang.String) => scala.Unit,
    setLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => scala.Unit,
    unbindAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => scala.Unit,
    unbindAliases: java.lang.String => scala.Unit
  ): DatabaseAccessContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Locale = Locale, acquire = js.Any.fromFunction0(acquire), bindAlias = js.Any.fromFunction3(bindAlias), createEnumeration = js.Any.fromFunction0(createEnumeration), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocale = js.Any.fromFunction0(getLocale), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2(rebindAliases), release = js.Any.fromFunction0(release), renameAlias = js.Any.fromFunction3(renameAlias), setLocale = js.Any.fromFunction1(setLocale), unbindAlias = js.Any.fromFunction2(unbindAlias), unbindAliases = js.Any.fromFunction1(unbindAliases))
  
    __obj.asInstanceOf[DatabaseAccessContext]
  }
}

