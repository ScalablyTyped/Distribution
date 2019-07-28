package typings.activexDashLibreoffice.comNs.sunNs.starNs.reportNs.metaNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** identifies a {@link XFunctionManager} which allows to retrieve the meta data of all supported functions. */
trait XFunctionManager
  extends XIndexAccess
     with XComponent {
  /**
    * same as getByIndex.
    * @param position The position.
    * @see com.sun.star.container.XIndexAccess
    */
  def getCategory(position: Double): XFunctionCategory
  /**
    * get the function description by name
    * @param name the name of the function
    */
  def getFunctionByName(name: String): XFunctionDescription
}

object XFunctionManager {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getCategory: Double => XFunctionCategory,
    getCount: () => Double,
    getElementType: () => `type`,
    getFunctionByName: String => XFunctionDescription,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XFunctionManager = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCategory = js.Any.fromFunction1(getCategory), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFunctionByName = js.Any.fromFunction1(getFunctionByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XFunctionManager]
  }
}

