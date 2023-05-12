package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typings.emotionSerialize.mod.CSSObject
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryPointsZoomInMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/zoom-in", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ZoomIn__
    *
    * Will over zoom an element into position.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entry-points/zoom-in", JSImport.Default)
  @js.native
  val default: FC[KeyframesMotionProps] = js.native
  
  inline def shrinkOutAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("shrinkOutAnimation")().asInstanceOf[CSSObject]
  
  inline def zoomInAnimation(): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomInAnimation")().asInstanceOf[CSSObject]
}
