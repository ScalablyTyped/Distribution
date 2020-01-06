package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetSchema extends js.Object {
  /**
    * The date and time (in Unix time) that the schema was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The date and time (in Unix time) that the schema was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the schema.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The schema.
    */
  var schema: js.UndefOr[AvroSchema] = js.native
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}

object DatasetSchema {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    schema: AvroSchema = null,
    schemaArn: Arn = null
  ): DatasetSchema = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetSchema]
  }
}

