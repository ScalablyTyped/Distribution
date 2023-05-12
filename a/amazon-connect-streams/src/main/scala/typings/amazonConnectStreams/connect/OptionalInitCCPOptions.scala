package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalInitCCPOptions extends StObject {
  
  /** A timeout in ms that indicates how long streams will wait for the iframed CCP to respond to its SYNCHRONIZE event emissions. These happen continuously from the first time initCCP is called. They should only appear when there is a problem that requires a refresh or a re-login */
  val ccpAckTimeout: js.UndefOr[Double] = js.undefined
  
  /** A timeout in ms that indicates how long streams will wait for the initial ACKNOWLEDGE event from the shared worker while the CCP is still standing itself up. */
  val ccpLoadTimeout: js.UndefOr[Double] = js.undefined
  
  /** A timeout in ms that indicates how long streams will wait to send a new SYNCHRONIZE event to the iframed CCP. These happens continuously from the first time initCCP is called. */
  val ccpSynTimeout: js.UndefOr[Double] = js.undefined
  
  /** Allows you to specify ringtone settings for Chat. */
  val chat: js.UndefOr[ChatOptions] = js.undefined
  
  /**
    * Options to open login popup in a new window instead of a new tab. If loginPopup is set to
    * `false`, these options will be ignored.
    */
  val loginOptions: js.UndefOr[LoginOptions] = js.undefined
  
  /**
    * Set to `false` to disable the login popup which is shown when the user's authentication expires.
    * @default true
    */
  val loginPopup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` in conjunction with the `loginPopup` parameter to automatically close the login
    * Popup window once the authentication step has completed. If the login page opened in a new
    * tab, this parameter will also auto-close that tab.
    * @default false
    */
  val loginPopupAutoClose: js.UndefOr[Boolean] = js.undefined
  
  /** Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication. */
  val loginUrl: js.UndefOr[String] = js.undefined
  
  /** Allows you to configure which configuration sections are displayed in the settings tab. */
  val pageOptions: js.UndefOr[PageOptions] = js.undefined
  
  /**
    * Amazon connect instance region. Only required for chat channel.
    * @example "us-west-2"
    */
  val region: js.UndefOr[String] = js.undefined
  
  /** Allows you to specify some settings surrounding the softphone feature of Connect. */
  val softphone: js.UndefOr[SoftPhoneOptions] = js.undefined
}
object OptionalInitCCPOptions {
  
  inline def apply(): OptionalInitCCPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalInitCCPOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalInitCCPOptions] (val x: Self) extends AnyVal {
    
    inline def setCcpAckTimeout(value: Double): Self = StObject.set(x, "ccpAckTimeout", value.asInstanceOf[js.Any])
    
    inline def setCcpAckTimeoutUndefined: Self = StObject.set(x, "ccpAckTimeout", js.undefined)
    
    inline def setCcpLoadTimeout(value: Double): Self = StObject.set(x, "ccpLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setCcpLoadTimeoutUndefined: Self = StObject.set(x, "ccpLoadTimeout", js.undefined)
    
    inline def setCcpSynTimeout(value: Double): Self = StObject.set(x, "ccpSynTimeout", value.asInstanceOf[js.Any])
    
    inline def setCcpSynTimeoutUndefined: Self = StObject.set(x, "ccpSynTimeout", js.undefined)
    
    inline def setChat(value: ChatOptions): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
    
    inline def setLoginOptions(value: LoginOptions): Self = StObject.set(x, "loginOptions", value.asInstanceOf[js.Any])
    
    inline def setLoginOptionsUndefined: Self = StObject.set(x, "loginOptions", js.undefined)
    
    inline def setLoginPopup(value: Boolean): Self = StObject.set(x, "loginPopup", value.asInstanceOf[js.Any])
    
    inline def setLoginPopupAutoClose(value: Boolean): Self = StObject.set(x, "loginPopupAutoClose", value.asInstanceOf[js.Any])
    
    inline def setLoginPopupAutoCloseUndefined: Self = StObject.set(x, "loginPopupAutoClose", js.undefined)
    
    inline def setLoginPopupUndefined: Self = StObject.set(x, "loginPopup", js.undefined)
    
    inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
    
    inline def setPageOptions(value: PageOptions): Self = StObject.set(x, "pageOptions", value.asInstanceOf[js.Any])
    
    inline def setPageOptionsUndefined: Self = StObject.set(x, "pageOptions", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSoftphone(value: SoftPhoneOptions): Self = StObject.set(x, "softphone", value.asInstanceOf[js.Any])
    
    inline def setSoftphoneUndefined: Self = StObject.set(x, "softphone", js.undefined)
  }
}
