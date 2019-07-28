package typings.adalDashAngular.adalDashAngularMod.Global

import typings.adalDashAngular.adalDashAngularMod.LoggingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Logging: LoggingConfig
}

object Window {
  @scala.inline
  def apply(Logging: LoggingConfig): Window = {
    val __obj = js.Dynamic.literal(Logging = Logging)
  
    __obj.asInstanceOf[Window]
  }
}

