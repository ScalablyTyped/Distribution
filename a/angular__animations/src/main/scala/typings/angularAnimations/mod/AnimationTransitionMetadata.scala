package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationTransitionMetadata extends AnimationMetadata {
  /**
    * One or more animation objects to which this transition applies.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  /**
    * An expression that describes a state change.
    */
  var expr: String | (js.Function4[
    /* fromState */ String, 
    /* toState */ String, 
    /* element */ js.UndefOr[js.Any], 
    /* params */ js.UndefOr[StringDictionary[js.Any]], 
    Boolean
  ]) = js.native
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
}

object AnimationTransitionMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    expr: String | (js.Function4[
      /* fromState */ String, 
      /* toState */ String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ]),
    `type`: AnimationMetadataType
  ): AnimationTransitionMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransitionMetadata]
  }
  @scala.inline
  implicit class AnimationTransitionMetadataOps[Self <: AnimationTransitionMetadata] (val x: Self) extends AnyVal {
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
    def setAnimationVarargs(value: AnimationMetadata*): Self = this.set("animation", js.Array(value :_*))
    @scala.inline
    def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setExprFunction4(
      value: (/* fromState */ String, /* toState */ String, /* element */ js.UndefOr[js.Any], /* params */ js.UndefOr[StringDictionary[js.Any]]) => Boolean
    ): Self = this.set("expr", js.Any.fromFunction4(value))
    @scala.inline
    def setExpr(
      value: String | (js.Function4[
          /* fromState */ String, 
          /* toState */ String, 
          /* element */ js.UndefOr[js.Any], 
          /* params */ js.UndefOr[StringDictionary[js.Any]], 
          Boolean
        ])
    ): Self = this.set("expr", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AnimationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
  }
  
}

