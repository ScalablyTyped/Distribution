package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationVersionsRequest extends StObject {
  
  /**
    * The name of the application for which you want to list all versions.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The maximum number of versions to list in this invocation of the operation.
    */
  var Limit: js.UndefOr[ListApplicationVersionsInputLimit] = js.undefined
  
  /**
    * If a previous invocation of this operation returned a pagination token, pass it into this value to retrieve the next set of results. For more information about pagination, see Using the Amazon Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.NextToken] = js.undefined
}
object ListApplicationVersionsRequest {
  
  inline def apply(ApplicationName: ApplicationName): ListApplicationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: ListApplicationVersionsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
