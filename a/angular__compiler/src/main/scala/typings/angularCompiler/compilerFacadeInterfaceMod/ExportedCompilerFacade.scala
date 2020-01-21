package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedCompilerFacade extends js.Object {
  var ɵcompilerFacade: CompilerFacade
}

object ExportedCompilerFacade {
  @scala.inline
  def apply(ɵcompilerFacade: CompilerFacade): ExportedCompilerFacade = {
    val __obj = js.Dynamic.literal(ɵcompilerFacade = ɵcompilerFacade.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportedCompilerFacade]
  }
}

