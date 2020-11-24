package typings.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Plural extends js.Object
@JSImport("@angular/common", "Plural")
@js.native
object Plural extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
  
  @js.native
  sealed trait Few extends Plural
  /* 3 */ @js.native
  object Few extends TopLevel[Few with Double]
  
  @js.native
  sealed trait Many extends Plural
  /* 4 */ @js.native
  object Many extends TopLevel[Many with Double]
  
  @js.native
  sealed trait One extends Plural
  /* 1 */ @js.native
  object One extends TopLevel[One with Double]
  
  @js.native
  sealed trait Other extends Plural
  /* 5 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  @js.native
  sealed trait Two extends Plural
  /* 2 */ @js.native
  object Two extends TopLevel[Two with Double]
  
  @js.native
  sealed trait Zero extends Plural
  /* 0 */ @js.native
  object Zero extends TopLevel[Zero with Double]
}
