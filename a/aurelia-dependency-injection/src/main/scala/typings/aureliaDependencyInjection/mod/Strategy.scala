package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Strategy extends js.Object

@JSImport("aurelia-dependency-injection", "Strategy")
@js.native
object Strategy extends js.Object {
  @js.native
  sealed trait alias extends Strategy
  
  @js.native
  sealed trait array extends Strategy
  
  @js.native
  sealed trait function extends Strategy
  
  @js.native
  sealed trait instance extends Strategy
  
  @js.native
  sealed trait singleton extends Strategy
  
  @js.native
  sealed trait transient extends Strategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Strategy with Double] = js.native
  /* 5 */ @js.native
  object alias extends TopLevel[alias with Double]
  
  /* 4 */ @js.native
  object array extends TopLevel[array with Double]
  
  /* 3 */ @js.native
  object function extends TopLevel[function with Double]
  
  /* 0 */ @js.native
  object instance extends TopLevel[instance with Double]
  
  /* 1 */ @js.native
  object singleton
    extends TopLevel[typings.aureliaDependencyInjection.mod.Strategy.singleton with Double]
  
  /* 2 */ @js.native
  object transient
    extends TopLevel[typings.aureliaDependencyInjection.mod.Strategy.transient with Double]
  
}

