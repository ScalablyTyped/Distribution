package typings.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumberFormatStyle extends js.Object
@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormatStyle with Double] = js.native
  
  @js.native
  sealed trait Currency extends NumberFormatStyle
  /* 2 */ @js.native
  object Currency extends TopLevel[Currency with Double]
  
  @js.native
  sealed trait Decimal extends NumberFormatStyle
  /* 0 */ @js.native
  object Decimal extends TopLevel[Decimal with Double]
  
  @js.native
  sealed trait Percent extends NumberFormatStyle
  /* 1 */ @js.native
  object Percent extends TopLevel[Percent with Double]
  
  @js.native
  sealed trait Scientific extends NumberFormatStyle
  /* 3 */ @js.native
  object Scientific extends TopLevel[Scientific with Double]
}
