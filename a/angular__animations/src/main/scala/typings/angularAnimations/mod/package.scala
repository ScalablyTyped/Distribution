package typings.angularAnimations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def AUTO_STYLE: /* "*" */ java.lang.String = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].selectDynamic("AUTO_STYLE").asInstanceOf[/* "*" */ java.lang.String]
  
  @scala.inline
  def animate(timings: java.lang.String): typings.angularAnimations.mod.AnimationAnimateMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  @scala.inline
  def animate(
    timings: java.lang.String,
    styles: typings.angularAnimations.mod.AnimationKeyframesSequenceMetadata
  ): typings.angularAnimations.mod.AnimationAnimateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  @scala.inline
  def animate(timings: java.lang.String, styles: typings.angularAnimations.mod.AnimationStyleMetadata): typings.angularAnimations.mod.AnimationAnimateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  @scala.inline
  def animate(timings: scala.Double): typings.angularAnimations.mod.AnimationAnimateMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  @scala.inline
  def animate(timings: scala.Double, styles: typings.angularAnimations.mod.AnimationKeyframesSequenceMetadata): typings.angularAnimations.mod.AnimationAnimateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  @scala.inline
  def animate(timings: scala.Double, styles: typings.angularAnimations.mod.AnimationStyleMetadata): typings.angularAnimations.mod.AnimationAnimateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateMetadata]
  
  @scala.inline
  def animateChild(): typings.angularAnimations.mod.AnimationAnimateChildMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animateChild")().asInstanceOf[typings.angularAnimations.mod.AnimationAnimateChildMetadata]
  @scala.inline
  def animateChild(options: typings.angularAnimations.mod.AnimateChildOptions): typings.angularAnimations.mod.AnimationAnimateChildMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animateChild")(options.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateChildMetadata]
  
  @scala.inline
  def animation(steps: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationReferenceMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationReferenceMetadata]
  @scala.inline
  def animation(
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationReferenceMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationReferenceMetadata]
  @scala.inline
  def animation(steps: typings.angularAnimations.mod.AnimationMetadata): typings.angularAnimations.mod.AnimationReferenceMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationReferenceMetadata]
  @scala.inline
  def animation(
    steps: typings.angularAnimations.mod.AnimationMetadata,
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationReferenceMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationReferenceMetadata]
  
  @scala.inline
  def group(steps: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationGroupMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("group")(steps.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationGroupMetadata]
  @scala.inline
  def group(
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationGroupMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("group")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationGroupMetadata]
  
  @scala.inline
  def keyframes(steps: js.Array[typings.angularAnimations.mod.AnimationStyleMetadata]): typings.angularAnimations.mod.AnimationKeyframesSequenceMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(steps.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationKeyframesSequenceMetadata]
  
  @scala.inline
  def query(selector: java.lang.String, animation: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationQueryMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationQueryMetadata]
  @scala.inline
  def query(
    selector: java.lang.String,
    animation: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationQueryOptions
  ): typings.angularAnimations.mod.AnimationQueryMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationQueryMetadata]
  @scala.inline
  def query(selector: java.lang.String, animation: typings.angularAnimations.mod.AnimationMetadata): typings.angularAnimations.mod.AnimationQueryMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationQueryMetadata]
  @scala.inline
  def query(
    selector: java.lang.String,
    animation: typings.angularAnimations.mod.AnimationMetadata,
    options: typings.angularAnimations.mod.AnimationQueryOptions
  ): typings.angularAnimations.mod.AnimationQueryMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationQueryMetadata]
  
  @scala.inline
  def sequence(steps: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationSequenceMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(steps.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationSequenceMetadata]
  @scala.inline
  def sequence(
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationSequenceMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationSequenceMetadata]
  
  @scala.inline
  def stagger(timings: java.lang.String, animation: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationStaggerMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStaggerMetadata]
  @scala.inline
  def stagger(timings: java.lang.String, animation: typings.angularAnimations.mod.AnimationMetadata): typings.angularAnimations.mod.AnimationStaggerMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStaggerMetadata]
  @scala.inline
  def stagger(timings: scala.Double, animation: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationStaggerMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStaggerMetadata]
  @scala.inline
  def stagger(timings: scala.Double, animation: typings.angularAnimations.mod.AnimationMetadata): typings.angularAnimations.mod.AnimationStaggerMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStaggerMetadata]
  
  @scala.inline
  def state(name: java.lang.String, styles: typings.angularAnimations.mod.AnimationStyleMetadata): typings.angularAnimations.mod.AnimationStateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("state")(name.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStateMetadata]
  @scala.inline
  def state(
    name: java.lang.String,
    styles: typings.angularAnimations.mod.AnimationStyleMetadata,
    options: typings.angularAnimations.anon.Params
  ): typings.angularAnimations.mod.AnimationStateMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("state")(name.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationStateMetadata]
  
  @scala.inline
  def style(
    tokens: js.Array[
      typings.angularAnimations.angularAnimationsStrings.Asterisk | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double])
    ]
  ): typings.angularAnimations.mod.AnimationStyleMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationStyleMetadata]
  @scala.inline
  def style(tokens: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]): typings.angularAnimations.mod.AnimationStyleMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationStyleMetadata]
  @scala.inline
  def style(tokens: typings.angularAnimations.angularAnimationsStrings.Asterisk): typings.angularAnimations.mod.AnimationStyleMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationStyleMetadata]
  
  @scala.inline
  def transition(
    stateChangeExpr: java.lang.String,
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata]
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: java.lang.String,
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(stateChangeExpr: java.lang.String, steps: typings.angularAnimations.mod.AnimationMetadata): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: java.lang.String,
    steps: typings.angularAnimations.mod.AnimationMetadata,
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      js.UndefOr[js.Any], 
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata]
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: js.Array[typings.angularAnimations.mod.AnimationMetadata],
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      js.UndefOr[js.Any], 
      js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: typings.angularAnimations.mod.AnimationMetadata
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  @scala.inline
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: typings.angularAnimations.mod.AnimationMetadata,
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationTransitionMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTransitionMetadata]
  
  @scala.inline
  def trigger(name: java.lang.String, definitions: js.Array[typings.angularAnimations.mod.AnimationMetadata]): typings.angularAnimations.mod.AnimationTriggerMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationTriggerMetadata]
  
  @scala.inline
  def useAnimation(animation: typings.angularAnimations.mod.AnimationReferenceMetadata): typings.angularAnimations.mod.AnimationAnimateRefMetadata = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAnimation")(animation.asInstanceOf[js.Any]).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateRefMetadata]
  @scala.inline
  def useAnimation(
    animation: typings.angularAnimations.mod.AnimationReferenceMetadata,
    options: typings.angularAnimations.mod.AnimationOptions
  ): typings.angularAnimations.mod.AnimationAnimateRefMetadata = (typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useAnimation")(animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularAnimations.mod.AnimationAnimateRefMetadata]
  
  @scala.inline
  def ɵPRESTYLE: /* "!" */ java.lang.String = typings.angularAnimations.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PRE_STYLE").asInstanceOf[/* "!" */ java.lang.String]
  
  type ɵStyleData = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
