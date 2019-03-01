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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: js.Function0[scala.Unit],
    bindAlias: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      scala.Unit
    ],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    listAliases: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.AliasProgrammaticPair]
    ],
    lookupAlias: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String
    ],
    lookupProgrammatic: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rebindAliases: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit],
    renameAlias: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    setLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    unbindAlias: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      scala.Unit
    ],
    unbindAliases: js.Function1[java.lang.String, scala.Unit]
  ): DatabaseAccessContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("bindAlias")(bindAlias)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("listAliases")(listAliases)
    __obj.updateDynamic("lookupAlias")(lookupAlias)
    __obj.updateDynamic("lookupProgrammatic")(lookupProgrammatic)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rebindAliases")(rebindAliases)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("renameAlias")(renameAlias)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("unbindAlias")(unbindAlias)
    __obj.updateDynamic("unbindAliases")(unbindAliases)
    __obj.asInstanceOf[DatabaseAccessContext]
  }
}

