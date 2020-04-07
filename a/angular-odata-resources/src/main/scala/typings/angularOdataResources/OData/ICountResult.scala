package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountResult extends js.Object {
  @JSName("$promise")
  var $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any
  var result: Double
}

object ICountResult {
  @scala.inline
  def apply(
    $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any,
    result: Double
  ): ICountResult = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICountResult]
  }
}

