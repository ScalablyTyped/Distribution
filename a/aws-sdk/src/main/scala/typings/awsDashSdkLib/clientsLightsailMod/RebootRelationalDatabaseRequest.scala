package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to reboot.
    */
  var relationalDatabaseName: ResourceName
}

object RebootRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): RebootRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
  
    __obj.asInstanceOf[RebootRelationalDatabaseRequest]
  }
}

