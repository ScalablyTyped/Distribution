package typings.alloy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Top-level module for Alloy widget.
  */
@js.native
trait WidgetInterface extends js.Object {
  /**
    * Factory method for instantiating a controller. Creates and returns an instance of the named controller.
    *
    * @param name Name of controller to instantiate.
    * @param args Arguments to pass to the controller
    */
  def createController(name: String): AlloyController = js.native
  def createController(name: String, args: js.Any): AlloyController = js.native
}

