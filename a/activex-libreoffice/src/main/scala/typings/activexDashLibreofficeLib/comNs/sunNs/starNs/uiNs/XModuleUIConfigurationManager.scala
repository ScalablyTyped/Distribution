package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies specific functions of a module based user interface configuration manager interface.
  *
  * A module user interface configuration manager supports, unlike a document based ui configuration manager, two layers of configuration settings data: ;
  *  1. Layer: A module default user interface configuration which describe all user interface elements settings that are used by OpenOffice. It is not
  * possible to insert, remove or change elements settings in this layer through the interfaces. ;  2. Layer: A module user interface configuration which
  * only contains customized user interface elements and user-defined ones. All changes on user interface element settings are done on this layer. This
  * layer is the same as the document ui configuration manager uses.
  * @since OOo 2.0
  */
trait XModuleUIConfigurationManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the settings from the default layer of the user interface configuration manager if it has a default layer.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if default settings have been found in the default layer, otherwise `FALSE` .
    */
  def getDefaultSettings(ResourceURL: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * determine if the settings of a user interface element is part of the default layer of the user interface configuration manager.
    * @param ResourceURL a resource URL which identifies the user interface element. A resource URL must meet the following syntax: "private:resource/$type/$n
    * @returns `TRUE` if settings have been found in the default layer, otherwise `FALSE` .
    */
  def isDefaultSettings(ResourceURL: java.lang.String): scala.Boolean
}

object XModuleUIConfigurationManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDefaultSettings: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
    ],
    isDefaultSettings: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XModuleUIConfigurationManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaultSettings")(getDefaultSettings)
    __obj.updateDynamic("isDefaultSettings")(isDefaultSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XModuleUIConfigurationManager]
  }
}

