package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLPerformanceNavigation extends StObject {
  
  @JSName("MSHTML.HTMLPerformanceNavigation_typekey")
  var MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation = js.native
  
  val redirectCount: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  val `type`: Double = js.native
}
object HTMLPerformanceNavigation {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLPerformanceNavigation_typekey: HTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): HTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.HTMLPerformanceNavigation_typekey")(MSHTMLDotHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPerformanceNavigation]
  }
  
  @scala.inline
  implicit class HTMLPerformanceNavigationMutableBuilder[Self <: HTMLPerformanceNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotHTMLPerformanceNavigation_typekey(value: HTMLPerformanceNavigation): Self = StObject.set(x, "MSHTML.HTMLPerformanceNavigation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
