package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * 
    List of ConfigurationRevision objects.
    
    */
  var Revisions: js.UndefOr[__listOfConfigurationRevision] = js.native
}

object ListConfigurationRevisionsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Revisions: __listOfConfigurationRevision = null): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
}

