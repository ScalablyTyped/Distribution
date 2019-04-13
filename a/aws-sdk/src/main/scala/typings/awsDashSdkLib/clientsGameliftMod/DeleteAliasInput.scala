package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAliasInput extends js.Object {
  /**
    * Unique identifier for a fleet alias. Specify the alias you want to delete.
    */
  var AliasId: awsDashSdkLib.clientsGameliftMod.AliasId
}

object DeleteAliasInput {
  @scala.inline
  def apply(AliasId: AliasId): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId)
  
    __obj.asInstanceOf[DeleteAliasInput]
  }
}

