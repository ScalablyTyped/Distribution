package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDependencySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the nested application.
    */
  var ApplicationId: __string
  /**
    * The semantic version of the nested application.
    */
  var SemanticVersion: __string
}

object ApplicationDependencySummary {
  @scala.inline
  def apply(ApplicationId: __string, SemanticVersion: __string): ApplicationDependencySummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, SemanticVersion = SemanticVersion)
  
    __obj.asInstanceOf[ApplicationDependencySummary]
  }
}

