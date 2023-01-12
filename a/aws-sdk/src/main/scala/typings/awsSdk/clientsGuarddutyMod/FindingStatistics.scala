package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingStatistics extends StObject {
  
  /**
    * Represents a map of severity to count statistics for a set of findings.
    */
  var CountBySeverity: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CountBySeverity] = js.undefined
}
object FindingStatistics {
  
  inline def apply(): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingStatistics] (val x: Self) extends AnyVal {
    
    inline def setCountBySeverity(value: CountBySeverity): Self = StObject.set(x, "CountBySeverity", value.asInstanceOf[js.Any])
    
    inline def setCountBySeverityUndefined: Self = StObject.set(x, "CountBySeverity", js.undefined)
  }
}
