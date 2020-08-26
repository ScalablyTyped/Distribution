package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAs extends js.Object {
  var exportAs: String = js.native
  var symbol: StaticSymbol = js.native
}

object ExportAs {
  @scala.inline
  def apply(exportAs: String, symbol: StaticSymbol): ExportAs = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAs]
  }
  @scala.inline
  implicit class ExportAsOps[Self <: ExportAs] (val x: Self) extends AnyVal {
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
    def setExportAs(value: String): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: StaticSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

