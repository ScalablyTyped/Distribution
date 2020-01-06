package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAliasInput extends js.Object {
  /**
    * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN value. 
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId = js.native
}

object DescribeAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAliasInput]
  }
}

