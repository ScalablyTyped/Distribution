package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringFadeInMod.FadeKeyframesMotionProps
import typings.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typings.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.global.JSX.Element
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
  inline def default(param0: FadeKeyframesMotionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def fadeInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")().asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Unit, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def fadeInAnimation(direction: Direction, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeInAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  inline def fadeOutAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")().asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Unit, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Direction): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def fadeOutAnimation(direction: Direction, distance: Distance): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeOutAnimation")(direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
}
