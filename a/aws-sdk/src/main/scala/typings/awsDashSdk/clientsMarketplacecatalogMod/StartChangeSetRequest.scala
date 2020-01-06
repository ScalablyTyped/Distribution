package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartChangeSetRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsDashSdk.clientsMarketplacecatalogMod.Catalog = js.native
  /**
    * Array of change object.
    */
  var ChangeSet: RequestedChangeList = js.native
  /**
    * Optional case sensitive string of up to 100 ASCII characters. The change set name can be used to filter the list of change sets. 
    */
  var ChangeSetName: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.ChangeSetName] = js.native
  /**
    * A unique token to identify the request to ensure idempotency.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsMarketplacecatalogMod.ClientRequestToken] = js.native
}

object StartChangeSetRequest {
  @scala.inline
  def apply(
    Catalog: Catalog,
    ChangeSet: RequestedChangeList,
    ChangeSetName: ChangeSetName = null,
    ClientRequestToken: ClientRequestToken = null
  ): StartChangeSetRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], ChangeSet = ChangeSet.asInstanceOf[js.Any])
    if (ChangeSetName != null) __obj.updateDynamic("ChangeSetName")(ChangeSetName.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartChangeSetRequest]
  }
}

