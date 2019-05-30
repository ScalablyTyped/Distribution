package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumberFormatStyle extends js.Object

@JSImport("@angular/common", "NumberFormatStyle")
@js.native
object NumberFormatStyle extends js.Object {
  @js.native
  sealed trait Currency
    extends atAngularCommonLib.atAngularCommonMod.NumberFormatStyle
  
  @js.native
  sealed trait Decimal
    extends atAngularCommonLib.atAngularCommonMod.NumberFormatStyle
  
  @js.native
  sealed trait Percent
    extends atAngularCommonLib.atAngularCommonMod.NumberFormatStyle
  
  @js.native
  sealed trait Scientific
    extends atAngularCommonLib.atAngularCommonMod.NumberFormatStyle
  
  /* 2 */ val Currency: Currency with scala.Double = js.native
  /* 0 */ val Decimal: Decimal with scala.Double = js.native
  /* 1 */ val Percent: Percent with scala.Double = js.native
  /* 3 */ val Scientific: Scientific with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.NumberFormatStyle with scala.Double] = js.native
}

