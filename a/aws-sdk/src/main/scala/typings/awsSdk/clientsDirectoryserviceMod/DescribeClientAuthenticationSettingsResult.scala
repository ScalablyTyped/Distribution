package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientAuthenticationSettingsResult extends StObject {
  
  /**
    * Information about the type of client authentication for the specified directory. The following information is retrieved: The date and time when the status of the client authentication type was last updated, whether the client authentication type is enabled or disabled, and the type of client authentication.
    */
  var ClientAuthenticationSettingsInfo: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.ClientAuthenticationSettingsInfo] = js.undefined
  
  /**
    * The next token used to retrieve the client authentication settings if the number of setting types exceeds page limit and there is another page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object DescribeClientAuthenticationSettingsResult {
  
  inline def apply(): DescribeClientAuthenticationSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientAuthenticationSettingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientAuthenticationSettingsResult] (val x: Self) extends AnyVal {
    
    inline def setClientAuthenticationSettingsInfo(value: ClientAuthenticationSettingsInfo): Self = StObject.set(x, "ClientAuthenticationSettingsInfo", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationSettingsInfoUndefined: Self = StObject.set(x, "ClientAuthenticationSettingsInfo", js.undefined)
    
    inline def setClientAuthenticationSettingsInfoVarargs(value: ClientAuthenticationSettingInfo*): Self = StObject.set(x, "ClientAuthenticationSettingsInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
