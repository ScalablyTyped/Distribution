package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsEntity extends js.Object {
  /**
    * The data returned by the query.
    */
  var Data: js.UndefOr[OpsEntityItemMap] = js.native
  /**
    * The query ID.
    */
  var Id: js.UndefOr[OpsEntityId] = js.native
}

object OpsEntity {
  @scala.inline
  def apply(Data: OpsEntityItemMap = null, Id: OpsEntityId = null): OpsEntity = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsEntity]
  }
}

