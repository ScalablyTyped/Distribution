package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FactoryTarget extends StObject
@JSImport("@angular/compiler", "FactoryTarget")
@js.native
object FactoryTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FactoryTarget & Double] = js.native
  
  @js.native
  sealed trait Component
    extends StObject
       with FactoryTarget
  /* 1 */ val Component: typings.angularCompiler.mod.FactoryTarget.Component & Double = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with FactoryTarget
  /* 0 */ val Directive: typings.angularCompiler.mod.FactoryTarget.Directive & Double = js.native
  
  @js.native
  sealed trait Injectable
    extends StObject
       with FactoryTarget
  /* 2 */ val Injectable: typings.angularCompiler.mod.FactoryTarget.Injectable & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with FactoryTarget
  /* 4 */ val NgModule: typings.angularCompiler.mod.FactoryTarget.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with FactoryTarget
  /* 3 */ val Pipe: typings.angularCompiler.mod.FactoryTarget.Pipe & Double = js.native
}
