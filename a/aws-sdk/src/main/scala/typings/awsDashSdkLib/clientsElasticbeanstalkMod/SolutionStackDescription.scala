package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionStackDescription extends js.Object {
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
}

object SolutionStackDescription {
  @scala.inline
  def apply(PermittedFileTypes: SolutionStackFileTypeList = null, SolutionStackName: SolutionStackName = null): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    if (PermittedFileTypes != null) __obj.updateDynamic("PermittedFileTypes")(PermittedFileTypes)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    __obj.asInstanceOf[SolutionStackDescription]
  }
}

