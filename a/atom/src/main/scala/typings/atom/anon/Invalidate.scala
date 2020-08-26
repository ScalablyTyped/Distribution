package typings.atom.anon

import typings.atom.atomStrings.backward
import typings.atom.atomStrings.closest
import typings.atom.atomStrings.forward
import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalidate extends js.Object {
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
}

object Invalidate {
  @scala.inline
  def apply(): Invalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalidate]
  }
  @scala.inline
  implicit class InvalidateOps[Self <: Invalidate] (val x: Self) extends AnyVal {
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
    def setClipDirection(value: backward | forward | closest): Self = this.set("clipDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipDirection: Self = this.set("clipDirection", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
  }
  
}

