package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBuildInput extends js.Object {
  /**
    * Unique identifier for a build to delete.
    */
  var BuildId: awsDashSdkLib.clientsGameliftMod.BuildId
}

object DeleteBuildInput {
  @scala.inline
  def apply(BuildId: BuildId): DeleteBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId)
  
    __obj.asInstanceOf[DeleteBuildInput]
  }
}

