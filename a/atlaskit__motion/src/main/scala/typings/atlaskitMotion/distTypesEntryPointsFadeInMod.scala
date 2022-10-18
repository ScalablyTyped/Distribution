package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringFadeInMod.FadeKeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryPointsFadeInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/fade-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __FadeIn__
    *
    * Useful for fading in one or more elements.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entry-points/fade-in", JSImport.Default)
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
}
