package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseEvent extends js.Object {
  /**
    * The timestamp when the database event was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The category that the database event belongs to.
    */
  var eventCategories: js.UndefOr[StringList] = js.undefined
  /**
    * The message of the database event.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The database that the database event relates to.
    */
  var resource: js.UndefOr[ResourceName] = js.undefined
}

object RelationalDatabaseEvent {
  @scala.inline
  def apply(
    createdAt: IsoDate = null,
    eventCategories: StringList = null,
    message: java.lang.String = null,
    resource: ResourceName = null
  ): RelationalDatabaseEvent = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (eventCategories != null) __obj.updateDynamic("eventCategories")(eventCategories)
    if (message != null) __obj.updateDynamic("message")(message)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RelationalDatabaseEvent]
  }
}

