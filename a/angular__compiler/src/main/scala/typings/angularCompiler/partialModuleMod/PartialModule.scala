package typings.angularCompiler.partialModuleMod

import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialModule extends js.Object {
  var fileName: String = js.native
  var statements: js.Array[Statement] = js.native
}

object PartialModule {
  @scala.inline
  def apply(fileName: String, statements: js.Array[Statement]): PartialModule = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialModule]
  }
  @scala.inline
  implicit class PartialModuleOps[Self <: PartialModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[Statement]): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
  
}

