package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecateThingTypeRequest extends js.Object {
  /**
    * The name of the thing type to deprecate.
    */
  var thingTypeName: ThingTypeName
  /**
    * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
    */
  var undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined
}

object DeprecateThingTypeRequest {
  @scala.inline
  def apply(thingTypeName: ThingTypeName, undoDeprecate: js.UndefOr[UndoDeprecate] = js.undefined): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName)
    if (!js.isUndefined(undoDeprecate)) __obj.updateDynamic("undoDeprecate")(undoDeprecate)
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
}

