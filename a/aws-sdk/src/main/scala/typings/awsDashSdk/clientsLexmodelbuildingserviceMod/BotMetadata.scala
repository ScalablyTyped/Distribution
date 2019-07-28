package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BotMetadata extends js.Object {
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the bot. 
    */
  var name: js.UndefOr[BotName] = js.undefined
  /**
    * The status of the bot.
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object BotMetadata {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: BotName = null,
    status: Status = null,
    version: Version = null
  ): BotMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[BotMetadata]
  }
}

