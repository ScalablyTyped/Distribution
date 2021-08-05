package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSize extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.undefined
}
object PageSize {
  
  inline def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  extension [Self <: PageSize](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
