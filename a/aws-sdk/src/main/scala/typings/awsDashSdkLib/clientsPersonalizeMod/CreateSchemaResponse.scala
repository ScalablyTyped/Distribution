package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSchemaResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.undefined
}

object CreateSchemaResponse {
  @scala.inline
  def apply(schemaArn: Arn = null): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn)
    __obj.asInstanceOf[CreateSchemaResponse]
  }
}

