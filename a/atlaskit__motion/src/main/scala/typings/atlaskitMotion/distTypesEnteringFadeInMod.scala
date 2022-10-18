package typings.atlaskitMotion

import typings.atlaskitMotion.anon.ClassName
import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringFadeInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/fade-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __FadeIn__
    *
    * Useful for fading in one or more elements.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entering/fade-in", JSImport.Default)
  @js.native
  val default: FC[FadeKeyframesMotionProps] = js.native
  
  inline def fadeInAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")().asInstanceOf[Any]
  inline def fadeInAnimation(direction: Unit, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fadeInAnimation(direction: Direction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fadeInAnimation(direction: Direction, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fadeOutAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")().asInstanceOf[Any]
  inline def fadeOutAnimation(direction: Unit, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fadeOutAnimation(direction: Direction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fadeOutAnimation(direction: Direction, distance: Distance): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait FadeKeyframesMotionProps
    extends StObject
       with KeyframesMotionProps {
    
    /**
      * The distance the element moves in a direction-based animation.
      * A `proportional` distance is based on the size of the element.
      * A `constant` distance will always move the same amount, regardless of size.
      */
    var distance: js.UndefOr[Distance] = js.undefined
    
    /**
      * The direction the element will enter from using a slide animation. If undefined, no slide will be applied.
      */
    var entranceDirection: js.UndefOr[Direction] = js.undefined
    
    /**
      * The direction the element will exit to using a slide animation.
      * If undefined but `entranceDirection` is set, it will exit to the opposite side by default.
      */
    var exitDirection: js.UndefOr[Direction] = js.undefined
  }
  object FadeKeyframesMotionProps {
    
    inline def apply(children: (ClassName, Transition) => ReactNode): FadeKeyframesMotionProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[FadeKeyframesMotionProps]
    }
    
    extension [Self <: FadeKeyframesMotionProps](x: Self) {
      
      inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setEntranceDirection(value: Direction): Self = StObject.set(x, "entranceDirection", value.asInstanceOf[js.Any])
      
      inline def setEntranceDirectionUndefined: Self = StObject.set(x, "entranceDirection", js.undefined)
      
      inline def setExitDirection(value: Direction): Self = StObject.set(x, "exitDirection", value.asInstanceOf[js.Any])
      
      inline def setExitDirectionUndefined: Self = StObject.set(x, "exitDirection", js.undefined)
    }
  }
}
