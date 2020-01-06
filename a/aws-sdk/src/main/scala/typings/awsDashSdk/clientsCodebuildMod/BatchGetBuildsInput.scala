package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetBuildsInput extends js.Object {
  /**
    * The IDs of the builds.
    */
  var ids: BuildIds = js.native
}

object BatchGetBuildsInput {
  @scala.inline
  def apply(ids: BuildIds): BatchGetBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetBuildsInput]
  }
}

