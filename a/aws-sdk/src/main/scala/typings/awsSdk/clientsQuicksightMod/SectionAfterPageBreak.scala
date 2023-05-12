package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionAfterPageBreak extends StObject {
  
  /**
    * The option that enables or disables a page break at the end of a section.
    */
  var Status: js.UndefOr[SectionPageBreakStatus] = js.undefined
}
object SectionAfterPageBreak {
  
  inline def apply(): SectionAfterPageBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionAfterPageBreak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionAfterPageBreak] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SectionPageBreakStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
