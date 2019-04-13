package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetApplicationRevisionsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application about which to get revision information.
    */
  var applicationName: ApplicationName
  /**
    * Information to get about the application revisions, including type and location.
    */
  var revisions: RevisionLocationList
}

object BatchGetApplicationRevisionsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revisions: RevisionLocationList): BatchGetApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, revisions = revisions)
  
    __obj.asInstanceOf[BatchGetApplicationRevisionsInput]
  }
}

