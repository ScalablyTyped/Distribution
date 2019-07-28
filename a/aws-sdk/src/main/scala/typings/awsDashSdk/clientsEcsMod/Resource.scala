package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * When the doubleValue type is set, the value of the resource must be a double precision floating-point type.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /**
    * When the integerValue type is set, the value of the resource must be an integer.
    */
  var integerValue: js.UndefOr[Integer] = js.undefined
  /**
    * When the longValue type is set, the value of the resource must be an extended precision floating-point type.
    */
  var longValue: js.UndefOr[Long] = js.undefined
  /**
    * The name of the resource, such as CPU, MEMORY, PORTS, PORTS_UDP, or a user-defined resource.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * When the stringSetValue type is set, the value of the resource must be a string type.
    */
  var stringSetValue: js.UndefOr[StringList] = js.undefined
  /**
    * The type of the resource, such as INTEGER, DOUBLE, LONG, or STRINGSET.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    doubleValue: js.UndefOr[Double] = js.undefined,
    integerValue: js.UndefOr[Integer] = js.undefined,
    longValue: js.UndefOr[Long] = js.undefined,
    name: String = null,
    stringSetValue: StringList = null,
    `type`: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue)
    if (!js.isUndefined(integerValue)) __obj.updateDynamic("integerValue")(integerValue)
    if (!js.isUndefined(longValue)) __obj.updateDynamic("longValue")(longValue)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stringSetValue != null) __obj.updateDynamic("stringSetValue")(stringSetValue)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Resource]
  }
}

