package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatastoreRequest extends js.Object {
  /**
    * The name of the data store to delete.
    */
  var datastoreName: DatastoreName
}

object DeleteDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName): DeleteDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName)
  
    __obj.asInstanceOf[DeleteDatastoreRequest]
  }
}

