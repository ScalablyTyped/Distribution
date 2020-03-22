package typings.awsSdk

import typings.awsSdk.acmMod.Arn
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/acm.DescribeCertificateRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCertificateReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var CertificateArn: Arn = js.native
}

