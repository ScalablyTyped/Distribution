package typings.angularCore.documentImportVisitorMod

import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedDocumentImport extends js.Object {
  
  var commonImport: NamedImports | Null = js.native
  
  var documentElement: ImportSpecifier | Null = js.native
  
  var platformBrowserImport: NamedImports | Null = js.native
}
object ResolvedDocumentImport {
  
  @scala.inline
  def apply(): ResolvedDocumentImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedDocumentImport]
  }
  
  @scala.inline
  implicit class ResolvedDocumentImportOps[Self <: ResolvedDocumentImport] (val x: Self) extends AnyVal {
    
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
    def setCommonImport(value: NamedImports): Self = this.set("commonImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonImportNull: Self = this.set("commonImport", null)
    
    @scala.inline
    def setDocumentElement(value: ImportSpecifier): Self = this.set("documentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentElementNull: Self = this.set("documentElement", null)
    
    @scala.inline
    def setPlatformBrowserImport(value: NamedImports): Self = this.set("platformBrowserImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformBrowserImportNull: Self = this.set("platformBrowserImport", null)
  }
}
