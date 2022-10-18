package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLDAPSSettingsRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * Specifies the number of items that should be displayed on one page.
    */
  var Limit: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * The type of next token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * The type of LDAP security to enable. Currently only the value Client is supported.
    */
  var Type: js.UndefOr[LDAPSType] = js.undefined
}
object DescribeLDAPSSettingsRequest {
  
  inline def apply(DirectoryId: DirectoryId): DescribeLDAPSSettingsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLDAPSSettingsRequest]
  }
  
  extension [Self <: DescribeLDAPSSettingsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: PageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setType(value: LDAPSType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
