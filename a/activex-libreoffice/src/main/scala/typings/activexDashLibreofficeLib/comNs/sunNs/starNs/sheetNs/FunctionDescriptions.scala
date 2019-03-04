package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a collection of function descriptions for all built-in functions as well as add-in functions available in the spreadsheet application.
  *
  * All container access methods return a sequence of {@link com.sun.star.beans.PropertyValue} structs. The properties contained in the sequence are
  * collected in the service {@link FunctionDescription} .
  */
trait FunctionDescriptions
  extends XFunctionDescriptions
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess

object FunctionDescriptions {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getById: js.Function1[
      scala.Double, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): FunctionDescriptions = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, createEnumeration = createEnumeration, getById = getById, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[FunctionDescriptions]
  }
}

