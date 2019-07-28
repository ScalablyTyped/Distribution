package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelatedFinding extends js.Object {
  /**
    * The product-generated identifier for a related finding.
    */
  var Id: NonEmptyString
  /**
    * The ARN of the product that generated a related finding.
    */
  var ProductArn: NonEmptyString
}

object RelatedFinding {
  @scala.inline
  def apply(Id: NonEmptyString, ProductArn: NonEmptyString): RelatedFinding = {
    val __obj = js.Dynamic.literal(Id = Id, ProductArn = ProductArn)
  
    __obj.asInstanceOf[RelatedFinding]
  }
}

