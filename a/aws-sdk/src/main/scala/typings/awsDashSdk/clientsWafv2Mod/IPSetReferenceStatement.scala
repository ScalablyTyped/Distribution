package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetReferenceStatement extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IPSet that this statement references.
    */
  var ARN: ResourceArn = js.native
}

object IPSetReferenceStatement {
  @scala.inline
  def apply(ARN: ResourceArn): IPSetReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPSetReferenceStatement]
  }
}

