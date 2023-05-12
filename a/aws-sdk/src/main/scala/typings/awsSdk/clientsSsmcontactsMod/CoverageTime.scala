package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageTime extends StObject {
  
  /**
    * Information about when the on-call rotation shift ends.
    */
  var End: js.UndefOr[HandOffTime] = js.undefined
  
  /**
    * Information about when the on-call rotation shift begins.
    */
  var Start: js.UndefOr[HandOffTime] = js.undefined
}
object CoverageTime {
  
  inline def apply(): CoverageTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageTime] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: HandOffTime): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: HandOffTime): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
