package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotChannelAssociationResponse extends js.Object {
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: js.UndefOr[AliasName] = js.undefined
  /**
    * Provides information that the messaging platform needs to communicate with the Amazon Lex bot.
    */
  var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.undefined
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  /**
    * The date that the association between the bot and the channel was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the association between the bot and the channel.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  /**
    * The name of the association between the bot and the channel.
    */
  var name: js.UndefOr[BotChannelName] = js.undefined
  /**
    * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
    */
  var status: js.UndefOr[ChannelStatus] = js.undefined
  /**
    * The type of the messaging platform.
    */
  var `type`: js.UndefOr[ChannelType] = js.undefined
}

object GetBotChannelAssociationResponse {
  @scala.inline
  def apply(
    botAlias: AliasName = null,
    botConfiguration: ChannelConfigurationMap = null,
    botName: BotName = null,
    createdDate: Timestamp = null,
    description: Description = null,
    failureReason: String = null,
    name: BotChannelName = null,
    status: ChannelStatus = null,
    `type`: ChannelType = null
  ): GetBotChannelAssociationResponse = {
    val __obj = js.Dynamic.literal()
    if (botAlias != null) __obj.updateDynamic("botAlias")(botAlias)
    if (botConfiguration != null) __obj.updateDynamic("botConfiguration")(botConfiguration)
    if (botName != null) __obj.updateDynamic("botName")(botName)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotChannelAssociationResponse]
  }
}

