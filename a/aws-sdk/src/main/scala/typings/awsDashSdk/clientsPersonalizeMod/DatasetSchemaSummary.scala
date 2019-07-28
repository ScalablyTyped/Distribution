package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetSchemaSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the schema was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time (in Unix time) that the schema was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the schema.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.undefined
}

object DatasetSchemaSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    schemaArn: Arn = null
  ): DatasetSchemaSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (schemaArn != null) __obj.updateDynamic("schemaArn")(schemaArn)
    __obj.asInstanceOf[DatasetSchemaSummary]
  }
}

