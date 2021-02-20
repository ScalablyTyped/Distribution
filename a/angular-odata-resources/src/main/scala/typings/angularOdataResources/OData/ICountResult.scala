package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICountResult extends StObject {
  
  @JSName("$promise")
  var $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any = js.native
  
  var result: Double = js.native
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
  
  @scala.inline
  implicit class ICountResultMutableBuilder[Self <: ICountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$promise(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<any> */ js.Any
    ): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
