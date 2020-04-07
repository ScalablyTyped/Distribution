package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// All service providers extend this interface
trait IServiceProvider extends js.Object {
  @JSName("$get")
  var $get: js.Any
}

object IServiceProvider {
  @scala.inline
  def apply($get: js.Any): IServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IServiceProvider]
  }
}

