package typings.atlaskitMotion

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringExitingPersistenceMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/exiting-persistence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ExitingPersistence__
    *
    * Useful for enabling elements to persist and animate away when they are removed from the DOM.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entering/exiting-persistence", JSImport.Default)
  @js.native
  val default: FC[ExitingPersistenceProps] = js.native
  
  inline def useExitingPersistence(): ExitingChildContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useExitingPersistence")().asInstanceOf[ExitingChildContext]
  
  /**
    * Internal data passed to child motions.
    */
  trait ExitingChildContext extends StObject {
    
    /**
      * Used to tell the child motions to animate in when initially mounting.
      */
    var appear: Boolean
    
    /**
      * Will perform an exit animation instead of an enter animation.
      */
    var isExiting: Boolean
    
    /**
      * Will be called when the animation has completed.
      */
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ExitingChildContext {
    
    inline def apply(appear: Boolean, isExiting: Boolean): ExitingChildContext = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], isExiting = isExiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExitingChildContext]
    }
    
    extension [Self <: ExitingChildContext](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setIsExiting(value: Boolean): Self = StObject.set(x, "isExiting", value.asInstanceOf[js.Any])
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    }
  }
  
  trait ExitingPersistenceProps extends StObject {
    
    /**
      * When initially mounting if set to `true` all child motions will animate in.
      */
    var appear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children can be any valid react node.
      * Either a single element,
      * multiple elements,
      * or multiple elements in an array.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * When elements are exiting will exit all elements first and then mount the new ones.
      * Defaults to `false`.
      */
    var exitThenEnter: js.UndefOr[Boolean] = js.undefined
  }
  object ExitingPersistenceProps {
    
    inline def apply(): ExitingPersistenceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitingPersistenceProps]
    }
    
    extension [Self <: ExitingPersistenceProps](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExitThenEnter(value: Boolean): Self = StObject.set(x, "exitThenEnter", value.asInstanceOf[js.Any])
      
      inline def setExitThenEnterUndefined: Self = StObject.set(x, "exitThenEnter", js.undefined)
    }
  }
}
