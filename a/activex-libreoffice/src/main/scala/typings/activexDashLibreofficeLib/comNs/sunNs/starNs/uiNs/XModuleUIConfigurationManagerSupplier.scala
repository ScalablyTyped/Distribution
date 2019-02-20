package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to retrieve user interface configuration managers related to OpenOffice.org modules.
  * @since OOo 2.0
  */
trait XModuleUIConfigurationManagerSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the requested module based user interface configuration manager.
    * @param ModuleIdentifier a module identifier which identifies an OpenOffice.org module. The module identifier can be retrieved from the {@link com.sun.st
    * @returns an object implementing {@link com.sun.star.ui.ModuleUIConfigurationManager} service. If the provided module identifier is unknown a {@link com.su
    */
  def getUIConfigurationManager(ModuleIdentifier: java.lang.String): XUIConfigurationManager
}

