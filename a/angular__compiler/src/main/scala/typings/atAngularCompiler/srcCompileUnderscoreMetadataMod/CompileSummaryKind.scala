package typings.atAngularCompiler.srcCompileUnderscoreMetadataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompileSummaryKind extends js.Object

@JSImport("@angular/compiler/src/compile_metadata", "CompileSummaryKind")
@js.native
object CompileSummaryKind extends js.Object {
  @js.native
  sealed trait Directive extends CompileSummaryKind
  
  @js.native
  sealed trait Injectable extends CompileSummaryKind
  
  @js.native
  sealed trait NgModule extends CompileSummaryKind
  
  @js.native
  sealed trait Pipe extends CompileSummaryKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompileSummaryKind with Double] = js.native
  /* 1 */ @js.native
  object Directive extends TopLevel[Directive with Double]
  
  /* 3 */ @js.native
  object Injectable extends TopLevel[Injectable with Double]
  
  /* 2 */ @js.native
  object NgModule extends TopLevel[NgModule with Double]
  
  /* 0 */ @js.native
  object Pipe extends TopLevel[Pipe with Double]
  
}

