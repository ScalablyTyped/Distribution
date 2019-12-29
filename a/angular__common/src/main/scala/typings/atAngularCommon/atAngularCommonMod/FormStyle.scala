package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormStyle extends js.Object

@JSImport("@angular/common", "FormStyle")
@js.native
object FormStyle extends js.Object {
  @js.native
  sealed trait Format extends FormStyle
  
  @js.native
  sealed trait Standalone extends FormStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormStyle with Double] = js.native
  /* 0 */ @js.native
  object Format extends TopLevel[Format with Double]
  
  /* 1 */ @js.native
  object Standalone extends TopLevel[Standalone with Double]
  
}

