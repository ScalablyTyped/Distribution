package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory extends js.Object {
  var factory: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
}

object Anon_Factory {
  @scala.inline
  def apply(
    factory: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): Anon_Factory = {
    val __obj = js.Dynamic.literal(factory = factory, statements = statements)
  
    __obj.asInstanceOf[Anon_Factory]
  }
}

