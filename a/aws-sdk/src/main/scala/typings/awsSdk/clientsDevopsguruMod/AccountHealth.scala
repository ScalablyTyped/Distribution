package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountHealth extends StObject {
  
  /**
    * The ID of the Amazon Web Services account. 
    */
  var AccountId: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    *  Information about the health of the Amazon Web Services resources in your account, including the number of open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights. 
    */
  var Insight: js.UndefOr[AccountInsightHealth] = js.undefined
}
object AccountHealth {
  
  inline def apply(): AccountHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountHealth] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setInsight(value: AccountInsightHealth): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
  }
}
