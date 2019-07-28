package typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputEmitter extends js.Object {
  def emitStatements(genFilePath: String, stmts: js.Array[Statement]): String = js.native
  def emitStatements(genFilePath: String, stmts: js.Array[Statement], preamble: String): String = js.native
}

