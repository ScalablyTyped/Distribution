package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitCCPOptions extends StObject {
  
  /**
    * The URL of the CCP.
    * This is the page you would normally navigate to in order to use the CCP in a standalone page, it is different for each instance.
    */
  val ccpUrl: String
  
  /**
    * Set to `false` to disable the login popup which is shown when the user's authentication expires.
    * @default true
    */
  val loginPopup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` in conjunction with the `loginPopup` parameter to automatically close the login Popup window once the authentication step has completed.
    * If the login page opened in a new tab, this parameter will also auto-close that tab.
    * @default false
    */
  val loginPopupAutoClose: js.UndefOr[Boolean] = js.undefined
  
  /** Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication. */
  val loginUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon connect instance region. Only required for chat channel.
    * @example "us-west-2"
    */
  val region: js.UndefOr[String] = js.undefined
  
  /** Allows you to specify some settings surrounding the softphone feature of Connect. */
  val softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
}
object InitCCPOptions {
  
  inline def apply(ccpUrl: String): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCCPOptions]
  }
  
  extension [Self <: InitCCPOptions](x: Self) {
    
    inline def setCcpUrl(value: String): Self = StObject.set(x, "ccpUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginPopup(value: Boolean): Self = StObject.set(x, "loginPopup", value.asInstanceOf[js.Any])
    
    inline def setLoginPopupAutoClose(value: Boolean): Self = StObject.set(x, "loginPopupAutoClose", value.asInstanceOf[js.Any])
    
    inline def setLoginPopupAutoCloseUndefined: Self = StObject.set(x, "loginPopupAutoClose", js.undefined)
    
    inline def setLoginPopupUndefined: Self = StObject.set(x, "loginPopup", js.undefined)
    
    inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSoftphone(value: SoftPhoneOptions): Self = StObject.set(x, "softphone", value.asInstanceOf[js.Any])
    
    inline def setSoftphoneUndefined: Self = StObject.set(x, "softphone", js.undefined)
  }
}
