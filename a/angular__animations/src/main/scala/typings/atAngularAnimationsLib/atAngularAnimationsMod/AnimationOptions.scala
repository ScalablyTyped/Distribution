package typings
package atAngularAnimationsLib.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationOptions extends js.Object {
  /**
    * Sets a time-delay for initiating an animation action.
    * A number and optional time unit, such as "1s" or "10ms" for one second
    * and 10 milliseconds, respectively.The default unit is milliseconds.
    * Default value is 0, meaning no delay.
    */
  var delay: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * A set of developer-defined parameters that modify styling and timing
    * when an animation action starts. An array of key-value pairs, where the provided value
    * is used as a default.
    */
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object AnimationOptions {
  @scala.inline
  def apply(
    delay: scala.Double | java.lang.String = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[AnimationOptions]
  }
}

