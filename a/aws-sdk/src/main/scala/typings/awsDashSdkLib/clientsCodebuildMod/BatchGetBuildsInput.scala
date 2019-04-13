package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetBuildsInput extends js.Object {
  /**
    * The IDs of the builds.
    */
  var ids: BuildIds
}

object BatchGetBuildsInput {
  @scala.inline
  def apply(ids: BuildIds): BatchGetBuildsInput = {
    val __obj = js.Dynamic.literal(ids = ids)
  
    __obj.asInstanceOf[BatchGetBuildsInput]
  }
}

