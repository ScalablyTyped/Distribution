package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string
  /**
    * The semantic version of the application to get.
    */
  var SemanticVersion: js.UndefOr[__string] = js.undefined
}

object GetApplicationRequest {
  @scala.inline
  def apply(ApplicationId: __string, SemanticVersion: __string = null): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion)
    __obj.asInstanceOf[GetApplicationRequest]
  }
}

