package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCampaignRequest extends js.Object {
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: TransactionsPerSecond
  /**
    * A name for the new campaign. The campaign name must be unique within your account.
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) of the solution version to deploy.
    */
  var solutionVersionArn: Arn
}

object CreateCampaignRequest {
  @scala.inline
  def apply(minProvisionedTPS: TransactionsPerSecond, name: Name, solutionVersionArn: Arn): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(minProvisionedTPS = minProvisionedTPS, name = name, solutionVersionArn = solutionVersionArn)
  
    __obj.asInstanceOf[CreateCampaignRequest]
  }
}

