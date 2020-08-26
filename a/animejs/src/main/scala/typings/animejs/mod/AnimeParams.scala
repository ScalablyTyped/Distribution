package typings.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.animejs.mod.AnimeCallBack because Already inherited
- typings.animejs.mod.AnimeInstanceParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined loop, autoplay, direction */ @js.native
trait AnimeParams extends AnimeAnimParams {
  var autoplay: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[DirectionOptions | String] = js.native
  var loop: js.UndefOr[Double | Boolean] = js.native
}

object AnimeParams {
  @scala.inline
  def apply(): AnimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeParams]
  }
  @scala.inline
  implicit class AnimeParamsOps[Self <: AnimeParams] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setDirection(value: DirectionOptions | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setLoop(value: Double | Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
  }
  
}

