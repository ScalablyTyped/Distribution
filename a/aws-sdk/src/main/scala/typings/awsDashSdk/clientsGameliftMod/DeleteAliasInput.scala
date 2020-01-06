package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAliasInput extends js.Object {
  /**
    * A unique identifier of the alias that you want to delete. You can use either the alias ID or ARN value.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId = js.native
}

object DeleteAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAliasInput]
  }
}

