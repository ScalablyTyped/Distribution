package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiTransformOptions[S, D] extends TransformOptions[S, D] {
  var multiTransform: js.UndefOr[js.Function1[/* item */ S, AsyncIterator[D]]] = js.native
}

object MultiTransformOptions {
  @scala.inline
  def apply[S, D](): MultiTransformOptions[S, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiTransformOptions[S, D]]
  }
  @scala.inline
  implicit class MultiTransformOptionsOps[Self <: MultiTransformOptions[_, _], S, D] (val x: Self with (MultiTransformOptions[S, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMultiTransform(value: /* item */ S => AsyncIterator[D]): Self = this.set("multiTransform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMultiTransform: Self = this.set("multiTransform", js.undefined)
  }
  
}

