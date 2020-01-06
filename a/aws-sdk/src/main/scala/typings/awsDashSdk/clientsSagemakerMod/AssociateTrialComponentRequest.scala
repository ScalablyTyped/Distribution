package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateTrialComponentRequest extends js.Object {
  /**
    * The name of the component to associated with the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  /**
    * The name of the trial to associate with.
    */
  var TrialName: ExperimentEntityName = js.native
}

object AssociateTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): AssociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateTrialComponentRequest]
  }
}

