package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLPerformanceNavigation extends StObject {
  
  @JSName("MSHTML.IHTMLPerformanceNavigation_typekey")
  var MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation = js.native
  
  val redirectCount: Double = js.native
  
  def toJSON(): js.Any = js.native
  
  val `type`: Double = js.native
}
object IHTMLPerformanceNavigation {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLPerformanceNavigation_typekey: IHTMLPerformanceNavigation,
    redirectCount: Double,
    toJSON: () => js.Any,
    `type`: Double
  ): IHTMLPerformanceNavigation = {
    val __obj = js.Dynamic.literal(redirectCount = redirectCount.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("MSHTML.IHTMLPerformanceNavigation_typekey")(MSHTMLDotIHTMLPerformanceNavigation_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLPerformanceNavigation]
  }
  
  @scala.inline
  implicit class IHTMLPerformanceNavigationMutableBuilder[Self <: IHTMLPerformanceNavigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLPerformanceNavigation_typekey(value: IHTMLPerformanceNavigation): Self = StObject.set(x, "MSHTML.IHTMLPerformanceNavigation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectCount(value: Double): Self = StObject.set(x, "redirectCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
