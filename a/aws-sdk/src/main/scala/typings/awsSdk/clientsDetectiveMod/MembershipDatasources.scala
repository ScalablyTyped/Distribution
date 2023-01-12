package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipDatasources extends StObject {
  
  /**
    * The account identifier of the Amazon Web Services account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsDetectiveMod.AccountId] = js.undefined
  
  /**
    * Details on when a data source package was added to a behavior graph.
    */
  var DatasourcePackageIngestHistory: js.UndefOr[typings.awsSdk.clientsDetectiveMod.DatasourcePackageIngestHistory] = js.undefined
  
  /**
    * The ARN of the organization behavior graph.
    */
  var GraphArn: js.UndefOr[typings.awsSdk.clientsDetectiveMod.GraphArn] = js.undefined
}
object MembershipDatasources {
  
  inline def apply(): MembershipDatasources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipDatasources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MembershipDatasources] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDatasourcePackageIngestHistory(value: DatasourcePackageIngestHistory): Self = StObject.set(x, "DatasourcePackageIngestHistory", value.asInstanceOf[js.Any])
    
    inline def setDatasourcePackageIngestHistoryUndefined: Self = StObject.set(x, "DatasourcePackageIngestHistory", js.undefined)
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setGraphArnUndefined: Self = StObject.set(x, "GraphArn", js.undefined)
  }
}
