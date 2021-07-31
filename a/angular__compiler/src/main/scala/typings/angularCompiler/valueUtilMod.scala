package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("@angular/compiler/src/output/value_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/output/value_util", "QUOTED_KEYS")
  @js.native
  val QUOTED_KEYS: /* "$quoted$" */ String = js.native
  
  @scala.inline
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToOutputAst")(ctx.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Expression]
  @scala.inline
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertValueToOutputAst")(ctx.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Expression]
}
