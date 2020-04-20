package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import typings.androiduix.android.graphics.RectF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMatrixChangedListener extends js.Object {
  def onMatrixChanged(rect: RectF): Unit
}

object OnMatrixChangedListener {
  @scala.inline
  def apply(onMatrixChanged: RectF => Unit): OnMatrixChangedListener = {
    val __obj = js.Dynamic.literal(onMatrixChanged = js.Any.fromFunction1(onMatrixChanged))
    __obj.asInstanceOf[OnMatrixChangedListener]
  }
}

