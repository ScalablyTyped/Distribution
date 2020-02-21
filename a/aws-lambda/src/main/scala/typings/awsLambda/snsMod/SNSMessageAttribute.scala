package typings.awsLambda.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SNSMessageAttribute extends js.Object {
  var Type: String
  var Value: String
}

object SNSMessageAttribute {
  @scala.inline
  def apply(Type: String, Value: String): SNSMessageAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SNSMessageAttribute]
  }
}

