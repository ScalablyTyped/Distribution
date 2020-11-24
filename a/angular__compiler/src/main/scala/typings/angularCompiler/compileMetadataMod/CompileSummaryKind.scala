package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompileSummaryKind extends js.Object
@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompileSummaryKind with Double] = js.native
  
  @js.native
  sealed trait Directive extends CompileSummaryKind
  /* 1 */ @js.native
  object Directive extends TopLevel[Directive with Double]
  
  @js.native
  sealed trait Injectable extends CompileSummaryKind
  /* 3 */ @js.native
  object Injectable extends TopLevel[Injectable with Double]
  
  @js.native
  sealed trait NgModule extends CompileSummaryKind
  /* 2 */ @js.native
  object NgModule extends TopLevel[NgModule with Double]
  
  @js.native
  sealed trait Pipe extends CompileSummaryKind
  /* 0 */ @js.native
  object Pipe extends TopLevel[Pipe with Double]
}
