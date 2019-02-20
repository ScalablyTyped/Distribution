package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementation of this service can keep any properties and is useful when an {@link XPropertySet} is to be used, for example, as parameters for a
  * method call.
  *
  * Scripting engines might not be able to use such objects as normal property sets, giving direct access to the properties. In this case, use the methods
  * like {@link XPropertySet.getPropertyValue()} .
  */
trait PropertyBag extends XPropertyBag {
  def createDefault(): scala.Unit
  def createWithTypes(
    AllowedTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`],
    AllowEmptyPropertyName: scala.Boolean,
    AutomaticAddition: scala.Boolean
  ): scala.Unit
}

