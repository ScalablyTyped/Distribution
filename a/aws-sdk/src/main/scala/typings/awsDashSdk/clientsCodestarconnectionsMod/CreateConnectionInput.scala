package typings.awsDashSdk.clientsCodestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectionInput extends js.Object {
  /**
    * The name of the connection to be created. The name must be unique in the calling AWS account.
    */
  var ConnectionName: typings.awsDashSdk.clientsCodestarconnectionsMod.ConnectionName = js.native
  /**
    * The name of the external provider where your third-party code repository is configured. Currently, the valid provider type is Bitbucket.
    */
  var ProviderType: typings.awsDashSdk.clientsCodestarconnectionsMod.ProviderType = js.native
}

object CreateConnectionInput {
  @scala.inline
  def apply(ConnectionName: ConnectionName, ProviderType: ProviderType): CreateConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateConnectionInput]
  }
}

