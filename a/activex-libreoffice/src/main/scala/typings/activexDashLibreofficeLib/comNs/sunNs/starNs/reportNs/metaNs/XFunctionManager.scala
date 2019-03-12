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
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCategory: scala.Double => XFunctionCategory,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getFunctionByName: java.lang.String => XFunctionDescription,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): XFunctionManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCategory = js.Any.fromFunction1(getCategory), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFunctionByName = js.Any.fromFunction1(getFunctionByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XFunctionManager]
  }
}

