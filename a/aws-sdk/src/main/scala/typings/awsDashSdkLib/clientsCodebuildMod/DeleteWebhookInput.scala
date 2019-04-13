package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWebhookInput extends js.Object {
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: ProjectName
}

object DeleteWebhookInput {
  @scala.inline
  def apply(projectName: ProjectName): DeleteWebhookInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
  
    __obj.asInstanceOf[DeleteWebhookInput]
  }
}

