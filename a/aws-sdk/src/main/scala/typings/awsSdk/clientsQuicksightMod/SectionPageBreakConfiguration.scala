package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionPageBreakConfiguration extends StObject {
  
  /**
    * The configuration of a page break after a section.
    */
  var After: js.UndefOr[SectionAfterPageBreak] = js.undefined
}
object SectionPageBreakConfiguration {
  
  inline def apply(): SectionPageBreakConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionPageBreakConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionPageBreakConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: SectionAfterPageBreak): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "After", js.undefined)
  }
}
