package typings.androiduix.androiduiNs.imageNs.NetDrawableNs

import typings.androiduix.androiduiNs.imageNs.NetDrawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadListener extends js.Object {
  def onError(drawable: NetDrawable): js.Any
  def onLoad(drawable: NetDrawable): js.Any
}

object LoadListener {
  @scala.inline
  def apply(onError: NetDrawable => js.Any, onLoad: NetDrawable => js.Any): LoadListener = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onLoad = js.Any.fromFunction1(onLoad))
  
    __obj.asInstanceOf[LoadListener]
  }
}

