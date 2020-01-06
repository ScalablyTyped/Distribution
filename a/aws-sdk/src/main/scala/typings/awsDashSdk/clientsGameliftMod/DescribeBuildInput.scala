package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBuildInput extends js.Object {
  /**
    * A unique identifier for a build to retrieve properties for. You can use either the build ID or ARN value. 
    */
  var BuildId: typings.awsDashSdk.clientsGameliftMod.BuildId = js.native
}

object DescribeBuildInput {
  @scala.inline
  def apply(BuildId: BuildId): DescribeBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeBuildInput]
  }
}

