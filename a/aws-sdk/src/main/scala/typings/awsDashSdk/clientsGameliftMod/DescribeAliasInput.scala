package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAliasInput extends js.Object {
  /**
    * Unique identifier for a fleet alias. Specify the alias you want to retrieve.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId
}

object DescribeAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId)
  
    __obj.asInstanceOf[DescribeAliasInput]
  }
}

