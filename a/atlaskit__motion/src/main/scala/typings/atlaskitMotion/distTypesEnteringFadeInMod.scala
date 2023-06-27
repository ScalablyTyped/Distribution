package typings.atlaskitMotion

import typings.atlaskitMotion.anon.ClassName
import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
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
  inline def default(param0: FadeKeyframesMotionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def fadeInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")().asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Unit, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  inline def fadeOutAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")().asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Unit, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Direction): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Direction, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FadeKeyframesMotionProps] (val x: Self) extends AnyVal {
      
      inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setEntranceDirection(value: Direction): Self = StObject.set(x, "entranceDirection", value.asInstanceOf[js.Any])
      
      inline def setEntranceDirectionUndefined: Self = StObject.set(x, "entranceDirection", js.undefined)
      
      inline def setExitDirection(value: Direction): Self = StObject.set(x, "exitDirection", value.asInstanceOf[js.Any])
      
      inline def setExitDirectionUndefined: Self = StObject.set(x, "exitDirection", js.undefined)
    }
  }
}
