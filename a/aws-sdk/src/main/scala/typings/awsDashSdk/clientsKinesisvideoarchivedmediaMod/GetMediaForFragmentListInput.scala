package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMediaForFragmentListInput extends js.Object {
  /**
    * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
    */
  var Fragments: FragmentNumberList = js.native
  /**
    * The name of the stream from which to retrieve fragment media.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.StreamName = js.native
}

object GetMediaForFragmentListInput {
  @scala.inline
  def apply(Fragments: FragmentNumberList, StreamName: StreamName): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
}

