package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompileSummaryKind extends StObject
@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompileSummaryKind & Double] = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with CompileSummaryKind
  /* 1 */ val Directive: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Directive & Double = js.native
  
  @js.native
  sealed trait Injectable
    extends StObject
       with CompileSummaryKind
  /* 3 */ val Injectable: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Injectable & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with CompileSummaryKind
  /* 2 */ val NgModule: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with CompileSummaryKind
  /* 0 */ val Pipe: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Pipe & Double = js.native
}
