package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLTimeRanges extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLTimeRanges_typekey")
  var MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges
  
  def end(index: Double): Double
  
  def endDouble(index: Double): Double
  
  val length: Double
  
  def start(index: Double): Double
  
  def startDouble(index: Double): Double
}
object HTMLTimeRanges {
  
  inline def apply(
    MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges,
    end: Double => Double,
    endDouble: Double => Double,
    length: Double,
    start: Double => Double,
    startDouble: Double => Double
  ): HTMLTimeRanges = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), endDouble = js.Any.fromFunction1(endDouble), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction1(start), startDouble = js.Any.fromFunction1(startDouble))
    __obj.updateDynamic("MSHTML.HTMLTimeRanges_typekey")(MSHTMLDotHTMLTimeRanges_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTimeRanges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLTimeRanges] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEndDouble(value: Double => Double): Self = StObject.set(x, "endDouble", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLTimeRanges_typekey(value: HTMLTimeRanges): Self = StObject.set(x, "MSHTML.HTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartDouble(value: Double => Double): Self = StObject.set(x, "startDouble", js.Any.fromFunction1(value))
  }
}
