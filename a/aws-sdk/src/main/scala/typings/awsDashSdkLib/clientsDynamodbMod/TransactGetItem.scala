package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactGetItem extends js.Object {
  /**
    * Contains the primary key that identifies the item to get, together with the name of the table that contains the item, and optionally the specific attributes of the item to retrieve.
    */
  var Get: awsDashSdkLib.clientsDynamodbMod.Get
}

object TransactGetItem {
  @scala.inline
  def apply(Get: Get): TransactGetItem = {
    val __obj = js.Dynamic.literal(Get = Get)
  
    __obj.asInstanceOf[TransactGetItem]
  }
}

