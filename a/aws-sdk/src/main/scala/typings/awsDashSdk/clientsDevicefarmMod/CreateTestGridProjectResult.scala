package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridProjectResult extends js.Object {
  /**
    * ARN of the Selenium testing project that was created.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.native
}

object CreateTestGridProjectResult {
  @scala.inline
  def apply(testGridProject: TestGridProject = null): CreateTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    if (testGridProject != null) __obj.updateDynamic("testGridProject")(testGridProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridProjectResult]
  }
}

