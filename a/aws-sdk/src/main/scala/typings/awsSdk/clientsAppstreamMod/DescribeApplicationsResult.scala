package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationsResult extends StObject {
  
  /**
    * The applications in the list.
    */
  var Applications: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Applications] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeApplicationsResult {
  
  inline def apply(): DescribeApplicationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationsResult]
  }
  
  extension [Self <: DescribeApplicationsResult](x: Self) {
    
    inline def setApplications(value: Applications): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: Application*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
