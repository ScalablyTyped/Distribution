package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSchemaFromJsonRequest extends js.Object {
  /**
    * The replacement JSON schema.
    */
  var Document: SchemaJsonDocument
  /**
    * The ARN of the schema to update.
    */
  var SchemaArn: Arn
}

object PutSchemaFromJsonRequest {
  @scala.inline
  def apply(Document: SchemaJsonDocument, SchemaArn: Arn): PutSchemaFromJsonRequest = {
    val __obj = js.Dynamic.literal(Document = Document, SchemaArn = SchemaArn)
  
    __obj.asInstanceOf[PutSchemaFromJsonRequest]
  }
}

