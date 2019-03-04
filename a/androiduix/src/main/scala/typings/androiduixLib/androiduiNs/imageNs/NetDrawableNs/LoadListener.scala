package typings
package androiduixLib.androiduiNs.imageNs.NetDrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadListener extends js.Object {
  def onError(drawable: androiduixLib.androiduiNs.imageNs.NetDrawable): js.Any
  def onLoad(drawable: androiduixLib.androiduiNs.imageNs.NetDrawable): js.Any
}

object LoadListener {
  @scala.inline
  def apply(
    onError: js.Function1[androiduixLib.androiduiNs.imageNs.NetDrawable, js.Any],
    onLoad: js.Function1[androiduixLib.androiduiNs.imageNs.NetDrawable, js.Any]
  ): LoadListener = {
    val __obj = js.Dynamic.literal(onError = onError, onLoad = onLoad)
  
    __obj.asInstanceOf[LoadListener]
  }
}

