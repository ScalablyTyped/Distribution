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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Plural with Double] = js.native
  /* 3 */ @js.native
  object Few extends TopLevel[Few with Double]
  
  /* 4 */ @js.native
  object Many extends TopLevel[Many with Double]
  
  /* 1 */ @js.native
  object One extends TopLevel[One with Double]
  
  /* 5 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /* 2 */ @js.native
  object Two extends TopLevel[Two with Double]
  
  /* 0 */ @js.native
  object Zero extends TopLevel[Zero with Double]
  
}

