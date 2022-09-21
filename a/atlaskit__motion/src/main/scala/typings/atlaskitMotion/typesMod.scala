package typings.atlaskitMotion

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitMotion.atlaskitMotionStrings.top
    - typings.atlaskitMotion.atlaskitMotionStrings.right
    - typings.atlaskitMotion.atlaskitMotionStrings.bottom
    - typings.atlaskitMotion.atlaskitMotionStrings.left
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typings.atlaskitMotion.atlaskitMotionStrings.bottom = "bottom".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.bottom]
    
    inline def left: typings.atlaskitMotion.atlaskitMotionStrings.left = "left".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.left]
    
    inline def right: typings.atlaskitMotion.atlaskitMotionStrings.right = "right".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.right]
    
    inline def top: typings.atlaskitMotion.atlaskitMotionStrings.top = "top".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitMotion.atlaskitMotionStrings.constant
    - typings.atlaskitMotion.atlaskitMotionStrings.proportional
  */
  trait Distance extends StObject
  object Distance {
    
    inline def constant: typings.atlaskitMotion.atlaskitMotionStrings.constant = "constant".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.constant]
    
    inline def proportional: typings.atlaskitMotion.atlaskitMotionStrings.proportional = "proportional".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.proportional]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitMotion.atlaskitMotionStrings.none
    - typings.atlaskitMotion.atlaskitMotionStrings.in
    - typings.atlaskitMotion.atlaskitMotionStrings.out
    - typings.atlaskitMotion.atlaskitMotionStrings.inout
  */
  trait Fade extends StObject
  object Fade {
    
    inline def in: typings.atlaskitMotion.atlaskitMotionStrings.in = "in".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.in]
    
    inline def inout: typings.atlaskitMotion.atlaskitMotionStrings.inout = "inout".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.inout]
    
    inline def none: typings.atlaskitMotion.atlaskitMotionStrings.none = "none".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.none]
    
    inline def out: typings.atlaskitMotion.atlaskitMotionStrings.out = "out".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.out]
  }
  
  trait MotionProps[TProps /* <: js.Object */] extends StObject {
    
    /**
      * Children as `function`.
      * Will be passed `props` for you to hook up.
      * The `state` arg can be used to know if the motion is `entering` or `exiting`.
      */
    def children(opts: TProps, state: Transition): ReactNode
    
    /**
      * Duration in `ms`.
      * How long the motion will take.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Will callback when the motion has finished in the particular direction.
      * If it finished entering direction will be `entering`.
      * And vice versa for `exiting`.
      */
    var onFinish: js.UndefOr[js.Function1[/* state */ Transition, Unit]] = js.undefined
  }
  object MotionProps {
    
    inline def apply[TProps /* <: js.Object */](children: (TProps, Transition) => ReactNode): MotionProps[TProps] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[MotionProps[TProps]]
    }
    
    extension [Self <: MotionProps[?], TProps /* <: js.Object */](x: Self & MotionProps[TProps]) {
      
      inline def setChildren(value: (TProps, Transition) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnFinish(value: /* state */ Transition => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitMotion.atlaskitMotionStrings.entering
    - typings.atlaskitMotion.atlaskitMotionStrings.exiting
  */
  trait Transition extends StObject
  object Transition {
    
    inline def entering: typings.atlaskitMotion.atlaskitMotionStrings.entering = "entering".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.entering]
    
    inline def exiting: typings.atlaskitMotion.atlaskitMotionStrings.exiting = "exiting".asInstanceOf[typings.atlaskitMotion.atlaskitMotionStrings.exiting]
  }
}
