package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.linguistic2.XHyphenator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Hyphenation options passed in calls to {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakHyphenationOptions extends StObject {
  
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
  implicit class LineBreakHyphenationOptionsMutableBuilder[Self <: LineBreakHyphenationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAHyphenationOptions(value: PropertyValues): Self = StObject.set(x, "aHyphenationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAHyphenationOptionsVarargs(value: PropertyValue*): Self = StObject.set(x, "aHyphenationOptions", js.Array(value :_*))
    
    @scala.inline
    def setHyphenIndex(value: Double): Self = StObject.set(x, "hyphenIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRHyphenator(value: XHyphenator): Self = StObject.set(x, "rHyphenator", value.asInstanceOf[js.Any])
  }
}
