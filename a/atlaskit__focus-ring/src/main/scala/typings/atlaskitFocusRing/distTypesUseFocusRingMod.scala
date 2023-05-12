package typings.atlaskitFocusRing

import typings.atlaskitFocusRing.anon.FocusProps
import typings.atlaskitFocusRing.distTypesTypesMod.FocusState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUseFocusRingMod {
  
  @JSImport("@atlaskit/focus-ring/dist/types/use-focus-ring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def default(): FocusProps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[FocusProps]
  inline def default(initialState: FocusState): FocusProps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[FocusProps]
}
