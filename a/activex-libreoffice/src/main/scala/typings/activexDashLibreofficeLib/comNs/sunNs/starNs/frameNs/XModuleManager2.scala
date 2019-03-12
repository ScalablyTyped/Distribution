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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    identify: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit
  ): XModuleManager2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), identify = js.Any.fromFunction1(identify), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[XModuleManager2]
  }
}

