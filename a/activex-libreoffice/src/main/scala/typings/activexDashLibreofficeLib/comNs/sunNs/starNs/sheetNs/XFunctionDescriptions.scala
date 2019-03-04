package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the property sequence of a function description via function index or identifier.
  *
  * The container access methods return a sequence of {@link com.sun.star.beans.PropertyValue} structs. The properties contained in the sequence are
  * collected in the service {@link FunctionDescription} .
  * @see com.sun.star.sheet.FunctionDescriptions
  */
trait XFunctionDescriptions
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * finds a function description by the identifier of the function.
    * @param nId is the identifier of the function description (the same that is used in the service {@link RecentFunctions} .
    * @returns the sequence of property values (described in {@link FunctionDescription} ).
    */
  def getById(nId: scala.Double): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
}

object XFunctionDescriptions {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getById: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFunctionDescriptions = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, getById = getById, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFunctionDescriptions]
  }
}

