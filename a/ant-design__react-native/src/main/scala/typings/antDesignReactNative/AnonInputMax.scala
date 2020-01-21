package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputMax extends js.Object {
  var max: Double
  var min: Double
  var onBlur: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onFocus: js.Function0[Unit]
  var parser: js.Function1[/* input */ String, String]
  var step: Double
}

object AnonInputMax {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    parser: /* input */ String => String,
    step: Double
  ): AnonInputMax = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputMax]
  }
}

