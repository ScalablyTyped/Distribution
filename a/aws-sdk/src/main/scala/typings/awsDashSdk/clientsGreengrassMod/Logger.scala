package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /**
    * The component that will be subject to logging.
    */
  var Component: LoggerComponent
  /**
    * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: __string
  /**
    * The level of the logs.
    */
  var Level: LoggerLevel
  /**
    * The amount of file space, in KB, to use if the local file system is used for logging purposes.
    */
  var Space: js.UndefOr[__integer] = js.undefined
  /**
    * The type of log output which will be used.
    */
  var Type: LoggerType
}

object Logger {
  @scala.inline
  def apply(
    Component: LoggerComponent,
    Id: __string,
    Level: LoggerLevel,
    Type: LoggerType,
    Space: js.UndefOr[__integer] = js.undefined
  ): Logger = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Id = Id, Level = Level.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (!js.isUndefined(Space)) __obj.updateDynamic("Space")(Space)
    __obj.asInstanceOf[Logger]
  }
}

