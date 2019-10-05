package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Support for painless dependency injection
@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait Function extends js.Object {
    @JSName("$inject")
    var $inject: js.UndefOr[js.Array[String]] = js.native
  }
  
}

