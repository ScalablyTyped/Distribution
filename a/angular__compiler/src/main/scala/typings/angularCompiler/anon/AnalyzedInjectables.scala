package typings.angularCompiler.anon

import typings.angularCompiler.aotCompilerMod.NgAnalyzedFileWithInjectables
import typings.angularCompiler.aotCompilerMod.NgAnalyzedModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzedInjectables extends js.Object {
  
  var analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables] = js.native
  
  var analyzedModules: NgAnalyzedModules = js.native
}
object AnalyzedInjectables {
  
  @scala.inline
  def apply(analyzedInjectables: js.Array[NgAnalyzedFileWithInjectables], analyzedModules: NgAnalyzedModules): AnalyzedInjectables = {
    val __obj = js.Dynamic.literal(analyzedInjectables = analyzedInjectables.asInstanceOf[js.Any], analyzedModules = analyzedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedInjectables]
  }
  
  @scala.inline
  implicit class AnalyzedInjectablesOps[Self <: AnalyzedInjectables] (val x: Self) extends AnyVal {
    
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
    def setAnalyzedInjectablesVarargs(value: NgAnalyzedFileWithInjectables*): Self = this.set("analyzedInjectables", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzedInjectables(value: js.Array[NgAnalyzedFileWithInjectables]): Self = this.set("analyzedInjectables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzedModules(value: NgAnalyzedModules): Self = this.set("analyzedModules", value.asInstanceOf[js.Any])
  }
}
