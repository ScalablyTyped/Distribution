package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TtmlDestinationSettings extends js.Object {
  /**
    * When set to passthrough, passes through style and position information from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
    */
  var StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
}

object TtmlDestinationSettings {
  @scala.inline
  def apply(StyleControl: TtmlDestinationStyleControl = null): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (StyleControl != null) __obj.updateDynamic("StyleControl")(StyleControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
}

