package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationParams
  extends StObject
     with Params {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
}
object PaginationParams {
  
  @scala.inline
  def apply(): PaginationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationParams]
  }
  
  @scala.inline
  implicit class PaginationParamsMutableBuilder[Self <: PaginationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
