package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDependencySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the nested application.
    */
  var ApplicationId: __string = js.native
  /**
    * The semantic version of the nested application.
    */
  var SemanticVersion: __string = js.native
}

object ApplicationDependencySummary {
  @scala.inline
  def apply(ApplicationId: __string, SemanticVersion: __string): ApplicationDependencySummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationDependencySummary]
  }
}

