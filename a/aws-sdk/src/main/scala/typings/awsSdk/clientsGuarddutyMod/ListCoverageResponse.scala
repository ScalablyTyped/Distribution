package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCoverageResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resources and their attributes providing cluster details.
    */
  var Resources: CoverageResources
}
object ListCoverageResponse {
  
  inline def apply(Resources: CoverageResources): ListCoverageResponse = {
    val __obj = js.Dynamic.literal(Resources = Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCoverageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCoverageResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResources(value: CoverageResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: CoverageResource*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
