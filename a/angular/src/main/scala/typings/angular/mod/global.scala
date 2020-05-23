package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Support for painless dependency injection
@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Function extends js.Object {
    @JSName("$inject")
    var $inject: js.UndefOr[js.Array[String]] = js.native
  }
  
}

