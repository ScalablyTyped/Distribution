package typings.angularAnimations.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.anon.Params
import typings.angularAnimations.mod.^
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def AUTO_STYLE: /* "*" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("AUTO_STYLE").asInstanceOf[/* "*" */ String]

inline def animate(timings: String): AnimationAnimateMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any]).asInstanceOf[AnimationAnimateMetadata]
inline def animate(timings: String, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[AnimationAnimateMetadata]
inline def animate(timings: String, styles: AnimationStyleMetadata): AnimationAnimateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[AnimationAnimateMetadata]
inline def animate(timings: Double): AnimationAnimateMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any]).asInstanceOf[AnimationAnimateMetadata]
inline def animate(timings: Double, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[AnimationAnimateMetadata]
inline def animate(timings: Double, styles: AnimationStyleMetadata): AnimationAnimateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(timings.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[AnimationAnimateMetadata]

inline def animateChild(): AnimationAnimateChildMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animateChild")().asInstanceOf[AnimationAnimateChildMetadata]
inline def animateChild(options: AnimateChildOptions): AnimationAnimateChildMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animateChild")(options.asInstanceOf[js.Any]).asInstanceOf[AnimationAnimateChildMetadata]

inline def animation(steps: js.Array[AnimationMetadata]): AnimationReferenceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any]).asInstanceOf[AnimationReferenceMetadata]
inline def animation(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationReferenceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationReferenceMetadata]
inline def animation(steps: AnimationMetadata): AnimationReferenceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any]).asInstanceOf[AnimationReferenceMetadata]
inline def animation(steps: AnimationMetadata, options: AnimationOptions): AnimationReferenceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationReferenceMetadata]

inline def group(steps: js.Array[AnimationMetadata]): AnimationGroupMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(steps.asInstanceOf[js.Any]).asInstanceOf[AnimationGroupMetadata]
inline def group(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationGroupMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationGroupMetadata]

inline def keyframes(steps: js.Array[AnimationStyleMetadata]): AnimationKeyframesSequenceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(steps.asInstanceOf[js.Any]).asInstanceOf[AnimationKeyframesSequenceMetadata]

inline def query(selector: String, animation: js.Array[AnimationMetadata]): AnimationQueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationQueryMetadata]
inline def query(selector: String, animation: js.Array[AnimationMetadata], options: AnimationQueryOptions): AnimationQueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationQueryMetadata]
inline def query(selector: String, animation: AnimationMetadata): AnimationQueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationQueryMetadata]
inline def query(selector: String, animation: AnimationMetadata, options: AnimationQueryOptions): AnimationQueryMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationQueryMetadata]

inline def sequence(steps: js.Array[AnimationMetadata]): AnimationSequenceMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(steps.asInstanceOf[js.Any]).asInstanceOf[AnimationSequenceMetadata]
inline def sequence(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationSequenceMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationSequenceMetadata]

inline def stagger(timings: String, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationStaggerMetadata]
inline def stagger(timings: String, animation: AnimationMetadata): AnimationStaggerMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationStaggerMetadata]
inline def stagger(timings: Double, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationStaggerMetadata]
inline def stagger(timings: Double, animation: AnimationMetadata): AnimationStaggerMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(timings.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[AnimationStaggerMetadata]

inline def state(name: String, styles: AnimationStyleMetadata): AnimationStateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("state")(name.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[AnimationStateMetadata]
inline def state(name: String, styles: AnimationStyleMetadata, options: Params): AnimationStateMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("state")(name.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationStateMetadata]

@scala.annotation.targetName("style_")
inline def style(tokens: "*"): AnimationStyleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[AnimationStyleMetadata]
@scala.annotation.targetName("style_")
inline def style(tokens: js.Array["*" | (StringDictionary[String | Double])]): AnimationStyleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[AnimationStyleMetadata]
inline def style(tokens: StringDictionary[String | Double]): AnimationStyleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(tokens.asInstanceOf[js.Any]).asInstanceOf[AnimationStyleMetadata]

inline def transition(stateChangeExpr: String, steps: js.Array[AnimationMetadata]): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(stateChangeExpr: String, steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(stateChangeExpr: String, steps: AnimationMetadata): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(stateChangeExpr: String, steps: AnimationMetadata, options: AnimationOptions): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(
  stateChangeExpr: js.Function4[
  /* fromState */ String, 
  /* toState */ String, 
  js.UndefOr[Any], 
  js.UndefOr[StringDictionary[Any]], 
  Boolean
],
  steps: js.Array[AnimationMetadata]
): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(
  stateChangeExpr: js.Function4[
  /* fromState */ String, 
  /* toState */ String, 
  /* element */ js.UndefOr[Any], 
  /* params */ js.UndefOr[StringDictionary[Any]], 
  Boolean
],
  steps: js.Array[AnimationMetadata],
  options: AnimationOptions
): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(
  stateChangeExpr: js.Function4[
  /* fromState */ String, 
  /* toState */ String, 
  js.UndefOr[Any], 
  js.UndefOr[StringDictionary[Any]], 
  Boolean
],
  steps: AnimationMetadata
): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]
inline def transition(
  stateChangeExpr: js.Function4[
  /* fromState */ String, 
  /* toState */ String, 
  /* element */ js.UndefOr[Any], 
  /* params */ js.UndefOr[StringDictionary[Any]], 
  Boolean
],
  steps: AnimationMetadata,
  options: AnimationOptions
): AnimationTransitionMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("transition")(stateChangeExpr.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationTransitionMetadata]

inline def trigger(name: String, definitions: js.Array[AnimationMetadata]): AnimationTriggerMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[AnimationTriggerMetadata]

inline def useAnimation(animation: AnimationReferenceMetadata): AnimationAnimateRefMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimation")(animation.asInstanceOf[js.Any]).asInstanceOf[AnimationAnimateRefMetadata]
inline def useAnimation(animation: AnimationReferenceMetadata, options: AnimationOptions): AnimationAnimateRefMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimation")(animation.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AnimationAnimateRefMetadata]

inline def ɵPRESTYLE: /* "!" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PRE_STYLE").asInstanceOf[/* "!" */ String]

type AnimationMetadataType = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12

type ɵStyleData = StringDictionary[String | Double]

type ɵStyleDataMap = Map[String, String | Double]
