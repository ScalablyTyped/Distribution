package typings.atAngularCompiler.srcAotPartialUnderscoreModuleMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialModule extends js.Object {
  var fileName: String
  var statements: js.Array[Statement]
}

object PartialModule {
  @scala.inline
  def apply(fileName: String, statements: js.Array[Statement]): PartialModule = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartialModule]
  }
}

