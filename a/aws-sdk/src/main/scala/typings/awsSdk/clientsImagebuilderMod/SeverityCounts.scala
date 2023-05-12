package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeverityCounts extends StObject {
  
  /**
    * The total number of findings across all severity levels for the specified filter.
    */
  var all: js.UndefOr[SeverityCountNumber] = js.undefined
  
  /**
    * The number of critical severity findings for the specified filter.
    */
  var critical: js.UndefOr[SeverityCountNumber] = js.undefined
  
  /**
    * The number of high severity findings for the specified filter.
    */
  var high: js.UndefOr[SeverityCountNumber] = js.undefined
  
  /**
    * The number of medium severity findings for the specified filter.
    */
  var medium: js.UndefOr[SeverityCountNumber] = js.undefined
}
object SeverityCounts {
  
  inline def apply(): SeverityCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeverityCounts] (val x: Self) extends AnyVal {
    
    inline def setAll(value: SeverityCountNumber): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setCritical(value: SeverityCountNumber): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setHigh(value: SeverityCountNumber): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setMedium(value: SeverityCountNumber): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
  }
}
