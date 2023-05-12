package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchVulnerabilitiesFilterCriteria extends StObject {
  
  /**
    * The IDs for specific vulnerabilities.
    */
  var vulnerabilityIds: VulnIdList
}
object SearchVulnerabilitiesFilterCriteria {
  
  inline def apply(vulnerabilityIds: VulnIdList): SearchVulnerabilitiesFilterCriteria = {
    val __obj = js.Dynamic.literal(vulnerabilityIds = vulnerabilityIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchVulnerabilitiesFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchVulnerabilitiesFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setVulnerabilityIds(value: VulnIdList): Self = StObject.set(x, "vulnerabilityIds", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityIdsVarargs(value: VulnId*): Self = StObject.set(x, "vulnerabilityIds", js.Array(value*))
  }
}
