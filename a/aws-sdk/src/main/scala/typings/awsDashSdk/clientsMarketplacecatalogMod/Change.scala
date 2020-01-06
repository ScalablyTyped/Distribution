package typings.awsDashSdk.clientsMarketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  /**
    * Change types are single string values that describe your intention for the change. Each change type is unique for each EntityType provided in the change's scope.
    */
  var ChangeType: typings.awsDashSdk.clientsMarketplacecatalogMod.ChangeType = js.native
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: Json = js.native
  /**
    * The entity to be changed.
    */
  var Entity: typings.awsDashSdk.clientsMarketplacecatalogMod.Entity = js.native
}

object Change {
  @scala.inline
  def apply(ChangeType: ChangeType, Details: Json, Entity: Entity): Change = {
    val __obj = js.Dynamic.literal(ChangeType = ChangeType.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Entity = Entity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Change]
  }
}

