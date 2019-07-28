package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XFormField extends XInterface {
  var FieldType: String
  val Parameters: XNameContainer
  def getFieldType(): String
  def getParameters(): XNameContainer
  def setFieldType(fieldType: String): Unit
}

object XFormField {
  @scala.inline
  def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: () => Unit,
    getFieldType: () => String,
    getParameters: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFieldType: String => Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType, Parameters = Parameters, acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
  
    __obj.asInstanceOf[XFormField]
  }
}

