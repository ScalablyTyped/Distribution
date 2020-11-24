package typings.angularCompiler.anon

import typings.angularCompiler.srcSummaryResolverMod.Summary
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleName extends js.Object {
  
  var importAs: js.Array[ImportAs] = js.native
  
  var moduleName: String | Null = js.native
  
  var summaries: js.Array[Summary[StaticSymbol]] = js.native
}
object ModuleName {
  
  @scala.inline
  def apply(importAs: js.Array[ImportAs], summaries: js.Array[Summary[StaticSymbol]]): ModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
  
  @scala.inline
  implicit class ModuleNameOps[Self <: ModuleName] (val x: Self) extends AnyVal {
    
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
    def setImportAsVarargs(value: ImportAs*): Self = this.set("importAs", js.Array(value :_*))
    
    @scala.inline
    def setImportAs(value: js.Array[ImportAs]): Self = this.set("importAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesVarargs(value: Summary[StaticSymbol]*): Self = this.set("summaries", js.Array(value :_*))
    
    @scala.inline
    def setSummaries(value: js.Array[Summary[StaticSymbol]]): Self = this.set("summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleNameNull: Self = this.set("moduleName", null)
  }
}
