package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ɵɵFactoryTarget extends StObject
@JSImport("@angular/core", "\u0275\u0275FactoryTarget")
@js.native
object ɵɵFactoryTarget extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ɵɵFactoryTarget & Double] = js.native
  
  @js.native
  sealed trait Component
    extends StObject
       with ɵɵFactoryTarget
  /* 1 */ val Component: typings.angularCore.mod.ɵɵFactoryTarget.Component & Double = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with ɵɵFactoryTarget
  /* 0 */ val Directive: typings.angularCore.mod.ɵɵFactoryTarget.Directive & Double = js.native
  
  @js.native
  sealed trait Injectable
    extends StObject
       with ɵɵFactoryTarget
  /* 2 */ val Injectable: typings.angularCore.mod.ɵɵFactoryTarget.Injectable & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with ɵɵFactoryTarget
  /* 4 */ val NgModule: typings.angularCore.mod.ɵɵFactoryTarget.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with ɵɵFactoryTarget
  /* 3 */ val Pipe: typings.angularCore.mod.ɵɵFactoryTarget.Pipe & Double = js.native
}
