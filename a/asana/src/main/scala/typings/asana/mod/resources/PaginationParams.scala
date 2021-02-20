package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationParams extends Params {
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[String] = js.native
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
