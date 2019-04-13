package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFragmentsOutput extends js.Object {
  /**
    * A list of archived Fragment objects from the stream that meet the selector criteria. Results are in no specific order, even across pages.
    */
  var Fragments: js.UndefOr[FragmentList] = js.undefined
  /**
    * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListFragmentsOutput {
  @scala.inline
  def apply(Fragments: FragmentList = null, NextToken: String = null): ListFragmentsOutput = {
    val __obj = js.Dynamic.literal()
    if (Fragments != null) __obj.updateDynamic("Fragments")(Fragments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFragmentsOutput]
  }
}

