package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionStackDescription extends js.Object {
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.native
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.native
}

object SolutionStackDescription {
  @scala.inline
  def apply(PermittedFileTypes: SolutionStackFileTypeList = null, SolutionStackName: SolutionStackName = null): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    if (PermittedFileTypes != null) __obj.updateDynamic("PermittedFileTypes")(PermittedFileTypes.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionStackDescription]
  }
}

