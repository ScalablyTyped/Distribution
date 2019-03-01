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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("statements")(statements)
    __obj.asInstanceOf[PartialModule]
  }
}

