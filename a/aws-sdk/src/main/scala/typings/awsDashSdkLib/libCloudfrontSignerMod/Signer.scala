package typings
package awsDashSdkLib.libCloudfrontSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/cloudfront/signer", "Signer")
@js.native
class Signer protected () extends js.Object {
  /**
    * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
    * 
    * @param {string} keyPairId - The ID of the CloudFront key pair being used.
    * @param {string} privateKey - A private key in RSA format.
    */
  def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy): awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CustomPolicy = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(
    options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* cookie */ awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CustomPolicy, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy): awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CannedPolicy = js.native
  /**
    * Create a signed Amazon CloudFront Cookie.
    */
  def getSignedCookie(
    options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* cookie */ awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CannedPolicy, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Create a signed Amazon CloudFront URL.
    * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
    */
  def getSignedUrl(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy): java.lang.String = js.native
  /**
    * Create a signed Amazon CloudFront URL.
    * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
    */
  def getSignedUrl(
    options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy,
    callback: js.Function2[/* err */ stdLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getSignedUrl(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy): java.lang.String = js.native
  def getSignedUrl(
    options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy,
    callback: js.Function2[/* err */ stdLib.Error, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

