package typings.angularDashOdataDashResources.OData

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountResult extends js.Object {
  @JSName("$promise")
  var $promise: IPromise[_]
  var result: Double
}

object ICountResult {
  @scala.inline
  def apply($promise: IPromise[_], result: Double): ICountResult = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICountResult]
  }
}

