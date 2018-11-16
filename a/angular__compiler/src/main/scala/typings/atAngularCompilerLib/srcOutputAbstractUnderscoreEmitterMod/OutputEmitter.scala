package typings
package atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputEmitter extends js.Object {
  def emitStatements(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): java.lang.String = js.native
  def emitStatements(
    genFilePath: java.lang.String,
    stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    preamble: java.lang.String
  ): java.lang.String = js.native
}

