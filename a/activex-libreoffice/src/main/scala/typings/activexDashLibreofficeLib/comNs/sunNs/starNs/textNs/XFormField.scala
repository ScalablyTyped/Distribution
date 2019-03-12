package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XFormField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var FieldType: java.lang.String
  val Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  def getFieldType(): java.lang.String
  def getParameters(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  def setFieldType(fieldType: java.lang.String): scala.Unit
}

object XFormField {
  @scala.inline
  def apply(
    FieldType: java.lang.String,
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    getFieldType: () => java.lang.String,
    getParameters: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFieldType: java.lang.String => scala.Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType, Parameters = Parameters, acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
  
    __obj.asInstanceOf[XFormField]
  }
}

