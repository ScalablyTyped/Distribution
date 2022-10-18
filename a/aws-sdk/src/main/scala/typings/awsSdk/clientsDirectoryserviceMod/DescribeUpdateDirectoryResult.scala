package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUpdateDirectoryResult extends StObject {
  
  /**
    *  If not null, more results are available. Pass this value for the NextToken parameter. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    *  The list of update activities on a directory for the requested update type. 
    */
  var UpdateActivities: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.UpdateActivities] = js.undefined
}
object DescribeUpdateDirectoryResult {
  
  inline def apply(): DescribeUpdateDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateDirectoryResult]
  }
  
  extension [Self <: DescribeUpdateDirectoryResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUpdateActivities(value: UpdateActivities): Self = StObject.set(x, "UpdateActivities", value.asInstanceOf[js.Any])
    
    inline def setUpdateActivitiesUndefined: Self = StObject.set(x, "UpdateActivities", js.undefined)
    
    inline def setUpdateActivitiesVarargs(value: UpdateInfoEntry*): Self = StObject.set(x, "UpdateActivities", js.Array(value*))
  }
}
