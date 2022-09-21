package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDocumentVisibilityMod {
  
  @JSImport("ahooks/lib/useDocumentVisibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): VisibilityState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[VisibilityState]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ahooks.ahooksStrings.hidden
    - typings.ahooks.ahooksStrings.visible
    - typings.ahooks.ahooksStrings.prerender
    - scala.Unit
  */
  type VisibilityState = js.UndefOr[_VisibilityState]
  
  trait _VisibilityState extends StObject
}
