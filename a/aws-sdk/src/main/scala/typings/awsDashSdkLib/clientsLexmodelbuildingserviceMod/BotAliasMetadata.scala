package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BotAliasMetadata extends js.Object {
  /**
    * The name of the bot to which the alias points.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  /**
    * The version of the Amazon Lex bot to which the alias points.
    */
  var botVersion: js.UndefOr[Version] = js.undefined
  /**
    * Checksum of the bot alias.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the bot alias.
    */
  var name: js.UndefOr[AliasName] = js.undefined
}

object BotAliasMetadata {
  @scala.inline
  def apply(
    botName: BotName = null,
    botVersion: Version = null,
    checksum: String = null,
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: AliasName = null
  ): BotAliasMetadata = {
    val __obj = js.Dynamic.literal()
    if (botName != null) __obj.updateDynamic("botName")(botName)
    if (botVersion != null) __obj.updateDynamic("botVersion")(botVersion)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BotAliasMetadata]
  }
}

