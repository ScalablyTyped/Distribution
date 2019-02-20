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

