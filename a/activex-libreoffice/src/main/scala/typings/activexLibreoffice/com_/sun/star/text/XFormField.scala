package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
    __obj.asInstanceOf[XFormField]
  }
}

