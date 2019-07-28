package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteBuildsInput extends js.Object {
  /**
    * The IDs of the builds to delete.
    */
  var ids: BuildIds
}

object BatchDeleteBuildsInput {
  @scala.inline
  def apply(ids: BuildIds): BatchDeleteBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids)
  
    __obj.asInstanceOf[BatchDeleteBuildsInput]
  }
}

