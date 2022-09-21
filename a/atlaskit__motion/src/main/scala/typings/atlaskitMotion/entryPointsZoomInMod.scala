package typings.atlaskitMotion

import typings.atlaskitMotion.keyframesMotionMod.KeyframesMotionProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointsZoomInMod {
  
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
  
  inline def shrinkOutAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shrinkOutAnimation")().asInstanceOf[Any]
  
  inline def zoomInAnimation(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomInAnimation")().asInstanceOf[Any]
}
