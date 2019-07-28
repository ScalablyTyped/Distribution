package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSchemaAsJsonRequest extends js.Object {
  /**
    * The ARN of the schema to retrieve.
    */
  var SchemaArn: Arn
}

object GetSchemaAsJsonRequest {
  @scala.inline
  def apply(SchemaArn: Arn): GetSchemaAsJsonRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[GetSchemaAsJsonRequest]
  }
}

