package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistributionDomainName extends js.Object {
  val distributionDomainName: String
  val distributionId: String
}

object AnonDistributionDomainName {
  @scala.inline
  def apply(distributionDomainName: String, distributionId: String): AnonDistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDistributionDomainName]
  }
}

