package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogSubscriptionsResult extends StObject {
  
  /**
    * A list of active LogSubscription objects for calling the Amazon Web Services account.
    */
  var LogSubscriptions: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.LogSubscriptions] = js.undefined
  
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object ListLogSubscriptionsResult {
  
  inline def apply(): ListLogSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogSubscriptionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLogSubscriptionsResult] (val x: Self) extends AnyVal {
    
    inline def setLogSubscriptions(value: LogSubscriptions): Self = StObject.set(x, "LogSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setLogSubscriptionsUndefined: Self = StObject.set(x, "LogSubscriptions", js.undefined)
    
    inline def setLogSubscriptionsVarargs(value: LogSubscription*): Self = StObject.set(x, "LogSubscriptions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
