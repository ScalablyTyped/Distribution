package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorCheckDescription extends js.Object {
  /**
    * The category of the Trusted Advisor check.
    */
  var category: String
  /**
    * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains HTML markup).
    */
  var description: String
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var id: String
  /**
    * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to the order of the data in the Metadata element of the TrustedAdvisorResourceDetail for the check. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
    */
  var metadata: StringList
  /**
    * The display name for the Trusted Advisor check.
    */
  var name: String
}

object TrustedAdvisorCheckDescription {
  @scala.inline
  def apply(category: String, description: String, id: String, metadata: StringList, name: String): TrustedAdvisorCheckDescription = {
    val __obj = js.Dynamic.literal(category = category, description = description, id = id, metadata = metadata, name = name)
  
    __obj.asInstanceOf[TrustedAdvisorCheckDescription]
  }
}

