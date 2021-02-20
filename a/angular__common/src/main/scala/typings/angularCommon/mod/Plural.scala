package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Plural extends StObject
@JSImport("@angular/common", "Plural")
@js.native
object Plural extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
  
  @js.native
  sealed trait Few extends Plural
  /* 3 */ val Few: typings.angularCommon.mod.Plural.Few with Double = js.native
  
  @js.native
  sealed trait Many extends Plural
  /* 4 */ val Many: typings.angularCommon.mod.Plural.Many with Double = js.native
  
  @js.native
  sealed trait One extends Plural
  /* 1 */ val One: typings.angularCommon.mod.Plural.One with Double = js.native
  
  @js.native
  sealed trait Other extends Plural
  /* 5 */ val Other: typings.angularCommon.mod.Plural.Other with Double = js.native
  
  @js.native
  sealed trait Two extends Plural
  /* 2 */ val Two: typings.angularCommon.mod.Plural.Two with Double = js.native
  
  @js.native
  sealed trait Zero extends Plural
  /* 0 */ val Zero: typings.angularCommon.mod.Plural.Zero with Double = js.native
}
