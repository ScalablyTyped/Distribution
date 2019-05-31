package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * 
    List of ConfigurationRevision objects.
    
    */
  var Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
}

object ListConfigurationRevisionsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Revisions: __listOfConfigurationRevision = null): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions)
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
}

