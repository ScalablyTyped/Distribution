package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeClusterRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that you are claiming. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId
  /**
    * The cluster certificate issued (signed) by your issuing certificate authority (CA). The certificate must be in PEM format and can contain a maximum of 5000 characters.
    */
  var SignedCert: Cert
  /**
    * The issuing certificate of the issuing certificate authority (CA) that issued (signed) the cluster certificate. This can be a root (self-signed) certificate or a certificate chain that begins with the certificate that issued the cluster certificate and ends with a root certificate. The certificate or certificate chain must be in PEM format and can contain a maximum of 5000 characters.
    */
  var TrustAnchor: Cert
}

object InitializeClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId, SignedCert: Cert, TrustAnchor: Cert): InitializeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId, SignedCert = SignedCert, TrustAnchor = TrustAnchor)
  
    __obj.asInstanceOf[InitializeClusterRequest]
  }
}

