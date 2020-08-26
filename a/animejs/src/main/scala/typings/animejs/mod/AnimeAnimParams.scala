package typings.animejs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeAnimParams
  extends AnimeCallBack
     with /* AnyAnimatedProperty */ StringDictionary[js.Any] {
  var delay: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var duration: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var easing: js.UndefOr[
    EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
  ] = js.native
  var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.native
  var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.native
  var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.native
  var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.native
}

object AnimeAnimParams {
  @scala.inline
  def apply(): AnimeAnimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimeAnimParams]
  }
  @scala.inline
  implicit class AnimeAnimParamsOps[Self <: AnimeAnimParams] (val x: Self) extends AnyVal {
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
    def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("delay", js.Any.fromFunction3(value))
    @scala.inline
    def setDelay(value: Double | FunctionBasedParameter): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("duration", js.Any.fromFunction3(value))
    @scala.inline
    def setDuration(value: Double | FunctionBasedParameter): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasingFunction1(value: /* el */ HTMLElement => String): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def setEasingFunction3(
      value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
    ): Self = this.set("easing", js.Any.fromFunction3(value))
    @scala.inline
    def setEasing(
      value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
    ): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("elasticity", js.Any.fromFunction3(value))
    @scala.inline
    def setElasticity(value: Double | FunctionBasedParameter): Self = this.set("elasticity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticity: Self = this.set("elasticity", js.undefined)
    @scala.inline
    def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("endDelay", js.Any.fromFunction3(value))
    @scala.inline
    def setEndDelay(value: Double | FunctionBasedParameter): Self = this.set("endDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDelay: Self = this.set("endDelay", js.undefined)
    @scala.inline
    def setKeyframesVarargs(value: AnimeAnimParams*): Self = this.set("keyframes", js.Array(value :_*))
    @scala.inline
    def setKeyframes(value: js.Array[AnimeAnimParams]): Self = this.set("keyframes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyframes: Self = this.set("keyframes", js.undefined)
    @scala.inline
    def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = this.set("round", js.Any.fromFunction3(value))
    @scala.inline
    def setRound(value: Double | Boolean | FunctionBasedParameter): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: AnimeTarget*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setTargetsNull: Self = this.set("targets", null)
  }
  
}

