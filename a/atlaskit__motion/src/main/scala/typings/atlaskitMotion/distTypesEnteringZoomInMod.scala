package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringZoomInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/zoom-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ZoomIn__
    *
    * Will over zoom an element into position.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def default(param0: KeyframesMotionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def shrinkOutAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("shrinkOutAnimation")().asInstanceOf[CSSObject]
  
  inline def zoomInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomInAnimation")().asInstanceOf[CSSObject]
}
