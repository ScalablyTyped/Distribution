package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEntitiesResponse extends js.Object {
  /**
    * An array of descriptions for the specified entities.
    */
  var descriptions: js.UndefOr[EntityDescriptions] = js.undefined
}

object GetEntitiesResponse {
  @scala.inline
  def apply(descriptions: EntityDescriptions = null): GetEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (descriptions != null) __obj.updateDynamic("descriptions")(descriptions)
    __obj.asInstanceOf[GetEntitiesResponse]
  }
}

