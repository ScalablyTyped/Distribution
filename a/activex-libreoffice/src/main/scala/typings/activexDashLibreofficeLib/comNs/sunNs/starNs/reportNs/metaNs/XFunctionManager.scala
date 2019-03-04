package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.metaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionManager} which allows to retrieve the meta data of all supported functions. */
trait XFunctionManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * same as getByIndex.
    * @param position The position.
    * @see com.sun.star.container.XIndexAccess
    */
  def getCategory(position: scala.Double): XFunctionCategory
  /**
    * get the function description by name
    * @param name the name of the function
    */
  def getFunctionByName(name: java.lang.String): XFunctionDescription
}

object XFunctionManager {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCategory: js.Function1[scala.Double, XFunctionCategory],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getFunctionByName: js.Function1[java.lang.String, XFunctionDescription],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XFunctionManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, addEventListener = addEventListener, dispose = dispose, getByIndex = getByIndex, getCategory = getCategory, getCount = getCount, getElementType = getElementType, getFunctionByName = getFunctionByName, hasElements = hasElements, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XFunctionManager]
  }
}

