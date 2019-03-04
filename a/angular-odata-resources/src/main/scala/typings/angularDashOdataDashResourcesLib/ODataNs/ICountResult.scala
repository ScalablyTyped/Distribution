package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountResult extends js.Object {
  @JSName("$promise")
  var $promise: angularLib.angularMod.angularNs.IPromise[_]
  var result: scala.Double
}

object ICountResult {
  @scala.inline
  def apply($promise: angularLib.angularMod.angularNs.IPromise[_], result: scala.Double): ICountResult = {
    val __obj = js.Dynamic.literal($promise = $promise, result = result)
  
    __obj.asInstanceOf[ICountResult]
  }
}

