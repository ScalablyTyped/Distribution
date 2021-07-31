package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiResult extends StObject {
  
  var deleted: js.UndefOr[js.Array[String]] = js.undefined
  
  // deleted object names list
  var res: NormalSuccessResponse
}
object DeleteMultiResult {
  
  @scala.inline
  def apply(res: NormalSuccessResponse): DeleteMultiResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiResult]
  }
  
  @scala.inline
  implicit class DeleteMultiResultMutableBuilder[Self <: DeleteMultiResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value :_*))
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
