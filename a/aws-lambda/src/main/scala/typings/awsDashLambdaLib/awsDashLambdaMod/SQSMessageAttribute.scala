package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSMessageAttribute extends js.Object {
  var Name: java.lang.String
  var Type: java.lang.String
  var Value: java.lang.String
}

object SQSMessageAttribute {
  @scala.inline
  def apply(Name: java.lang.String, Type: java.lang.String, Value: java.lang.String): SQSMessageAttribute = {
    val __obj = js.Dynamic.literal(Name = Name, Type = Type, Value = Value)
  
    __obj.asInstanceOf[SQSMessageAttribute]
  }
}

