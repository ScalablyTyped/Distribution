package typings.angularCore.sourceFileExportsMod

import typings.typescript.mod.Identifier
import typings.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedExport extends js.Object {
  var exportName: String = js.native
  var identifier: Identifier = js.native
  var symbol: Symbol = js.native
}

object ResolvedExport {
  @scala.inline
  def apply(exportName: String, identifier: Identifier, symbol: Symbol): ResolvedExport = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedExport]
  }
  @scala.inline
  implicit class ResolvedExportOps[Self <: ResolvedExport] (val x: Self) extends AnyVal {
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
    def setExportName(value: String): Self = this.set("exportName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Symbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

