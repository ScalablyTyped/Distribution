package typings.asyncWriter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncWriterOptions extends js.Object {
  var buffer: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AsyncWriterOptions {
  @scala.inline
  def apply(buffer: js.UndefOr[Boolean] = js.undefined, global: StringDictionary[js.Any] = null): AsyncWriterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncWriterOptions]
  }
}

