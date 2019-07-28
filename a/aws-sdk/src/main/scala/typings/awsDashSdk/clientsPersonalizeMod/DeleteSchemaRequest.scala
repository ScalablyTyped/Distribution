package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSchemaRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the schema to delete.
    */
  var schemaArn: Arn
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(schemaArn: Arn): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn)
  
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

