package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Plural extends js.Object

@JSImport("@angular/common", "Plural")
@js.native
object Plural extends js.Object {
  @js.native
  sealed trait Few extends Plural
  
  @js.native
  sealed trait Many extends Plural
  
  @js.native
  sealed trait One extends Plural
  
  @js.native
  sealed trait Other extends Plural
  
  @js.native
  sealed trait Two extends Plural
  
  @js.native
  sealed trait Zero extends Plural
  
  /* 3 */ val Few: typings.atAngularCommon.atAngularCommonMod.Plural.Few with Double = js.native
  /* 4 */ val Many: typings.atAngularCommon.atAngularCommonMod.Plural.Many with Double = js.native
  /* 1 */ val One: typings.atAngularCommon.atAngularCommonMod.Plural.One with Double = js.native
  /* 5 */ val Other: typings.atAngularCommon.atAngularCommonMod.Plural.Other with Double = js.native
  /* 2 */ val Two: typings.atAngularCommon.atAngularCommonMod.Plural.Two with Double = js.native
  /* 0 */ val Zero: typings.atAngularCommon.atAngularCommonMod.Plural.Zero with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
}

