package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationFleetAssociationsResult extends StObject {
  
  /**
    * The application fleet associations in the list.
    */
  var ApplicationFleetAssociations: js.UndefOr[ApplicationFleetAssociationList] = js.undefined
  
  /**
    * The pagination token used to retrieve the next page of results for this operation.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeApplicationFleetAssociationsResult {
  
  inline def apply(): DescribeApplicationFleetAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeApplicationFleetAssociationsResult]
  }
  
  extension [Self <: DescribeApplicationFleetAssociationsResult](x: Self) {
    
    inline def setApplicationFleetAssociations(value: ApplicationFleetAssociationList): Self = StObject.set(x, "ApplicationFleetAssociations", value.asInstanceOf[js.Any])
    
    inline def setApplicationFleetAssociationsUndefined: Self = StObject.set(x, "ApplicationFleetAssociations", js.undefined)
    
    inline def setApplicationFleetAssociationsVarargs(value: ApplicationFleetAssociation*): Self = StObject.set(x, "ApplicationFleetAssociations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
