package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a name for the service to be used in displays.
  *
  * This name can be used in displays (dialogs, menus, etc.) to provide a more memorable / meaningful name than the service name or its implementation
  * name. It should not be used to identify / select a specific service / implementation.
  */
trait XServiceDisplayName
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the display name of the service for a given language.
    *
    * The caller may specify a {@link com.sun.star.lang.Locale} for the preferred language of the resulting string. However, if that locale is not supported
    * the resulting string may be given in a different language. Usually this should be English.
    * @param aLocale the preferred language for the resulting display name.
    * @returns the string to be used for the service in displays.
    */
  def getServiceDisplayName(aLocale: Locale): java.lang.String
}

object XServiceDisplayName {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getServiceDisplayName: js.Function1[Locale, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XServiceDisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getServiceDisplayName")(getServiceDisplayName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XServiceDisplayName]
  }
}

