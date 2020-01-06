package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedFinding extends js.Object {
  /**
    * The product-generated identifier for a related finding.
    */
  var Id: NonEmptyString = js.native
  /**
    * The ARN of the product that generated a related finding.
    */
  var ProductArn: NonEmptyString = js.native
}

object RelatedFinding {
  @scala.inline
  def apply(Id: NonEmptyString, ProductArn: NonEmptyString): RelatedFinding = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ProductArn = ProductArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelatedFinding]
  }
}

