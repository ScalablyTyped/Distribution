package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  /**
    * The host name to use in the redirect request.
    */
  var HostName: js.UndefOr[typings.awsDashSdk.clientsS3Mod.HostName] = js.undefined
  /**
    * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
    */
  var HttpRedirectCode: js.UndefOr[typings.awsDashSdk.clientsS3Mod.HttpRedirectCode] = js.undefined
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Protocol] = js.undefined
  /**
    * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ReplaceKeyPrefixWith] = js.undefined
  /**
    * The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the siblings is present. Can be present only if ReplaceKeyPrefixWith is not provided.
    */
  var ReplaceKeyWith: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ReplaceKeyWith] = js.undefined
}

object Redirect {
  @scala.inline
  def apply(
    HostName: HostName = null,
    HttpRedirectCode: HttpRedirectCode = null,
    Protocol: Protocol = null,
    ReplaceKeyPrefixWith: ReplaceKeyPrefixWith = null,
    ReplaceKeyWith: ReplaceKeyWith = null
  ): Redirect = {
    val __obj = js.Dynamic.literal()
    if (HostName != null) __obj.updateDynamic("HostName")(HostName)
    if (HttpRedirectCode != null) __obj.updateDynamic("HttpRedirectCode")(HttpRedirectCode)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (ReplaceKeyPrefixWith != null) __obj.updateDynamic("ReplaceKeyPrefixWith")(ReplaceKeyPrefixWith)
    if (ReplaceKeyWith != null) __obj.updateDynamic("ReplaceKeyWith")(ReplaceKeyWith)
    __obj.asInstanceOf[Redirect]
  }
}

