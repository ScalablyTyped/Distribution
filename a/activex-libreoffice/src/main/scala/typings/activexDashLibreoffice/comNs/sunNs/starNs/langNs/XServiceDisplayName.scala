package typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a name for the service to be used in displays.
  *
  * This name can be used in displays (dialogs, menus, etc.) to provide a more memorable / meaningful name than the service name or its implementation
  * name. It should not be used to identify / select a specific service / implementation.
  */
trait XServiceDisplayName extends XInterface {
  /**
    * returns the display name of the service for a given language.
    *
    * The caller may specify a {@link com.sun.star.lang.Locale} for the preferred language of the resulting string. However, if that locale is not supported
    * the resulting string may be given in a different language. Usually this should be English.
    * @param aLocale the preferred language for the resulting display name.
    * @returns the string to be used for the service in displays.
    */
  def getServiceDisplayName(aLocale: Locale): String
}

object XServiceDisplayName {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getServiceDisplayName: Locale => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XServiceDisplayName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getServiceDisplayName = js.Any.fromFunction1(getServiceDisplayName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XServiceDisplayName]
  }
}

