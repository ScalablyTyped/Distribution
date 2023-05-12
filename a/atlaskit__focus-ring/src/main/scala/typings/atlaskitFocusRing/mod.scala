package typings.atlaskitFocusRing

import typings.atlaskitFocusRing.anon.FocusProps
import typings.atlaskitFocusRing.distTypesTypesMod.FocusRingProps
import typings.atlaskitFocusRing.distTypesTypesMod.FocusState
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/focus-ring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("@atlaskit/focus-ring", JSImport.Default)
  @js.native
  val default: FC[FocusRingProps] = js.native
  
  /**
    * __Use focus ring__
    *
    * This component has accessibility issues that we are working to resolve.
    * Do not use without support from the Atlassian Design System accessibility team.
    *
    * The useFocusRing hook manages focus in the rare cases where the focus ring’s visual application and the element that takes focus differ.
    * This is not typically a good practice for accessibility, so don’t do this unless you’ve consulted with the accessibility team.
    *
    */
  inline def useFocusRing(): FocusProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRing")().asInstanceOf[FocusProps]
  inline def useFocusRing(initialState: FocusState): FocusProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRing")(initialState.asInstanceOf[js.Any]).asInstanceOf[FocusProps]
}
