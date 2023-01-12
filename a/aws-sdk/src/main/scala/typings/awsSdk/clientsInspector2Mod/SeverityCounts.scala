package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeverityCounts extends StObject {
  
  /**
    * The total count of findings from all severities.
    */
  var all: js.UndefOr[Long] = js.undefined
  
  /**
    * The total count of critical severity findings.
    */
  var critical: js.UndefOr[Long] = js.undefined
  
  /**
    * The total count of high severity findings.
    */
  var high: js.UndefOr[Long] = js.undefined
  
  /**
    * The total count of medium severity findings.
    */
  var medium: js.UndefOr[Long] = js.undefined
}
object SeverityCounts {
  
  inline def apply(): SeverityCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeverityCounts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeverityCounts] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Long): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setCritical(value: Long): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setHigh(value: Long): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setMedium(value: Long): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
  }
}
