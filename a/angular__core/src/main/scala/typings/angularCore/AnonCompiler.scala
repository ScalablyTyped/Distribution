package typings.angularCore

import typings.angularCompiler.mod.AotCompiler
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompiler extends js.Object {
  var compiler: AotCompiler
  var host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any
  var ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any
  var program: Program
}

object AnonCompiler {
  @scala.inline
  def apply(
    compiler: AotCompiler,
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any,
    ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any,
    program: Program
  ): AnonCompiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ngcProgram = ngcProgram.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompiler]
  }
}

