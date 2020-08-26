package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  @JSName("ADODB.Property_typekey")
  var ADODBDotProperty_typekey: Property = js.native
  /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
  var Attributes: PropertyAttributesEnum = js.native
  val Name: String = js.native
  val Type: DataTypeEnum = js.native
  var Value: js.Any = js.native
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
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setADODBDotProperty_typekey(value: Property): Self = this.set("ADODB.Property_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: PropertyAttributesEnum): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DataTypeEnum): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

