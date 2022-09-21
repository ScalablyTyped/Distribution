package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "DeclareVarStmt")
@js.native
open class DeclareVarStmt protected () extends Statement {
  def this(
    name: String,
    value: js.UndefOr[Expression],
    `type`: js.UndefOr[Type | Null],
    modifiers: js.UndefOr[StmtModifier],
    sourceSpan: js.UndefOr[ParseSourceSpan | Null],
    leadingComments: js.UndefOr[js.Array[LeadingComment_]]
  ) = this()
  
  var name: String = js.native
  
  var `type`: Type | Null = js.native
  
  var value: js.UndefOr[Expression] = js.native
}
