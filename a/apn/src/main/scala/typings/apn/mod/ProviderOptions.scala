package typings.apn.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderOptions extends js.Object {
  
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs will be used. - You may need to use this as some environments don't include the CA used by Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[String | Buffer]] = js.native
  
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the certificate data. (Defaults to: `cert.pem`)
    */
  var cert: js.UndefOr[String | Buffer] = js.native
  
  /**
    * The maximum number of connection failures that will be tolerated before `apn` will "terminate". (Defaults to: 3)
    */
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  
  /**
    * The filename of the connection key to load from disk, or a Buffer/String containing the key data. (Defaults to: `key.pem`)
    */
  var key: js.UndefOr[String | Buffer] = js.native
  
  /**
    * The passphrase for the connection key, if required
    */
  var passphrase: js.UndefOr[String] = js.native
  
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[String | Buffer] = js.native
  
  /**
    * Specifies which environment to connect to: Production (if true) or Sandbox - The hostname will be set automatically. (Defaults to NODE_ENV == "production", i.e. false unless the NODE_ENV environment variable is set accordingly)
    */
  var production: js.UndefOr[Boolean] = js.native
  
  /**
    * Reject Unauthorized property to be passed through to tls.connect() (Defaults to `true`)
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration for Provider Authentication Tokens. (Defaults to: null i.e. fallback to Certificates)
    */
  var token: js.UndefOr[ProviderToken] = js.native
}
object ProviderOptions {
  
  @scala.inline
  def apply(): ProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderOptions]
  }
  
  @scala.inline
  implicit class ProviderOptionsOps[Self <: ProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: js.Array[String | Buffer]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setConnectionRetryLimit(value: Double): Self = this.set("connectionRetryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionRetryLimit: Self = this.set("connectionRetryLimit", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: String | Buffer): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setProduction(value: Boolean): Self = this.set("production", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduction: Self = this.set("production", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setToken(value: ProviderToken): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
