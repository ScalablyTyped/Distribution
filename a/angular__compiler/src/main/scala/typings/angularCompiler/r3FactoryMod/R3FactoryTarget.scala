package typings.angularCompiler.r3FactoryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3FactoryTarget extends js.Object
@JSImport("@angular/compiler/src/render3/r3_factory", "R3FactoryTarget")
@js.native
object R3FactoryTarget extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryTarget with Double] = js.native
  
  @js.native
  sealed trait Component extends R3FactoryTarget
  /* 1 */ @js.native
  object Component extends TopLevel[Component with Double]
  
  @js.native
  sealed trait Directive extends R3FactoryTarget
  /* 0 */ @js.native
  object Directive extends TopLevel[Directive with Double]
  
  @js.native
  sealed trait Injectable extends R3FactoryTarget
  /* 2 */ @js.native
  object Injectable extends TopLevel[Injectable with Double]
  
  @js.native
  sealed trait NgModule extends R3FactoryTarget
  /* 4 */ @js.native
  object NgModule extends TopLevel[NgModule with Double]
  
  @js.native
  sealed trait Pipe extends R3FactoryTarget
  /* 3 */ @js.native
  object Pipe extends TopLevel[Pipe with Double]
}
