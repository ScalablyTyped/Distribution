package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreActivity extends js.Object {
  /**
    * The name of the data store where processed messages are stored.
    */
  var datastoreName: DatastoreName
  /**
    * The name of the 'datastore' activity.
    */
  var name: ActivityName
}

object DatastoreActivity {
  @scala.inline
  def apply(datastoreName: DatastoreName, name: ActivityName): DatastoreActivity = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName, name = name)
  
    __obj.asInstanceOf[DatastoreActivity]
  }
}

