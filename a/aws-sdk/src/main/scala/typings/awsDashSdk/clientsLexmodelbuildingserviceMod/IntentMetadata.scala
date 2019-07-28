package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentMetadata extends js.Object {
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The date that the intent was updated. When you create an intent, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.undefined
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object IntentMetadata {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: IntentName = null,
    version: Version = null
  ): IntentMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IntentMetadata]
  }
}

