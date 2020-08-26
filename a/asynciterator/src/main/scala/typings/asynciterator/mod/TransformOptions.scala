package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions[S, D] extends TransformIteratorOptions[S] {
  var append: js.UndefOr[AsyncIteratorOrArray[D]] = js.native
  var filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var map: js.UndefOr[js.Function1[/* item */ S, D]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var prepend: js.UndefOr[AsyncIteratorOrArray[D]] = js.native
  var transform: js.UndefOr[
    js.Function3[
      /* item */ S, 
      /* done */ js.Function0[Unit], 
      /* push */ js.Function1[/* item */ D, Unit], 
      Unit
    ]
  ] = js.native
}

object TransformOptions {
  @scala.inline
  def apply[S, D](): TransformOptions[S, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions[S, D]]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions[_, _], S, D] (val x: Self with (TransformOptions[S, D])) extends AnyVal {
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
    def setAppendVarargs(value: D*): Self = this.set("append", js.Array(value :_*))
    @scala.inline
    def setAppend(value: AsyncIteratorOrArray[D]): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setFilter(value: /* item */ S => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMap(value: /* item */ S => D): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPrependVarargs(value: D*): Self = this.set("prepend", js.Array(value :_*))
    @scala.inline
    def setPrepend(value: AsyncIteratorOrArray[D]): Self = this.set("prepend", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepend: Self = this.set("prepend", js.undefined)
    @scala.inline
    def setTransform(
      value: (/* item */ S, /* done */ js.Function0[Unit], /* push */ js.Function1[/* item */ D, Unit]) => Unit
    ): Self = this.set("transform", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

