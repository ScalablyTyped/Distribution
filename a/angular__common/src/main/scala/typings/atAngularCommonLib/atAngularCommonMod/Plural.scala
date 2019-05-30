package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Plural extends js.Object

@JSImport("@angular/common", "Plural")
@js.native
object Plural extends js.Object {
  @js.native
  sealed trait Few
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  @js.native
  sealed trait Many
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  @js.native
  sealed trait One
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  @js.native
  sealed trait Other
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  @js.native
  sealed trait Two
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  @js.native
  sealed trait Zero
    extends atAngularCommonLib.atAngularCommonMod.Plural
  
  /* 3 */ val Few: Few with scala.Double = js.native
  /* 4 */ val Many: Many with scala.Double = js.native
  /* 1 */ val One: One with scala.Double = js.native
  /* 5 */ val Other: Other with scala.Double = js.native
  /* 2 */ val Two: Two with scala.Double = js.native
  /* 0 */ val Zero: Zero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCommonLib.atAngularCommonMod.Plural with scala.Double] = js.native
}

