package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEmailPart extends js.Object {
  /**
    * The applicable character set for the message content.
    */
  var Charset: js.UndefOr[__string] = js.undefined
  /**
    * The textual data of the message content.
    */
  var Data: js.UndefOr[__string] = js.undefined
}

object SimpleEmailPart {
  @scala.inline
  def apply(Charset: __string = null, Data: __string = null): SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    if (Charset != null) __obj.updateDynamic("Charset")(Charset)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[SimpleEmailPart]
  }
}

