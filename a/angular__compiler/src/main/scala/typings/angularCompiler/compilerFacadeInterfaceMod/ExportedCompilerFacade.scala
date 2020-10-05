package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedCompilerFacade extends js.Object {
  var ɵcompilerFacade: CompilerFacade = js.native
}

object ExportedCompilerFacade {
  @scala.inline
  def apply(ɵcompilerFacade: CompilerFacade): ExportedCompilerFacade = {
    val __obj = js.Dynamic.literal(ɵcompilerFacade = ɵcompilerFacade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedCompilerFacade]
  }
  @scala.inline
  implicit class ExportedCompilerFacadeOps[Self <: ExportedCompilerFacade] (val x: Self) extends AnyVal {
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
    def setƟcompilerFacade(value: CompilerFacade): Self = this.set("\u0275compilerFacade", value.asInstanceOf[js.Any])
  }
  
}

