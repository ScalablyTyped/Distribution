package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutualTlsAuthentication extends js.Object {
  
  /**
    * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example s3://bucket-name/key-name. The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version. To update the truststore, you must have permissions to access the S3 object.
    */
  var truststoreUri: js.UndefOr[String] = js.native
  
  /**
    * The version of the S3 object that contains your truststore. To specify a version, you must have versioning enabled for the S3 bucket.
    */
  var truststoreVersion: js.UndefOr[String] = js.native
  
  /**
    * A list of warnings that API Gateway returns while processing your truststore. Invalid certificates produce warnings. Mutual TLS is still enabled, but some clients might not be able to access your API. To resolve warnings, upload a new truststore to S3, and then update you domain name to use the new version.
    */
  var truststoreWarnings: js.UndefOr[ListOfString] = js.native
}
object MutualTlsAuthentication {
  
  @scala.inline
  def apply(): MutualTlsAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutualTlsAuthentication]
  }
  
  @scala.inline
  implicit class MutualTlsAuthenticationOps[Self <: MutualTlsAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTruststoreUri(value: String): Self = this.set("truststoreUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruststoreUri: Self = this.set("truststoreUri", js.undefined)
    
    @scala.inline
    def setTruststoreVersion(value: String): Self = this.set("truststoreVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruststoreVersion: Self = this.set("truststoreVersion", js.undefined)
    
    @scala.inline
    def setTruststoreWarningsVarargs(value: String*): Self = this.set("truststoreWarnings", js.Array(value :_*))
    
    @scala.inline
    def setTruststoreWarnings(value: ListOfString): Self = this.set("truststoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruststoreWarnings: Self = this.set("truststoreWarnings", js.undefined)
  }
}
