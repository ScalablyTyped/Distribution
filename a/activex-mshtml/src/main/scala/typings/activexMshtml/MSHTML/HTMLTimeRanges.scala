package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLTimeRanges extends js.Object {
  
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
  implicit class HTMLTimeRangesOps[Self <: HTMLTimeRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotHTMLTimeRanges_typekey(value: HTMLTimeRanges): Self = this.set("MSHTML.HTMLTimeRanges_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double => Double): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndDouble(value: Double => Double): Self = this.set("endDouble", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double => Double): Self = this.set("start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDouble(value: Double => Double): Self = this.set("startDouble", js.Any.fromFunction1(value))
  }
}
