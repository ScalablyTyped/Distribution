package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(SchemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

