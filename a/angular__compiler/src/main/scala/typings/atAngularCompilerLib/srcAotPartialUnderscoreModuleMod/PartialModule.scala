package typings
package atAngularCompilerLib.srcAotPartialUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialModule extends js.Object {
  var fileName: java.lang.String
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
}

object PartialModule {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): PartialModule = {
    val __obj = js.Dynamic.literal(fileName = fileName, statements = statements)
  
    __obj.asInstanceOf[PartialModule]
  }
}

