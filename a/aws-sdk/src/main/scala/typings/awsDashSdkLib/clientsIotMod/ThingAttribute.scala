package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingAttribute extends js.Object {
  /**
    * A list of thing attributes which are name-value pairs.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The thing ARN.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  /**
    * The name of the thing type, if the thing has been associated with a type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
  /**
    * The version of the thing record in the registry.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object ThingAttribute {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    thingArn: ThingArn = null,
    thingName: ThingName = null,
    thingTypeName: ThingTypeName = null,
    version: js.UndefOr[Version] = js.undefined
  ): ThingAttribute = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    if (thingTypeName != null) __obj.updateDynamic("thingTypeName")(thingTypeName)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ThingAttribute]
  }
}

