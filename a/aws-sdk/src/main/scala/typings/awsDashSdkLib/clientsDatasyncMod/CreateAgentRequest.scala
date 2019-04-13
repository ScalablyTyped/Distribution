package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentRequest extends js.Object {
  /**
    * Your agent activation key. You can get the activation key either by sending an HTTP GET request with redirects that enable you to get the agent IP address (port 80). Alternatively, you can get it from the AWS DataSync console.  The redirect URL returned in the response provides you the activation key for your agent in the query string parameter activationKey. It might also include other activation-related parameters; however, these are merely defaults. The arguments you pass to this API call determine the actual configuration of your agent. For more information, see Activating a Sync Agent in the AWS DataSync User Guide. 
    */
  var ActivationKey: awsDashSdkLib.clientsDatasyncMod.ActivationKey
  /**
    * The name you configured for your agent. This value is a text reference that is used to identify the agent in the console.
    */
  var AgentName: js.UndefOr[TagValue] = js.undefined
  /**
    * The key-value pair that represents the tag you want to associate with the agent. The value can be an empty string. This value helps you manage, filter, and search for your agents.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @.  
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateAgentRequest {
  @scala.inline
  def apply(ActivationKey: ActivationKey, AgentName: TagValue = null, Tags: TagList = null): CreateAgentRequest = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey)
    if (AgentName != null) __obj.updateDynamic("AgentName")(AgentName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateAgentRequest]
  }
}

