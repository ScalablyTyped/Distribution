package typings.atAngularCommon.atAngularCommonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberFormatStyle extends js.Object

@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends js.Object {
  @js.native
  sealed trait Currency extends NumberFormatStyle
  
  @js.native
  sealed trait Decimal extends NumberFormatStyle
  
  @js.native
  sealed trait Percent extends NumberFormatStyle
  
  @js.native
  sealed trait Scientific extends NumberFormatStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumberFormatStyle with Double] = js.native
  /* 2 */ @js.native
  object Currency extends TopLevel[Currency with Double]
  
  /* 0 */ @js.native
  object Decimal extends TopLevel[Decimal with Double]
  
  /* 1 */ @js.native
  object Percent extends TopLevel[Percent with Double]
  
  /* 3 */ @js.native
  object Scientific extends TopLevel[Scientific with Double]
  
}

