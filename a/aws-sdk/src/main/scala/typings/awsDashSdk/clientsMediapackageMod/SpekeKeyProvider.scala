package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpekeKeyProvider extends js.Object {
  /**
    * An Amazon Resource Name (ARN) of a Certificate Manager certificate
  that MediaPackage will use for enforcing secure end-to-end data
  transfer with the key provider service.
    */
  var CertificateArn: js.UndefOr[__string] = js.native
  /**
    * The resource ID to include in key requests.
    */
  var ResourceId: __string = js.native
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: __string = js.native
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: __listOf__string = js.native
  /**
    * The URL of the external key provider service.
    */
  var Url: __string = js.native
}

object SpekeKeyProvider {
  @scala.inline
  def apply(
    ResourceId: __string,
    RoleArn: __string,
    SystemIds: __listOf__string,
    Url: __string,
    CertificateArn: __string = null
  ): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
}

