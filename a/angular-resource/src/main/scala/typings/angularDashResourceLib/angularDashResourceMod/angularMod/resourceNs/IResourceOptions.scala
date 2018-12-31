package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
trait IResourceOptions extends js.Object {
  /**
    * If true, the request made by a "non-instance" call will be cancelled (if not already completed) by calling
    * $cancelRequest() on the call's return value. This can be overwritten per action. (Defaults to false.)
    */
  var cancellable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[scala.Boolean] = js.undefined
}

