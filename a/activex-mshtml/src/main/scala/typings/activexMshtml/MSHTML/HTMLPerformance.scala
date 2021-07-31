package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLPerformance extends StObject {
  
  @JSName("MSHTML.HTMLPerformance_typekey")
  var MSHTMLDotHTMLPerformance_typekey: HTMLPerformance
  
  val navigation: IHTMLPerformanceNavigation
  
  val timing: IHTMLPerformanceTiming
  
  def toJSON(): js.Any
}
object HTMLPerformance {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformance_typekey: HTMLPerformance,
    navigation: IHTMLPerformanceNavigation,
    timing: IHTMLPerformanceTiming,
    toJSON: () => js.Any
  ): HTMLPerformance = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformance_typekey")(MSHTMLDotHTMLPerformance_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformance]
  }
  
  @scala.inline
  implicit class HTMLPerformanceMutableBuilder[Self <: HTMLPerformance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotHTMLPerformance_typekey(value: HTMLPerformance): Self = StObject.set(x, "MSHTML.HTMLPerformance_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: IHTMLPerformanceNavigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: IHTMLPerformanceTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
