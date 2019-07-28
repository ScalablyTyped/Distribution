package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveAliasInput extends js.Object {
  /**
    * Unique identifier for the alias you want to resolve.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId
}

object ResolveAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): ResolveAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId)
  
    __obj.asInstanceOf[ResolveAliasInput]
  }
}

