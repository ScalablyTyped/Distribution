package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("@angular/compiler/src/output/value_util", "QUOTED_KEYS")
  @js.native
  val QUOTED_KEYS: /* "$quoted$" */ String = js.native
  
  @JSImport("@angular/compiler/src/output/value_util", "convertValueToOutputAst")
  @js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any): Expression = js.native
  @JSImport("@angular/compiler/src/output/value_util", "convertValueToOutputAst")
  @js.native
  def convertValueToOutputAst(ctx: OutputContext, value: js.Any, `type`: Type): Expression = js.native
}
