package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Growl message with configuration.
  */
trait IGrowlMessage extends IGrowlMessageConfig {
  var text: java.lang.String
  /**
    * Destroy the message.
    */
  def destroy(): scala.Unit
  /**
    * Update the message body.
    * @param newText new message body
    */
  def setText(newText: java.lang.String): scala.Unit
}

