package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  @JSName("ADODB.Property_typekey")
  var ADODBDotProperty_typekey: Property
  /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
  var Attributes: PropertyAttributesEnum
  val Name: String
  val Type: DataTypeEnum
  var Value: js.Any
}

object Property {
  @scala.inline
  def apply(
    ADODBDotProperty_typekey: Property,
    Attributes: PropertyAttributesEnum,
    Name: String,
    Type: DataTypeEnum,
    Value: js.Any
  ): Property = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("ADODB.Property_typekey")(ADODBDotProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

