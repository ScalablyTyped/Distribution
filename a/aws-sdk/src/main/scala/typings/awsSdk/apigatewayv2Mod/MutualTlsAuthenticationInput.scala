package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutualTlsAuthenticationInput extends js.Object {
  
  /**
    * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, s3://bucket-name/key-name. The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version. To update the truststore, you must have permissions to access the S3 object.
    */
  var TruststoreUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  
  /**
    * The version of the S3 object that contains your truststore. To specify a version, you must have versioning enabled for the S3 bucket.
    */
  var TruststoreVersion: js.UndefOr[StringWithLengthBetween1And64] = js.native
}
object MutualTlsAuthenticationInput {
  
  @scala.inline
  def apply(): MutualTlsAuthenticationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutualTlsAuthenticationInput]
  }
  
  @scala.inline
  implicit class MutualTlsAuthenticationInputOps[Self <: MutualTlsAuthenticationInput] (val x: Self) extends AnyVal {
    
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
    def setTruststoreUri(value: UriWithLengthBetween1And2048): Self = this.set("TruststoreUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruststoreUri: Self = this.set("TruststoreUri", js.undefined)
    
    @scala.inline
    def setTruststoreVersion(value: StringWithLengthBetween1And64): Self = this.set("TruststoreVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruststoreVersion: Self = this.set("TruststoreVersion", js.undefined)
  }
}
