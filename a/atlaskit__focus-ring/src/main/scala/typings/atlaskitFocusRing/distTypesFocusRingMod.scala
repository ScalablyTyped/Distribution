package typings.atlaskitFocusRing

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitFocusRing.distTypesTypesMod.FocusRingProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFocusRingMod extends Shortcut {
  
  /**
    * __Focus ring__
    *
    * A focus ring visually indicates the currently focused item.
    *
    * There are known accessibility issues with this component.
    * Do not use without assistance from the Design System accessibility team.
    *
    * - [Code](https://atlaskit.atlassian.com/packages/design-system/focus-ring)
    *
    * @example
    * ```jsx
    * import FocusRing from '@atlaskit/focus-ring';
    *
    * const InteractiveComponent = () => (
    *   <FocusRing>
    *     <button type="button">Hello</button>
    *   </FocusRing>
    * )
    * ```
    */
  @JSImport("@atlaskit/focus-ring/dist/types/focus-ring", JSImport.Default)
  @js.native
  val default: FC[FocusRingProps] = js.native
  
  type _To = FC[FocusRingProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesFocusRingMod.foo` */
  override def _to: FC[FocusRingProps] = default
}
