package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSchemaRequest extends js.Object {
  /**
    * The name of the schema.
    */
  var Name: SchemaName
  /**
    * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object UpdateSchemaRequest {
  @scala.inline
  def apply(Name: SchemaName, SchemaArn: Arn): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
}

