package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobResponse extends js.Object {
  /**
    * The unique name that was provided for this job definition.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object CreateJobResponse {
  @scala.inline
  def apply(Name: NameString = null): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateJobResponse]
  }
}

