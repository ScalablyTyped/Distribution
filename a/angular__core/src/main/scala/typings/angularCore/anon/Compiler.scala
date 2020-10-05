package typings.angularCore.anon

import typings.angularCompiler.aotCompilerMod.AotCompiler
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler extends js.Object {
  var compiler: AotCompiler = js.native
  var host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any = js.native
  var ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any = js.native
  var program: Program = js.native
}

object Compiler {
  @scala.inline
  def apply(
    compiler: AotCompiler,
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any,
    ngcProgram: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any,
    program: Program
  ): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ngcProgram = ngcProgram.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
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
    def setCompiler(value: AotCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerHost */ js.Any
    ): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgcProgram(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_compiler-cli.Program */ js.Any
    ): Self = this.set("ngcProgram", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgram(value: Program): Self = this.set("program", value.asInstanceOf[js.Any])
  }
  
}

