package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  /**
    * The list of audio messages.
    */
  var AudioList: js.UndefOr[AudioList] = js.undefined
  /**
    * The list of SSML messages.
    */
  var SsmlList: js.UndefOr[SsmlList] = js.undefined
  /**
    * The list of text messages.
    */
  var TextList: js.UndefOr[TextList] = js.undefined
}

object Content {
  @scala.inline
  def apply(AudioList: AudioList = null, SsmlList: SsmlList = null, TextList: TextList = null): Content = {
    val __obj = js.Dynamic.literal()
    if (AudioList != null) __obj.updateDynamic("AudioList")(AudioList)
    if (SsmlList != null) __obj.updateDynamic("SsmlList")(SsmlList)
    if (TextList != null) __obj.updateDynamic("TextList")(TextList)
    __obj.asInstanceOf[Content]
  }
}

