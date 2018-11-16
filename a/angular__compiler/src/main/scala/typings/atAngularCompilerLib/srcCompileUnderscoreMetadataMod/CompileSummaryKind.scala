package typings
package atAngularCompilerLib.srcCompileUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompileSummaryKind extends js.Object

@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends js.Object {
  @js.native
  sealed trait Directive
    extends atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileSummaryKind
  
  @js.native
  sealed trait Injectable
    extends atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileSummaryKind
  
  @js.native
  sealed trait NgModule
    extends atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileSummaryKind
  
  @js.native
  sealed trait Pipe
    extends atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileSummaryKind
  
  /* 1 */ val Directive: Directive with scala.Double = js.native
  /* 3 */ val Injectable: Injectable with scala.Double = js.native
  /* 2 */ val NgModule: NgModule with scala.Double = js.native
  /* 0 */ val Pipe: Pipe with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileSummaryKind with scala.Double
  ] = js.native
}

