package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsEntity extends js.Object {
  /**
    * The data returned by the query.
    */
  var Data: js.UndefOr[OpsEntityItemMap] = js.undefined
  /**
    * The query ID.
    */
  var Id: js.UndefOr[OpsEntityId] = js.undefined
}

object OpsEntity {
  @scala.inline
  def apply(Data: OpsEntityItemMap = null, Id: OpsEntityId = null): OpsEntity = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[OpsEntity]
  }
}

