package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchVulnerabilitiesResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Details about the listed vulnerability.
    */
  var vulnerabilities: Vulnerabilities
}
object SearchVulnerabilitiesResponse {
  
  inline def apply(vulnerabilities: Vulnerabilities): SearchVulnerabilitiesResponse = {
    val __obj = js.Dynamic.literal(vulnerabilities = vulnerabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchVulnerabilitiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchVulnerabilitiesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVulnerabilities(value: Vulnerabilities): Self = StObject.set(x, "vulnerabilities", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitiesVarargs(value: Vulnerability*): Self = StObject.set(x, "vulnerabilities", js.Array(value*))
  }
}
