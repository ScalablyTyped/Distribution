package typings.angularCompiler.aotCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileInjectableMetadata
import typings.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgAnalyzedFileWithInjectables extends js.Object {
  
  var fileName: String = js.native
  
  var injectables: js.Array[CompileInjectableMetadata] = js.native
  
  var shallowModules: js.Array[CompileShallowModuleMetadata] = js.native
}
object NgAnalyzedFileWithInjectables {
  
  @scala.inline
  def apply(
    fileName: String,
    injectables: js.Array[CompileInjectableMetadata],
    shallowModules: js.Array[CompileShallowModuleMetadata]
  ): NgAnalyzedFileWithInjectables = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], injectables = injectables.asInstanceOf[js.Any], shallowModules = shallowModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgAnalyzedFileWithInjectables]
  }
  
  @scala.inline
  implicit class NgAnalyzedFileWithInjectablesOps[Self <: NgAnalyzedFileWithInjectables] (val x: Self) extends AnyVal {
    
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
    def setInjectablesVarargs(value: CompileInjectableMetadata*): Self = this.set("injectables", js.Array(value :_*))
    
    @scala.inline
    def setInjectables(value: js.Array[CompileInjectableMetadata]): Self = this.set("injectables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShallowModulesVarargs(value: CompileShallowModuleMetadata*): Self = this.set("shallowModules", js.Array(value :_*))
    
    @scala.inline
    def setShallowModules(value: js.Array[CompileShallowModuleMetadata]): Self = this.set("shallowModules", value.asInstanceOf[js.Any])
  }
}
