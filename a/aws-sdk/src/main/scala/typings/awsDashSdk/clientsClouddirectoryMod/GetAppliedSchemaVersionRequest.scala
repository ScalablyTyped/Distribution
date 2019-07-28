package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppliedSchemaVersionRequest extends js.Object {
  /**
    * The ARN of the applied schema.
    */
  var SchemaArn: Arn
}

object GetAppliedSchemaVersionRequest {
  @scala.inline
  def apply(SchemaArn: Arn): GetAppliedSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[GetAppliedSchemaVersionRequest]
  }
}

