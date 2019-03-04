package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides a merged single interface for the {@link ModuleManager} service to implement.
  * @since LibreOffice 4.0
  */
trait XModuleManager2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace
     with XModuleManager

object XModuleManager2 {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    identify: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XModuleManager2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, identify = identify, queryInterface = queryInterface, release = release, replaceByName = replaceByName)
  
    __obj.asInstanceOf[XModuleManager2]
  }
}

