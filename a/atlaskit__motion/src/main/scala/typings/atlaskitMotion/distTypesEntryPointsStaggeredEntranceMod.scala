package typings.atlaskitMotion

import typings.atlaskitMotion.anon.Delay
import typings.atlaskitMotion.distTypesEnteringStaggeredEntranceMod.StaggeredEntranceProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEntryPointsStaggeredEntranceMod {
  
  @JSImport("@atlaskit/motion/dist/types/entry-points/staggered-entrance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * For a list of elements that need to animate in,
    * this should be used in conjunction with entering components.
    * This does not need Javascript to execute so it will run immediately for any SSR rendered React apps before the JS has executed.
    *
    * Will dynamically add delay to each child entering component.
    * Unfortunately all entering components _NEED_ to be a direct descendant.
    */
  inline def default(param0: StaggeredEntranceProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useStaggeredEntrance(): Delay = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaggeredEntrance")().asInstanceOf[Delay]
}
