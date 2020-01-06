package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckDescription extends js.Object {
  /**
    * The category of the Trusted Advisor check.
    */
  var category: String = js.native
  /**
    * The description of the Trusted Advisor check, which includes the alert criteria and recommended actions (contains HTML markup).
    */
  var description: String = js.native
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var id: String = js.native
  /**
    * The column headings for the data returned by the Trusted Advisor check. The order of the headings corresponds to the order of the data in the Metadata element of the TrustedAdvisorResourceDetail for the check. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data. 
    */
  var metadata: StringList = js.native
  /**
    * The display name for the Trusted Advisor check.
    */
  var name: String = js.native
}

object TrustedAdvisorCheckDescription {
  @scala.inline
  def apply(category: String, description: String, id: String, metadata: StringList, name: String): TrustedAdvisorCheckDescription = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrustedAdvisorCheckDescription]
  }
}

