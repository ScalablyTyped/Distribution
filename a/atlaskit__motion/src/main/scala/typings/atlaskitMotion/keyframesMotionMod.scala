package typings.atlaskitMotion

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitMotion.anon.ClassName
import typings.atlaskitMotion.typesMod.MotionProps
import typings.atlaskitMotion.typesMod.Transition
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyframesMotionMod extends Shortcut {
  
  /**
    * This is the base INTERNAL component used for all other entering motions.
    * This does not need Javascript to execute on the client so it will run immediately
    * for any SSR rendered React apps before the JS has executed.
    */
  @JSImport("@atlaskit/motion/dist/types/entering/keyframes-motion", JSImport.Default)
  @js.native
  val default: FC[InternalKeyframesMotionProps] = js.native
  
  trait InternalKeyframesMotionProps
    extends StObject
       with KeyframesMotionProps {
    
    /**
      * Timing function to be used with the animation.
      * Receives the `state` and expects a `string` return value.
      * Useful if you want a different curve when entering vs. exiting.
      */
    def animationTimingFunction(state: Transition): String
    
    /**
      * Duration in `ms`.
      * How long the motion will take.
      */
    @JSName("duration")
    var duration_InternalKeyframesMotionProps: Double
    
    /**
      * CSS keyframes for the entering animation.
      */
    var enteringAnimation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
    
    /**
      * CSS keyframes for the exiting animation.
      */
    var exitingAnimation: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
      ] = js.undefined
  }
  object InternalKeyframesMotionProps {
    
    inline def apply(
      animationTimingFunction: Transition => String,
      children: (ClassName, Transition) => ReactNode,
      duration: Double,
      enteringAnimation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
    ): InternalKeyframesMotionProps = {
      val __obj = js.Dynamic.literal(animationTimingFunction = js.Any.fromFunction1(animationTimingFunction), children = js.Any.fromFunction2(children), duration = duration.asInstanceOf[js.Any], enteringAnimation = enteringAnimation.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalKeyframesMotionProps]
    }
    
    extension [Self <: InternalKeyframesMotionProps](x: Self) {
      
      inline def setAnimationTimingFunction(value: Transition => String): Self = StObject.set(x, "animationTimingFunction", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnteringAnimation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
      ): Self = StObject.set(x, "enteringAnimation", value.asInstanceOf[js.Any])
      
      inline def setExitingAnimation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
      ): Self = StObject.set(x, "exitingAnimation", value.asInstanceOf[js.Any])
      
      inline def setExitingAnimationUndefined: Self = StObject.set(x, "exitingAnimation", js.undefined)
    }
  }
  
  trait KeyframesMotionProps
    extends StObject
       with MotionProps[ClassName] {
    
    /**
      * Can be used to pause the animation before it has finished.
      */
    var isPaused: js.UndefOr[Boolean] = js.undefined
  }
  object KeyframesMotionProps {
    
    inline def apply(children: (ClassName, Transition) => ReactNode): KeyframesMotionProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[KeyframesMotionProps]
    }
    
    extension [Self <: KeyframesMotionProps](x: Self) {
      
      inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
      
      inline def setIsPausedUndefined: Self = StObject.set(x, "isPaused", js.undefined)
    }
  }
  
  type _To = FC[InternalKeyframesMotionProps]
  
  /* This means you don't have to write `default`, but can instead just say `keyframesMotionMod.foo` */
  override def _to: FC[InternalKeyframesMotionProps] = default
}
