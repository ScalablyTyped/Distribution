package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XLocalizable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.AliasProgrammaticPair
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XLocalizedAliases
import typings.std.SafeArray
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
  extends XEnumerationAccess
     with XNameAccess
     with XLocalizedAliases
     with XLocalizable

object DatabaseAccessContext {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Locale: Locale,
    acquire: () => Unit,
    bindAlias: (String, Locale, String) => Unit,
    createEnumeration: () => XEnumeration,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLocale: () => Locale,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    listAliases: Locale => SafeArray[AliasProgrammaticPair],
    lookupAlias: (Locale, String) => String,
    lookupProgrammatic: (Locale, String) => String,
    queryInterface: `type` => js.Any,
    rebindAliases: (String, String) => Unit,
    release: () => Unit,
    renameAlias: (Locale, String, String) => Unit,
    setLocale: Locale => Unit,
    unbindAlias: (Locale, String) => Unit,
    unbindAliases: String => Unit
  ): DatabaseAccessContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, Locale = Locale, acquire = js.Any.fromFunction0(acquire), bindAlias = js.Any.fromFunction3(bindAlias), createEnumeration = js.Any.fromFunction0(createEnumeration), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocale = js.Any.fromFunction0(getLocale), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2(rebindAliases), release = js.Any.fromFunction0(release), renameAlias = js.Any.fromFunction3(renameAlias), setLocale = js.Any.fromFunction1(setLocale), unbindAlias = js.Any.fromFunction2(unbindAlias), unbindAliases = js.Any.fromFunction1(unbindAliases))
  
    __obj.asInstanceOf[DatabaseAccessContext]
  }
}

