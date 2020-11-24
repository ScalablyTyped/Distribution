package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitCCPOptions extends js.Object {
  
  /**
    * The URL of the CCP.
    * This is the page you would normally navigate to in order to use the CCP in a standalone page, it is different for each instance.
    */
  val ccpUrl: String = js.native
  
  /**
    * Set to `false` to disable the login popup which is shown when the user's authentication expires.
    * @default true
    */
  val loginPopup: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to `true` in conjunction with the `loginPopup` parameter to automatically close the login Popup window once the authentication step has completed.
    * If the login page opened in a new tab, this parameter will also auto-close that tab.
    * @default false
    */
  val loginPopupAutoClose: js.UndefOr[Boolean] = js.native
  
  /** Allows custom URL to be used to initiate the ccp, as in the case of SAML authentication. */
  val loginUrl: js.UndefOr[String] = js.native
  
  /**
    * Amazon connect instance region. Only required for chat channel.
    * @example "us-west-2"
    */
  val region: js.UndefOr[String] = js.native
  
  /** Allows you to specify some settings surrounding the softphone feature of Connect. */
  val softphone: js.UndefOr[SoftPhoneOptions] = js.native
}
object InitCCPOptions {
  
  @scala.inline
  def apply(ccpUrl: String): InitCCPOptions = {
    val __obj = js.Dynamic.literal(ccpUrl = ccpUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitCCPOptions]
  }
  
  @scala.inline
  implicit class InitCCPOptionsOps[Self <: InitCCPOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCcpUrl(value: String): Self = this.set("ccpUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginPopup(value: Boolean): Self = this.set("loginPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginPopup: Self = this.set("loginPopup", js.undefined)
    
    @scala.inline
    def setLoginPopupAutoClose(value: Boolean): Self = this.set("loginPopupAutoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginPopupAutoClose: Self = this.set("loginPopupAutoClose", js.undefined)
    
    @scala.inline
    def setLoginUrl(value: String): Self = this.set("loginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginUrl: Self = this.set("loginUrl", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setSoftphone(value: SoftPhoneOptions): Self = this.set("softphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftphone: Self = this.set("softphone", js.undefined)
  }
}
