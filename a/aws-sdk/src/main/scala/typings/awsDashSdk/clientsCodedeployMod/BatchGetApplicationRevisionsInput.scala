package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetApplicationRevisionsInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application about which to get revision information.
    */
  var applicationName: ApplicationName = js.native
  /**
    * An array of RevisionLocation objects that specify information to get about the application revisions, including type and location. The maximum number of RevisionLocation objects you can specify is 25.
    */
  var revisions: RevisionLocationList = js.native
}

object BatchGetApplicationRevisionsInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revisions: RevisionLocationList): BatchGetApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revisions = revisions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetApplicationRevisionsInput]
  }
}

