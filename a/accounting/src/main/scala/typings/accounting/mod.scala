package typings.accounting

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("accounting", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait CurrencyFormat extends StObject {
    
    // for positive values, eg. "$ 1.00"
    var neg: js.UndefOr[String] = js.native
    
    var pos: String = js.native
    
    // for negative values, eg. "$ (1.00)"
    var zero: js.UndefOr[String] = js.native
  }
  object CurrencyFormat {
    
    @scala.inline
    def apply(pos: String): CurrencyFormat = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyFormat]
    }
    
    @scala.inline
    implicit class CurrencyFormatMutableBuilder[Self <: CurrencyFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNeg(value: String): Self = StObject.set(x, "neg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegUndefined: Self = StObject.set(x, "neg", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: String): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  @js.native
  trait CurrencySettings[TFormat] extends StObject {
    
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
    implicit class CurrencySettingsMutableBuilder[Self <: CurrencySettings[_], TFormat] (val x: Self with CurrencySettings[TFormat]) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setFormat(value: TFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
    }
  }
  
  @js.native
  trait NumberSettings extends StObject {
    
    var decimal: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    // default precision on numbers is 0
    var thousand: js.UndefOr[String] = js.native
  }
  object NumberSettings {
    
    @scala.inline
    def apply(): NumberSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberSettings]
    }
    
    @scala.inline
    implicit class NumberSettingsMutableBuilder[Self <: NumberSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setThousand(value: String): Self = StObject.set(x, "thousand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousandUndefined: Self = StObject.set(x, "thousand", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    var currency: CurrencySettings[_] = js.native
    
    // IAccountingCurrencySettings<string> or IAccountingCurrencySettings<IAccountingCurrencyFormat>
    var number: NumberSettings = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(currency: CurrencySettings[_], number: NumberSettings): Settings = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: CurrencySettings[_]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: NumberSettings): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Static extends StObject {
    
    // format a list of values for column-display
    def formatColumn(numbers: js.Array[js.Array[Double] | Double]): js.Array[String] = js.native
    def formatColumn(numbers: js.Array[js.Array[Double] | Double], options: CurrencySettings[CurrencyFormat | String]): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: js.UndefOr[scala.Nothing], precision: Double): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String, precision: Double): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String, precision: Double, thousand: String): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatColumn(
      numbers: js.Array[js.Array[Double] | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    
    // format any number or stringified number into currency
    def formatMoney(
      number: Double | String,
      symbol: js.UndefOr[String],
      precision: js.UndefOr[Double],
      thousand: js.UndefOr[String],
      decimal: js.UndefOr[String],
      format: js.UndefOr[String]
    ): String = js.native
    def formatMoney(number: String, options: CurrencySettings[CurrencyFormat | String]): String = js.native
    def formatMoney(number: Double, options: CurrencySettings[CurrencyFormat | String]): String = js.native
    // generic case (any array of numbers)
    def formatMoney(numbers: js.Array[_ | Double]): js.Array[String] = js.native
    def formatMoney(numbers: js.Array[_ | Double], options: CurrencySettings[CurrencyFormat | String]): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(numbers: js.Array[_ | Double], symbol: js.UndefOr[scala.Nothing], precision: Double): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: js.UndefOr[scala.Nothing],
      precision: Double,
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(numbers: js.Array[_ | Double], symbol: String): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(numbers: js.Array[_ | Double], symbol: String, precision: Double): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    def formatMoney(numbers: js.Array[_ | Double], symbol: String, precision: Double, thousand: String): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: js.UndefOr[scala.Nothing],
      format: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatMoney(
      numbers: js.Array[_ | Double],
      symbol: String,
      precision: Double,
      thousand: String,
      decimal: String,
      format: String
    ): js.Array[String] = js.native
    
    def formatNumber(number: js.Array[_ | Double]): js.Array[String] = js.native
    def formatNumber(number: js.Array[_ | Double], options: NumberSettings): js.Array[String] = js.native
    def formatNumber(
      number: js.Array[_ | Double],
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatNumber(number: js.Array[_ | Double], precision: js.UndefOr[scala.Nothing], thousand: String): js.Array[String] = js.native
    def formatNumber(
      number: js.Array[_ | Double],
      precision: js.UndefOr[scala.Nothing],
      thousand: String,
      decimal: String
    ): js.Array[String] = js.native
    def formatNumber(number: js.Array[_ | Double], precision: Double): js.Array[String] = js.native
    def formatNumber(
      number: js.Array[_ | Double],
      precision: Double,
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): js.Array[String] = js.native
    def formatNumber(number: js.Array[_ | Double], precision: Double, thousand: String): js.Array[String] = js.native
    def formatNumber(number: js.Array[_ | Double], precision: Double, thousand: String, decimal: String): js.Array[String] = js.native
    // format a number with custom precision and localisation
    def formatNumber(number: Double): String = js.native
    def formatNumber(number: Double, options: NumberSettings): String = js.native
    def formatNumber(
      number: Double,
      precision: js.UndefOr[scala.Nothing],
      thousand: js.UndefOr[scala.Nothing],
      decimal: String
    ): String = js.native
    def formatNumber(number: Double, precision: js.UndefOr[scala.Nothing], thousand: String): String = js.native
    def formatNumber(number: Double, precision: js.UndefOr[scala.Nothing], thousand: String, decimal: String): String = js.native
    def formatNumber(number: Double, precision: Double): String = js.native
    def formatNumber(number: Double, precision: Double, thousand: js.UndefOr[scala.Nothing], decimal: String): String = js.native
    def formatNumber(number: Double, precision: Double, thousand: String): String = js.native
    def formatNumber(number: Double, precision: Double, thousand: String, decimal: String): String = js.native
    
    // settings object that controls default parameters for library methods
    var settings: Settings = js.native
    
    // better rounding for floating point numbers
    def toFixed(number: Double): String = js.native
    def toFixed(number: Double, precision: Double): String = js.native
    
    // get a value from any formatted number/currency string
    def unformat(string: String): Double = js.native
    def unformat(string: String, decimal: String): Double = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
