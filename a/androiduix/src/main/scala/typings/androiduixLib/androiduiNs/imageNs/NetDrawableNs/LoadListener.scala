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
    onError: androiduixLib.androiduiNs.imageNs.NetDrawable => js.Any,
    onLoad: androiduixLib.androiduiNs.imageNs.NetDrawable => js.Any
  ): LoadListener = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad))
  
    __obj.asInstanceOf[LoadListener]
  }
}

