package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentifierKind extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/indexer/src/api", "IdentifierKind")
@js.native
object IdentifierKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IdentifierKind & Double] = js.native
  
  @js.native
  sealed trait Attribute
    extends StObject
       with IdentifierKind
  /* 4 */ val Attribute: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Attribute & Double = js.native
  
  @js.native
  sealed trait Element
    extends StObject
       with IdentifierKind
  /* 2 */ val Element: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element & Double = js.native
  
  @js.native
  sealed trait Method
    extends StObject
       with IdentifierKind
  /* 1 */ val Method: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Method & Double = js.native
  
  @js.native
  sealed trait Property
    extends StObject
       with IdentifierKind
  /* 0 */ val Property: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property & Double = js.native
  
  @js.native
  sealed trait Reference
    extends StObject
       with IdentifierKind
  /* 5 */ val Reference: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference & Double = js.native
  
  @js.native
  sealed trait Template
    extends StObject
       with IdentifierKind
  /* 3 */ val Template: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with IdentifierKind
  /* 6 */ val Variable: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable & Double = js.native
}
