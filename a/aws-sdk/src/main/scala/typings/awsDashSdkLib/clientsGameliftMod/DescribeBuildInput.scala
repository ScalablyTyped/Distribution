package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBuildInput extends js.Object {
  /**
    * Unique identifier for a build to retrieve properties for.
    */
  var BuildId: awsDashSdkLib.clientsGameliftMod.BuildId
}

object DescribeBuildInput {
  @scala.inline
  def apply(BuildId: BuildId): DescribeBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId)
  
    __obj.asInstanceOf[DescribeBuildInput]
  }
}

