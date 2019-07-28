package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SalesforceAction extends js.Object {
  /**
    * The token used to authenticate access to the Salesforce IoT Cloud Input Stream. The token is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var token: SalesforceToken
  /**
    * The URL exposed by the Salesforce IoT Cloud Input Stream. The URL is available from the Salesforce IoT Cloud platform after creation of the Input Stream.
    */
  var url: SalesforceEndpoint
}

object SalesforceAction {
  @scala.inline
  def apply(token: SalesforceToken, url: SalesforceEndpoint): SalesforceAction = {
    val __obj = js.Dynamic.literal(token = token, url = url)
  
    __obj.asInstanceOf[SalesforceAction]
  }
}

