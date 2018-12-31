package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationMetadataType extends js.Object

@JSImport("@angular/animations/src/animation_metadata", "AnimationMetadataType")
@js.native
object AnimationMetadataType extends js.Object {
  /**
    * Contains an animation step.
    * See `animate()`
    */
  @js.native
  sealed trait Animate
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains data to use in executing child animations returned by a query.
    * See `animateChild()`
    */
  @js.native
  sealed trait AnimateChild
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains animation parameters for a re-usable animation.
    * See `useAnimation()`
    */
  @js.native
  sealed trait AnimateRef
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains a set of animation steps.
    * See `{@link animations/group group()}`
    */
  @js.native
  sealed trait Group
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains a set of animation steps.
    * See `keyframes()`
    */
  @js.native
  sealed trait Keyframes
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains child-animation query data.
    * See `query()`
    */
  @js.native
  sealed trait Query
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains a re-usable animation.
    * See `animation()`
    */
  @js.native
  sealed trait Reference
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains a set of animation steps.
    * See `sequence()`
    */
  @js.native
  sealed trait Sequence
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains data for staggering an animation sequence.
    * See `stagger()`
    */
  @js.native
  sealed trait Stagger
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Associates a named animation state with a set of CSS styles.
    * See `state()`
    */
  @js.native
  sealed trait State
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Contains a set of CSS property-value pairs into a named style.
    * See `style()`
    */
  @js.native
  sealed trait Style
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Data for a transition from one animation state to another.
    * See `transition()`
    */
  @js.native
  sealed trait Transition
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /**
    * Associates an animation with an entry trigger that can be attached to an element.
    * See `trigger()`
    */
  @js.native
  sealed trait Trigger
    extends atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType
  
  /* 4 */ val Animate: Animate with scala.Double = js.native
  /* 9 */ val AnimateChild: AnimateChild with scala.Double = js.native
  /* 10 */ val AnimateRef: AnimateRef with scala.Double = js.native
  /* 3 */ val Group: Group with scala.Double = js.native
  /* 5 */ val Keyframes: Keyframes with scala.Double = js.native
  /* 11 */ val Query: Query with scala.Double = js.native
  /* 8 */ val Reference: Reference with scala.Double = js.native
  /* 2 */ val Sequence: Sequence with scala.Double = js.native
  /* 12 */ val Stagger: Stagger with scala.Double = js.native
  /* 0 */ val State: State with scala.Double = js.native
  /* 6 */ val Style: Style with scala.Double = js.native
  /* 1 */ val Transition: Transition with scala.Double = js.native
  /* 7 */ val Trigger: Trigger with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadataType with scala.Double
  ] = js.native
}

