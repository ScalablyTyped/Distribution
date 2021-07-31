package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLTimeRanges extends StObject {
  
  @JSName("MSHTML.IHTMLTimeRanges_typekey")
  var MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges
  
  def end(index: Double): Double
  
  val length: Double
  
  def start(index: Double): Double
}
object IHTMLTimeRanges {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLTimeRanges_typekey: IHTMLTimeRanges,
    end: Double => Double,
    length: Double,
    start: Double => Double
  ): IHTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start))
    __obj.updateDynamic("MSHTML.IHTMLTimeRanges_typekey")(MSHTMLDotIHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTimeRanges]
  }
  
  @scala.inline
  implicit class IHTMLTimeRangesMutableBuilder[Self <: IHTMLTimeRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLTimeRanges_typekey(value: IHTMLTimeRanges): Self = StObject.set(x, "MSHTML.IHTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
  }
}
