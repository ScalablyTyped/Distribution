package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsStrings.active
import typings.antDesignProUtils.antDesignProUtilsStrings.exception
import typings.antDesignProUtils.antDesignProUtilsStrings.normal
import typings.antDesignProUtils.antDesignProUtilsStrings.success
import typings.antDesignProUtils.typingMod.ProFieldRequestData
import typings.antDesignProUtils.typingMod.RequestOptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale[Type] extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
  
  var moneySymbol: js.UndefOr[Boolean] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var request: js.UndefOr[ProFieldRequestData[Any]] = js.undefined
  
  var showColor: js.UndefOr[Boolean] = js.undefined
  
  /** Percent */
  var showSymbol: js.UndefOr[(js.Function1[/* value */ Any, Boolean]) | Boolean] = js.undefined
  
  var status: js.UndefOr[normal | active | success | exception] = js.undefined
  
  var `type`: Type
  
  /** Image */
  var width: js.UndefOr[Double] = js.undefined
}
object Locale {
  
  inline def apply[Type](`type`: Type): Locale[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale[Type]]
  }
  
  extension [Self <: Locale[?], Type](x: Self & Locale[Type]) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMoneySymbol(value: Boolean): Self = StObject.set(x, "moneySymbol", value.asInstanceOf[js.Any])
    
    inline def setMoneySymbolUndefined: Self = StObject.set(x, "moneySymbol", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRequest(value: (Any, /* props */ Any) => js.Promise[js.Array[RequestOptionsType]]): Self = StObject.set(x, "request", js.Any.fromFunction2(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setShowColor(value: Boolean): Self = StObject.set(x, "showColor", value.asInstanceOf[js.Any])
    
    inline def setShowColorUndefined: Self = StObject.set(x, "showColor", js.undefined)
    
    inline def setShowSymbol(value: (js.Function1[/* value */ Any, Boolean]) | Boolean): Self = StObject.set(x, "showSymbol", value.asInstanceOf[js.Any])
    
    inline def setShowSymbolFunction1(value: /* value */ Any => Boolean): Self = StObject.set(x, "showSymbol", js.Any.fromFunction1(value))
    
    inline def setShowSymbolUndefined: Self = StObject.set(x, "showSymbol", js.undefined)
    
    inline def setStatus(value: normal | active | success | exception): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
