package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentDescriptionsMessage extends js.Object {
  /**
    *  Returns an EnvironmentDescription list. 
    */
  var Environments: js.UndefOr[EnvironmentDescriptionsList] = js.native
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object EnvironmentDescriptionsMessage {
  @scala.inline
  def apply(Environments: EnvironmentDescriptionsList = null, NextToken: Token = null): EnvironmentDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Environments != null) __obj.updateDynamic("Environments")(Environments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDescriptionsMessage]
  }
}

