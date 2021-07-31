package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3FactoryTarget extends StObject
@JSImport("@angular/compiler/src/compiler_facade_interface", "R3FactoryTarget")
@js.native
object R3FactoryTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3FactoryTarget & Double] = js.native
  
  @js.native
  sealed trait Component
    extends StObject
       with R3FactoryTarget
  /* 1 */ val Component: typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Component & Double = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with R3FactoryTarget
  /* 0 */ val Directive: typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Directive & Double = js.native
  
  @js.native
  sealed trait Injectable
    extends StObject
       with R3FactoryTarget
  /* 2 */ val Injectable: typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Injectable & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with R3FactoryTarget
  /* 4 */ val NgModule: typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with R3FactoryTarget
  /* 3 */ val Pipe: typings.angularCompiler.compilerFacadeInterfaceMod.R3FactoryTarget.Pipe & Double = js.native
}
