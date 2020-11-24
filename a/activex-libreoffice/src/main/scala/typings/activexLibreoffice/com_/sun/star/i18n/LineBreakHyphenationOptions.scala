package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.linguistic2.XHyphenator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Hyphenation options passed in calls to {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakHyphenationOptions extends js.Object {
  
  /** Sequence of property values to be used by the hyphenator - can be empty if the default values (from the property set) should be used. */
  var aHyphenationOptions: PropertyValues = js.native
  
  /** The first character not fitting to the current line, considering an additional "-" for hyphenation */
  var hyphenIndex: Double = js.native
  
  var rHyphenator: XHyphenator = js.native
}
object LineBreakHyphenationOptions {
  
  @scala.inline
  def apply(aHyphenationOptions: PropertyValues, hyphenIndex: Double, rHyphenator: XHyphenator): LineBreakHyphenationOptions = {
    val __obj = js.Dynamic.literal(aHyphenationOptions = aHyphenationOptions.asInstanceOf[js.Any], hyphenIndex = hyphenIndex.asInstanceOf[js.Any], rHyphenator = rHyphenator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakHyphenationOptions]
  }
  
  @scala.inline
  implicit class LineBreakHyphenationOptionsOps[Self <: LineBreakHyphenationOptions] (val x: Self) extends AnyVal {
    
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
    def setAHyphenationOptionsVarargs(value: PropertyValue*): Self = this.set("aHyphenationOptions", js.Array(value :_*))
    
    @scala.inline
    def setAHyphenationOptions(value: PropertyValues): Self = this.set("aHyphenationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyphenIndex(value: Double): Self = this.set("hyphenIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRHyphenator(value: XHyphenator): Self = this.set("rHyphenator", value.asInstanceOf[js.Any])
  }
}
