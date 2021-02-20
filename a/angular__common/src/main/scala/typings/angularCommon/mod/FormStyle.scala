package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormStyle extends StObject
@JSImport("@angular/common", "FormStyle")
@js.native
object FormStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormStyle with Double] = js.native
  
  @js.native
  sealed trait Format extends FormStyle
  /* 0 */ val Format: typings.angularCommon.mod.FormStyle.Format with Double = js.native
  
  @js.native
  sealed trait Standalone extends FormStyle
  /* 1 */ val Standalone: typings.angularCommon.mod.FormStyle.Standalone with Double = js.native
}
