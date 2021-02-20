package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLTimeRanges extends StObject {
  
  @JSName("MSHTML.HTMLTimeRanges_typekey")
  var MSHTMLDotHTMLTimeRanges_typekey: HTMLTimeRanges = js.native
  
  def end(index: Double): Double = js.native
  
  def endDouble(index: Double): Double = js.native
  
  val length: Double = js.native
  
  def start(index: Double): Double = js.native
  
  def startDouble(index: Double): Double = js.native
}
object HTMLTimeRanges {
  
  @scala.inline
  def apply(
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
  implicit class HTMLTimeRangesMutableBuilder[Self <: HTMLTimeRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double => Double): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndDouble(value: Double => Double): Self = StObject.set(x, "endDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLTimeRanges_typekey(value: HTMLTimeRanges): Self = StObject.set(x, "MSHTML.HTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double => Double): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDouble(value: Double => Double): Self = StObject.set(x, "startDouble", js.Any.fromFunction1(value))
  }
}
