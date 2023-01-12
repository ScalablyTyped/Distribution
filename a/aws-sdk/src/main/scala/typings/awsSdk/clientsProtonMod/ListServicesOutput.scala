package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next service in the array of services, after the current requested list of services.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of services with summaries of detail data.
    */
  var services: ServiceSummaryList
}
object ListServicesOutput {
  
  inline def apply(services: ServiceSummaryList): ListServicesOutput = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServicesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServices(value: ServiceSummaryList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: ServiceSummary*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
