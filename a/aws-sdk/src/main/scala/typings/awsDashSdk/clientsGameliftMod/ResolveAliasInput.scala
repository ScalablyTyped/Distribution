package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveAliasInput extends js.Object {
  /**
    * The unique identifier of the alias that you want to retrieve a fleet ID for. You can use either the alias ID or ARN value.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId = js.native
}

object ResolveAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): ResolveAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveAliasInput]
  }
}

