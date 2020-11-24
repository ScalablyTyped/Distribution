package typings.angularCompiler.anon

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAs extends js.Object {
  
  var importAs: StaticSymbol = js.native
  
  var symbol: StaticSymbol = js.native
}
object ImportAs {
  
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAs]
  }
  
  @scala.inline
  implicit class ImportAsOps[Self <: ImportAs] (val x: Self) extends AnyVal {
    
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
    def setImportAs(value: StaticSymbol): Self = this.set("importAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: StaticSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
