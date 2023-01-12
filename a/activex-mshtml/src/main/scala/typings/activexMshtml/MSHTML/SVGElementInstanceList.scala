package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGElementInstanceList extends StObject {
  
  /* private */ @JSName("MSHTML.SVGElementInstanceList_typekey")
  var MSHTMLDotSVGElementInstanceList_typekey: SVGElementInstanceList
  
  def item(index: Double): ISVGElementInstance
  
  val length: Double
}
object SVGElementInstanceList {
  
  inline def apply(
    MSHTMLDotSVGElementInstanceList_typekey: SVGElementInstanceList,
    item: Double => ISVGElementInstance,
    length: Double
  ): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGElementInstanceList_typekey")(MSHTMLDotSVGElementInstanceList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGElementInstanceList] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Double => ISVGElementInstance): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGElementInstanceList_typekey(value: SVGElementInstanceList): Self = StObject.set(x, "MSHTML.SVGElementInstanceList_typekey", value.asInstanceOf[js.Any])
  }
}
