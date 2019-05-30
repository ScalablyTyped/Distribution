package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterViewInit extends js.Object {
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  def ngAfterViewInit(): scala.Unit
}

object AfterViewInit {
  @scala.inline
  def apply(ngAfterViewInit: () => scala.Unit): AfterViewInit = {
    val __obj = js.Dynamic.literal(ngAfterViewInit = js.Any.fromFunction0(ngAfterViewInit))
  
    __obj.asInstanceOf[AfterViewInit]
  }
}

