package typings.atlaskitMotion

import typings.atlaskitMotion.exitingPersistenceMod.ExitingChildContext
import typings.atlaskitMotion.exitingPersistenceMod.ExitingPersistenceProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointsExitingPersistenceMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/exiting-persistence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __ExitingPersistence__
    *
    * Useful for enabling elements to persist and animate away when they are removed from the DOM.
    *
    * - [Examples](https://atlaskit.atlassian.com/packages/design-system/motion/docs/entering-motions)
    */
  @JSImport("@atlaskit/motion/dist/types/entry-points/exiting-persistence", JSImport.Default)
  @js.native
  val default: FC[ExitingPersistenceProps] = js.native
  
  inline def useExitingPersistence(): ExitingChildContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useExitingPersistence")().asInstanceOf[ExitingChildContext]
}
