package typings.atlaskitMotion

import typings.atlaskitMotion.anon.Ref
import typings.atlaskitMotion.distTypesEnteringTypesMod.MotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringShrinkOutMod {
  
  @JSImport("@atlaskit/motion/dist/types/entering/shrink-out", JSImport.Namespace)
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
  
  type ShrinkOutProps = MotionProps[Ref]
}
