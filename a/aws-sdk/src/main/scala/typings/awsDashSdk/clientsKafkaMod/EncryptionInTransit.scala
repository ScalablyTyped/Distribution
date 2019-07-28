package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionInTransit extends js.Object {
  /**
    * 
    Indicates the encryption setting for data in transit between clients and brokers. The following are the possible values.
    
    TLS means that client-broker communication is enabled with TLS only.
    
    TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext data.
    
    PLAINTEXT means that client-broker communication is enabled in plaintext only.
    The default value is TLS_PLAINTEXT.
    
    */
  var ClientBroker: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ClientBroker] = js.undefined
  /**
    * 
    When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When set to false, the communication happens in plaintext.
    The default value is true.
    
    */
  var InCluster: js.UndefOr[__boolean] = js.undefined
}

object EncryptionInTransit {
  @scala.inline
  def apply(ClientBroker: ClientBroker = null, InCluster: js.UndefOr[__boolean] = js.undefined): EncryptionInTransit = {
    val __obj = js.Dynamic.literal()
    if (ClientBroker != null) __obj.updateDynamic("ClientBroker")(ClientBroker.asInstanceOf[js.Any])
    if (!js.isUndefined(InCluster)) __obj.updateDynamic("InCluster")(InCluster)
    __obj.asInstanceOf[EncryptionInTransit]
  }
}

