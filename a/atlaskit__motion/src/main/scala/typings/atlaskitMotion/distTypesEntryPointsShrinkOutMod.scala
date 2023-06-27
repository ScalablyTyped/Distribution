package typings.atlaskitMotion

import typings.atlaskitMotion.distTypesEnteringShrinkOutMod.ShrinkOutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryPointsShrinkOutMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/shrink-out", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ShrinkOut__
    *
    * Will shrink an element down to nothing when exiting.
    * Works best with flex children as collapsing margins can come with undesired behaviour.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  inline def default(param0: ShrinkOutProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
}
