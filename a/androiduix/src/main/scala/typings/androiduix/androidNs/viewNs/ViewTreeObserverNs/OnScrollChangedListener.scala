package typings.androiduix.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScrollChangedListener extends js.Object {
  def onScrollChanged(): js.Any
}

object OnScrollChangedListener {
  @scala.inline
  def apply(onScrollChanged: () => js.Any): OnScrollChangedListener = {
    val __obj = js.Dynamic.literal(onScrollChanged = js.Any.fromFunction0(onScrollChanged))
  
    __obj.asInstanceOf[OnScrollChangedListener]
  }
}

