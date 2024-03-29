package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDashboardDefinitionRequest extends StObject {
  
  /**
    * The alias name.
    */
  var AliasName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AliasName] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that contains the dashboard that you're describing.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the dashboard.
    */
  var DashboardId: ShortRestrictiveResourceId
  
  /**
    * The version number for the dashboard. If a version number isn't passed, the latest published dashboard version is described. 
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.clientsQuicksightMod.VersionNumber] = js.undefined
}
object DescribeDashboardDefinitionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DashboardId: ShortRestrictiveResourceId): DescribeDashboardDefinitionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDashboardDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDashboardId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "DashboardId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
