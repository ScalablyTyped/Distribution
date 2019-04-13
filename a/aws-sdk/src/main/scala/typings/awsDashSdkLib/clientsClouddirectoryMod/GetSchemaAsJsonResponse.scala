package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSchemaAsJsonResponse extends js.Object {
  /**
    * The JSON representation of the schema document.
    */
  var Document: js.UndefOr[SchemaJsonDocument] = js.undefined
  /**
    * The name of the retrieved schema.
    */
  var Name: js.UndefOr[SchemaName] = js.undefined
}

object GetSchemaAsJsonResponse {
  @scala.inline
  def apply(Document: SchemaJsonDocument = null, Name: SchemaName = null): GetSchemaAsJsonResponse = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[GetSchemaAsJsonResponse]
  }
}

