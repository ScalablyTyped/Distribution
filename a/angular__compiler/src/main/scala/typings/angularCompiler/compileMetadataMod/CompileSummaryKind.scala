package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompileSummaryKind extends StObject
@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompileSummaryKind with Double] = js.native
  
  @js.native
  sealed trait Directive extends CompileSummaryKind
  /* 1 */ val Directive: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Directive with Double = js.native
  
  @js.native
  sealed trait Injectable extends CompileSummaryKind
  /* 3 */ val Injectable: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Injectable with Double = js.native
  
  @js.native
  sealed trait NgModule extends CompileSummaryKind
  /* 2 */ val NgModule: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.NgModule with Double = js.native
  
  @js.native
  sealed trait Pipe extends CompileSummaryKind
  /* 0 */ val Pipe: typings.angularCompiler.compileMetadataMod.CompileSummaryKind.Pipe with Double = js.native
}
