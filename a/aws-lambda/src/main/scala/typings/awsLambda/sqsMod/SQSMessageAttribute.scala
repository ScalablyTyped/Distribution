package typings.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SQSMessageAttribute extends js.Object {
  
   // Not implemented. Reserved for future use.
  var binaryListValues: js.Array[scala.Nothing] = js.native
  
  var binaryValue: js.UndefOr[String] = js.native
  
   // Not implemented. Reserved for future use.
  var dataType: SQSMessageAttributeDataType = js.native
  
  var stringListValues: js.Array[scala.Nothing] = js.native
  
  var stringValue: js.UndefOr[String] = js.native
}
object SQSMessageAttribute {
  
  @scala.inline
  def apply(
    binaryListValues: js.Array[scala.Nothing],
    dataType: SQSMessageAttributeDataType,
    stringListValues: js.Array[scala.Nothing]
  ): SQSMessageAttribute = {
    val __obj = js.Dynamic.literal(binaryListValues = binaryListValues.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], stringListValues = stringListValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQSMessageAttribute]
  }
  
  @scala.inline
  implicit class SQSMessageAttributeOps[Self <: SQSMessageAttribute] (val x: Self) extends AnyVal {
    
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
    def setBinaryListValuesVarargs(value: scala.Nothing*): Self = this.set("binaryListValues", js.Array(value :_*))
    
    @scala.inline
    def setBinaryListValues(value: js.Array[scala.Nothing]): Self = this.set("binaryListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: SQSMessageAttributeDataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringListValuesVarargs(value: scala.Nothing*): Self = this.set("stringListValues", js.Array(value :_*))
    
    @scala.inline
    def setStringListValues(value: js.Array[scala.Nothing]): Self = this.set("stringListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValue(value: String): Self = this.set("binaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryValue: Self = this.set("binaryValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
