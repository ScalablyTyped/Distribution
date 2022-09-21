package typings.angularCompilerCli.anon

import typings.angularCompilerCli.angularCompilerCliStrings.Exclamationmark
import typings.angularCompilerCli.angularCompilerCliStrings.Plussign
import typings.angularCompilerCli.angularCompilerCliStrings.Tilde
import typings.angularCompilerCli.angularCompilerCliStrings.`-_`
import typings.angularCompilerCli.angularCompilerCliStrings.`throw`
import typings.angularCompilerCli.angularCompilerCliStrings.delete
import typings.angularCompilerCli.angularCompilerCliStrings.typeof
import typings.angularCompilerCli.angularCompilerCliStrings.void
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.UnaryExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOperatorArgumentPrefix extends StObject {
  
  def apply(
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    argument: Expression
  ): UnaryExpression_ = js.native
  def apply(
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    argument: Expression,
    prefix: Boolean
  ): UnaryExpression_ = js.native
}
