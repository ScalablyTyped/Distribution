package typings.awsDashSdk.clientsAppconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator extends js.Object {
  /**
    * Either the JSON Schema content or an AWS Lambda function name.
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
}

