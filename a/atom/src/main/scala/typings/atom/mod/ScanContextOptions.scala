package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanContextOptions extends StObject {
  
  /** The number of lines before the matched line to include in the results object. */
  var leadingContextLineCount: js.UndefOr[Double] = js.undefined
  
  /** The number of lines after the matched line to include in the results object. */
  var trailingContextLineCount: js.UndefOr[Double] = js.undefined
}
object ScanContextOptions {
  
  @scala.inline
  def apply(): ScanContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanContextOptions]
  }
  
  @scala.inline
  implicit class ScanContextOptionsMutableBuilder[Self <: ScanContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeadingContextLineCount(value: Double): Self = StObject.set(x, "leadingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadingContextLineCountUndefined: Self = StObject.set(x, "leadingContextLineCount", js.undefined)
    
    @scala.inline
    def setTrailingContextLineCount(value: Double): Self = StObject.set(x, "trailingContextLineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingContextLineCountUndefined: Self = StObject.set(x, "trailingContextLineCount", js.undefined)
  }
}
