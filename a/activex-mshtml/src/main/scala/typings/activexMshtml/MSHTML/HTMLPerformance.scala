package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPerformance extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLPerformance_typekey")
  var MSHTMLDotHTMLPerformance_typekey: HTMLPerformance
  
  val navigation: IHTMLPerformanceNavigation
  
  val timing: IHTMLPerformanceTiming
  
  def toJSON(): Any
}
object HTMLPerformance {
  
  inline def apply(
    MSHTMLDotHTMLPerformance_typekey: HTMLPerformance,
    navigation: IHTMLPerformanceNavigation,
    timing: IHTMLPerformanceTiming,
    toJSON: () => Any
  ): HTMLPerformance = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformance_typekey")(MSHTMLDotHTMLPerformance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformance]
  }
  
  extension [Self <: HTMLPerformance](x: Self) {
    
    inline def setMSHTMLDotHTMLPerformance_typekey(value: HTMLPerformance): Self = StObject.set(x, "MSHTML.HTMLPerformance_typekey", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: IHTMLPerformanceNavigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setTiming(value: IHTMLPerformanceTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
