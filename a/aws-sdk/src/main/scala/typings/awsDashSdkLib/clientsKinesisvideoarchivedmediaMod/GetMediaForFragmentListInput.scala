package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMediaForFragmentListInput extends js.Object {
  /**
    * A list of the numbers of fragments for which to retrieve media. You retrieve these values with ListFragments.
    */
  var Fragments: FragmentNumberList
  /**
    * The name of the stream from which to retrieve fragment media.
    */
  var StreamName: awsDashSdkLib.clientsKinesisvideoarchivedmediaMod.StreamName
}

object GetMediaForFragmentListInput {
  @scala.inline
  def apply(Fragments: FragmentNumberList, StreamName: StreamName): GetMediaForFragmentListInput = {
    val __obj = js.Dynamic.literal(Fragments = Fragments, StreamName = StreamName)
  
    __obj.asInstanceOf[GetMediaForFragmentListInput]
  }
}

