package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortConfig extends js.Object {
  /**
    * The list of abort criteria to define rules to abort the job.
    */
  var criteriaList: AbortCriteriaList
}

object AbortConfig {
  @scala.inline
  def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList)
  
    __obj.asInstanceOf[AbortConfig]
  }
}

