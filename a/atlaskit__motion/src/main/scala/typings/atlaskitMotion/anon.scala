package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesUtilsUseElementRefMod.CallbackRef
import typings.atlaskitMotion.distTypesUtilsUseElementRefMod.Element
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animation extends StObject {
    
    var animation: String
    
    var transition: String
  }
  object Animation {
    
    inline def apply(animation: String, transition: String): Animation = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    var ref: typings.react.mod.Ref[Any]
  }
  object ClassName {
    
    inline def apply(className: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Double
    
    var isReady: Boolean
    
    var ref: typings.react.mod.Ref[Any]
  }
  object Delay {
    
    inline def apply(delay: Double, isReady: Boolean): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait Mediaprefersreducedmotionreduce extends StObject {
    
    @JSName("@media (prefers-reduced-motion: reduce)")
    var `@media Leftparenthesisprefers-reduced-motionColon reduceRightparenthesis`: Animation
  }
  object Mediaprefersreducedmotionreduce {
    
    inline def apply(`@media Leftparenthesisprefers-reduced-motionColon reduceRightparenthesis`: Animation): Mediaprefersreducedmotionreduce = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@media (prefers-reduced-motion: reduce)")((`@media Leftparenthesisprefers-reduced-motionColon reduceRightparenthesis`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Mediaprefersreducedmotionreduce]
    }
    
    extension [Self <: Mediaprefersreducedmotionreduce](x: Self) {
      
      inline def `set@media Leftparenthesisprefers-reduced-motionColon reduceRightparenthesis`(value: Animation): Self = StObject.set(x, "@media (prefers-reduced-motion: reduce)", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: typings.react.mod.Ref[Any]
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  trait RefCallbackRef extends StObject {
    
    var ref: CallbackRef
  }
  object RefCallbackRef {
    
    inline def apply(ref: /* instance */ Element => Unit): RefCallbackRef = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[RefCallbackRef]
    }
    
    extension [Self <: RefCallbackRef](x: Self) {
      
      inline def setRef(value: /* instance */ Element => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined @atlaskit/motion.@atlaskit/motion/dist/types/resizing/height.ResizingHeightOpts & {children (opts : {  ref :@atlaskit/motion.@atlaskit/motion/dist/types/utils/use-element-ref.CallbackRef}): react.react.ReactNode} */
  trait ResizingHeightOptschildre extends StObject {
    
    def children(opts: RefCallbackRef): ReactNode
    
    /**
      * Duration as a `function`.
      * Will receive previous and next `height` and return the `duration`.
      *
      * By default this will match the [ADG specifications](https://atlassian.design) for how long motion should take.
      * Design specifications are still a work in progress.
      */
    var duration: js.UndefOr[js.Function2[/* prevHeight */ Double, /* nextHeight */ Double, Double]] = js.undefined
    
    /**
      * Timing function as a `function`.
      * This is handy for changing the curve depending on the user interaction.
      * Does the user interact [directly or indirectly](/packages/helpers/motion/docs/variables)?
      * You'll want to use an appropriate curve.
      * Will receive previous and next `height`,
      * `duration`,
      * and return the [timing function](https://developer.mozilla.org/en-US/docs/Web/CSS/timing-function).
      *
      * By default this will assume indirect motion using `easeInOut`.
      */
    var timingFunction: js.UndefOr[
        js.Function3[/* prevHeight */ Double, /* nextHeight */ Double, /* duration */ Double, String]
      ] = js.undefined
  }
  object ResizingHeightOptschildre {
    
    inline def apply(children: RefCallbackRef => ReactNode): ResizingHeightOptschildre = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ResizingHeightOptschildre]
    }
    
    extension [Self <: ResizingHeightOptschildre](x: Self) {
      
      inline def setChildren(value: RefCallbackRef => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDuration(value: (/* prevHeight */ Double, /* nextHeight */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTimingFunction(value: (/* prevHeight */ Double, /* nextHeight */ Double, /* duration */ Double) => String): Self = StObject.set(x, "timingFunction", js.Any.fromFunction3(value))
      
      inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    }
  }
}
