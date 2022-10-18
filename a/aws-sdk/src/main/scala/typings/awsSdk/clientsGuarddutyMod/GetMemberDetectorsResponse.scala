package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberDetectorsResponse extends StObject {
  
  /**
    * An object that describes which data sources are enabled for a member account.
    */
  var MemberDataSourceConfigurations: typings.awsSdk.clientsGuarddutyMod.MemberDataSourceConfigurations
  
  /**
    * A list of member account IDs that were unable to be processed along with an explanation for why they were not processed.
    */
  var UnprocessedAccounts: typings.awsSdk.clientsGuarddutyMod.UnprocessedAccounts
}
object GetMemberDetectorsResponse {
  
  inline def apply(
    MemberDataSourceConfigurations: MemberDataSourceConfigurations,
    UnprocessedAccounts: UnprocessedAccounts
  ): GetMemberDetectorsResponse = {
    val __obj = js.Dynamic.literal(MemberDataSourceConfigurations = MemberDataSourceConfigurations.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberDetectorsResponse]
  }
  
  extension [Self <: GetMemberDetectorsResponse](x: Self) {
    
    inline def setMemberDataSourceConfigurations(value: MemberDataSourceConfigurations): Self = StObject.set(x, "MemberDataSourceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMemberDataSourceConfigurationsVarargs(value: MemberDataSourceConfiguration*): Self = StObject.set(x, "MemberDataSourceConfigurations", js.Array(value*))
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
