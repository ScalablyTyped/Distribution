package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /**
    * The component that will be subject to logging.
    */
  var Component: js.UndefOr[LoggerComponent] = js.undefined
  /**
    * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The level of the logs.
    */
  var Level: js.UndefOr[LoggerLevel] = js.undefined
  /**
    * The amount of file space, in KB, to use if the local file system is used for logging purposes.
    */
  var Space: js.UndefOr[__integer] = js.undefined
  /**
    * The type of log output which will be used.
    */
  var Type: js.UndefOr[LoggerType] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    Component: LoggerComponent = null,
    Id: __string = null,
    Level: LoggerLevel = null,
    Space: js.UndefOr[__integer] = js.undefined,
    Type: LoggerType = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    if (!js.isUndefined(Space)) __obj.updateDynamic("Space")(Space)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
}

