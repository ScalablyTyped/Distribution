package typings.adone

import typings.adone.adoneNs.fsNs.INs.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingOptional extends js.Object {
  var encoding: js.UndefOr[Encoding] = js.undefined
}

object Anon_EncodingOptional {
  @scala.inline
  def apply(encoding: Encoding = null): Anon_EncodingOptional = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_EncodingOptional]
  }
}

