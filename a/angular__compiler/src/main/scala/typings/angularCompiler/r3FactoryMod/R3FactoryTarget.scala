package typings.angularCompiler.r3FactoryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait R3FactoryTarget extends js.Object

@JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryTarget")
@js.native
object R3FactoryTarget extends js.Object {
  @js.native
  sealed trait Component extends R3FactoryTarget
  
  @js.native
  sealed trait Directive extends R3FactoryTarget
  
  @js.native
  sealed trait Injectable extends R3FactoryTarget
  
  @js.native
  sealed trait NgModule extends R3FactoryTarget
  
  @js.native
  sealed trait Pipe extends R3FactoryTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryTarget with Double] = js.native
  /* 1 */ @js.native
  object Component extends TopLevel[Component with Double]
  
  /* 0 */ @js.native
  object Directive extends TopLevel[Directive with Double]
  
  /* 2 */ @js.native
  object Injectable extends TopLevel[Injectable with Double]
  
  /* 4 */ @js.native
  object NgModule extends TopLevel[NgModule with Double]
  
  /* 3 */ @js.native
  object Pipe extends TopLevel[Pipe with Double]
  
}

