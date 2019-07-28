package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.std.SafeArray
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
trait XFunctionDescriptions extends XIndexAccess {
  /**
    * finds a function description by the identifier of the function.
    * @param nId is the identifier of the function description (the same that is used in the service {@link RecentFunctions} .
    * @returns the sequence of property values (described in {@link FunctionDescription} ).
    */
  def getById(nId: Double): SafeArray[PropertyValue]
}

object XFunctionDescriptions {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    getById: Double => SafeArray[PropertyValue],
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFunctionDescriptions = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), getById = js.Any.fromFunction1(getById), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFunctionDescriptions]
  }
}

