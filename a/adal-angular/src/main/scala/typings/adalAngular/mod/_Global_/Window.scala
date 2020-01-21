package typings.adalAngular.mod._Global_

import typings.adalAngular.mod.LoggingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Logging: LoggingConfig
}

object Window {
  @scala.inline
  def apply(Logging: LoggingConfig): Window = {
    val __obj = js.Dynamic.literal(Logging = Logging.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

