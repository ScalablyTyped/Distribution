package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $onInit lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IOnInit extends js.Object {
  /**
    * Called on each controller after all the controllers on an element have been constructed and had their bindings
    * initialized (and before the pre & post linking functions for the directives on this element). This is a good
    * place to put initialization code for your controller.
    */
  @JSName("$onInit")
  def $onInit(): Unit = js.native
}

