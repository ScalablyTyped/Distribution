package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  
  /**
    * Either the JSON Schema content or the Amazon Resource Name (ARN) of an AWS Lambda function.
    */
  var Content: StringWithLengthBetween0And32768 = js.native
  
  /**
    * AppConfig supports validators of type JSON_SCHEMA and LAMBDA 
    */
  var Type: ValidatorType = js.native
}
object Validator {
  
  @scala.inline
  def apply(Content: StringWithLengthBetween0And32768, Type: ValidatorType): Validator = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit class ValidatorOps[Self <: Validator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: StringWithLengthBetween0And32768): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ValidatorType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
