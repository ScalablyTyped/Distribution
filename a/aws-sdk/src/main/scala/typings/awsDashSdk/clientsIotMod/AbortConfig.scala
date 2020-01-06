package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortConfig extends js.Object {
  /**
    * The list of abort criteria to define rules to abort the job.
    */
  var criteriaList: AbortCriteriaList = js.native
}

object AbortConfig {
  @scala.inline
  def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbortConfig]
  }
}

