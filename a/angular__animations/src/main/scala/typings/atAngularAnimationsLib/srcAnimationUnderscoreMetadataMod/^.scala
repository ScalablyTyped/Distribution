package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/src/animation_metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AUTO_STYLE: atAngularAnimationsLib.atAngularAnimationsLibStrings.`*` = js.native
  def animate(timings: java.lang.String): AnimationAnimateMetadata = js.native
  def animate(timings: java.lang.String, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: java.lang.String, styles: AnimationStyleMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: scala.Double): AnimationAnimateMetadata = js.native
  def animate(timings: scala.Double, styles: AnimationKeyframesSequenceMetadata): AnimationAnimateMetadata = js.native
  def animate(timings: scala.Double, styles: AnimationStyleMetadata): AnimationAnimateMetadata = js.native
  def animateChild(): AnimationAnimateChildMetadata = js.native
  def animateChild(options: AnimateChildOptions): AnimationAnimateChildMetadata = js.native
  def animation(steps: AnimationMetadata): AnimationReferenceMetadata = js.native
  def animation(steps: AnimationMetadata, options: AnimationOptions): AnimationReferenceMetadata = js.native
  def animation(steps: js.Array[AnimationMetadata]): AnimationReferenceMetadata = js.native
  def animation(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationReferenceMetadata = js.native
  def group(steps: js.Array[AnimationMetadata]): AnimationGroupMetadata = js.native
  def group(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationGroupMetadata = js.native
  def keyframes(steps: js.Array[AnimationStyleMetadata]): AnimationKeyframesSequenceMetadata = js.native
  def query(selector: java.lang.String, animation: AnimationMetadata): AnimationQueryMetadata = js.native
  def query(selector: java.lang.String, animation: AnimationMetadata, options: AnimationQueryOptions): AnimationQueryMetadata = js.native
  def query(selector: java.lang.String, animation: js.Array[AnimationMetadata]): AnimationQueryMetadata = js.native
  def query(selector: java.lang.String, animation: js.Array[AnimationMetadata], options: AnimationQueryOptions): AnimationQueryMetadata = js.native
  def sequence(steps: js.Array[AnimationMetadata]): AnimationSequenceMetadata = js.native
  def sequence(steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationSequenceMetadata = js.native
  def stagger(timings: java.lang.String, animation: AnimationMetadata): AnimationStaggerMetadata = js.native
  def stagger(timings: java.lang.String, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = js.native
  def stagger(timings: scala.Double, animation: AnimationMetadata): AnimationStaggerMetadata = js.native
  def stagger(timings: scala.Double, animation: js.Array[AnimationMetadata]): AnimationStaggerMetadata = js.native
  def state(name: java.lang.String, styles: AnimationStyleMetadata): AnimationStateMetadata = js.native
  def state(name: java.lang.String, styles: AnimationStyleMetadata, options: atAngularAnimationsLib.Anon_Name): AnimationStateMetadata = js.native
  def style(tokens: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]): AnimationStyleMetadata = js.native
  @JSName("style")
  def `style_*`(tokens: atAngularAnimationsLib.atAngularAnimationsLibStrings.`*`): AnimationStyleMetadata = js.native
  @JSName("style")
  def `style_*`(
    tokens: js.Array[
      atAngularAnimationsLib.atAngularAnimationsLibStrings.`*` | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double])
    ]
  ): AnimationStyleMetadata = js.native
  def transition(stateChangeExpr: java.lang.String, steps: AnimationMetadata): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: java.lang.String, steps: AnimationMetadata, options: AnimationOptions): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: java.lang.String, steps: js.Array[AnimationMetadata]): AnimationTransitionMetadata = js.native
  def transition(stateChangeExpr: java.lang.String, steps: js.Array[AnimationMetadata], options: AnimationOptions): AnimationTransitionMetadata = js.native
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: AnimationMetadata
  ): AnimationTransitionMetadata = js.native
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: AnimationMetadata,
    options: AnimationOptions
  ): AnimationTransitionMetadata = js.native
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: js.Array[AnimationMetadata]
  ): AnimationTransitionMetadata = js.native
  def transition(
    stateChangeExpr: js.Function4[
      /* fromState */ java.lang.String, 
      /* toState */ java.lang.String, 
      /* element */ js.UndefOr[js.Any], 
      /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ],
    steps: js.Array[AnimationMetadata],
    options: AnimationOptions
  ): AnimationTransitionMetadata = js.native
  def trigger(name: java.lang.String, definitions: js.Array[AnimationMetadata]): AnimationTriggerMetadata = js.native
  def useAnimation(animation: AnimationReferenceMetadata): AnimationAnimateRefMetadata = js.native
  def useAnimation(animation: AnimationReferenceMetadata, options: AnimationOptions): AnimationAnimateRefMetadata = js.native
}

