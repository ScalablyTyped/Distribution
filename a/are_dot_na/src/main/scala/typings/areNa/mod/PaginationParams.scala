package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameter type for API functions with pagination support
  */
trait PaginationParams
  extends StObject
     with Params {
  
  var page: Double
  
  var per: Double
}
object PaginationParams {
  
  inline def apply(page: Double, per: Double): PaginationParams = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginationParams] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPer(value: Double): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
  }
}
