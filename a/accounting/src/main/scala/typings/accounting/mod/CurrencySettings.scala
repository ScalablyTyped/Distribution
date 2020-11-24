package typings.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencySettings[TFormat] extends js.Object {
  
      // controls output: %s = symbol, %v = value/number
  var decimal: js.UndefOr[String] = js.native
  
       // default currency symbol is '$'
  var format: js.UndefOr[TFormat] = js.native
  
     // thousands separator
  var precision: js.UndefOr[Double] = js.native
  
  var symbol: js.UndefOr[String] = js.native
  
      // decimal point separator
  var thousand: js.UndefOr[String] = js.native
}
object CurrencySettings {
  
  @scala.inline
  def apply[TFormat](): CurrencySettings[TFormat] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrencySettings[TFormat]]
  }
  
  @scala.inline
  implicit class CurrencySettingsOps[Self <: CurrencySettings[_], TFormat] (val x: Self with CurrencySettings[TFormat]) extends AnyVal {
    
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setFormat(value: TFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setThousand(value: String): Self = this.set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousand: Self = this.set("thousand", js.undefined)
  }
}
