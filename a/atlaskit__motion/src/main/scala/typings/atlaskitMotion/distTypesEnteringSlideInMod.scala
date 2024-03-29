package typings.atlaskitMotion

import typings.atlaskitMotion.anon.ClassName
import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typings.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typings.atlaskitMotion.distTypesUtilsCurvesMod.AnimationCurve
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringSlideInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/slide-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __SlideIn__
    *
    * Will slide an element into position, generally used for things that appear from outside of the viewport into view.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def default(param0: SlideInProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def slideInAnimation(from: Direction, state: Transition, fade: Fade): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("slideInAnimation")(from.asInstanceOf[js.Any], state.asInstanceOf[js.Any], fade.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  trait SlideInProps
    extends StObject
       with KeyframesMotionProps {
    
    /**
      * A custom function used to override the default animation timings.
      * Returns which animation curve to use depending on the current transitioning state.
      */
    var animationTimingFunction: js.UndefOr[js.Function1[/* state */ Transition, AnimationCurve]] = js.undefined
    
    /**
      Direction the element will slide in from.
      E.g. `"right"` will slide in from the right to the left.
      
      If `exitTo` is not set, exiting will reverse this motion.
      E.g. if `enterFrom: "right"`, will slide out to the right.
      */
    var enterFrom: Direction
    
    /**
      Direction the element will slide out towards.
      E.g. `"right"` will slide out to the right.
      
      If this is not set, exiting will reverse the entrance motion.
      E.g. if `enterFrom: "right"`, will slide out to the right.
      */
    var exitTo: js.UndefOr[Direction] = js.undefined
    
    /**
      Whether an element will fade on enter, on exit or both.
      
      `'none'` is the default and will cause the element to not fade,
      `'in'` will cause the element to fade on enter,
      `'out'` will cause the element to fade on exit,
      `'inout'` will cause the element to fade on both
      */
    var fade: js.UndefOr[Fade] = js.undefined
  }
  object SlideInProps {
    
    inline def apply(children: (ClassName, Transition) => ReactNode, enterFrom: Direction): SlideInProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), enterFrom = enterFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideInProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideInProps] (val x: Self) extends AnyVal {
      
      inline def setAnimationTimingFunction(value: /* state */ Transition => AnimationCurve): Self = StObject.set(x, "animationTimingFunction", js.Any.fromFunction1(value))
      
      inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      inline def setEnterFrom(value: Direction): Self = StObject.set(x, "enterFrom", value.asInstanceOf[js.Any])
      
      inline def setExitTo(value: Direction): Self = StObject.set(x, "exitTo", value.asInstanceOf[js.Any])
      
      inline def setExitToUndefined: Self = StObject.set(x, "exitTo", js.undefined)
      
      inline def setFade(value: Fade): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
}
