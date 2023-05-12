package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationConfiguration extends StObject {
  
  /**
    * Indicates the page number.
    */
  var PageNumber: typings.awsSdk.clientsQuicksightMod.PageNumber
  
  /**
    * Indicates how many items render in one page.
    */
  var PageSize: Long
}
object PaginationConfiguration {
  
  inline def apply(PageNumber: PageNumber, PageSize: Long): PaginationConfiguration = {
    val __obj = js.Dynamic.literal(PageNumber = PageNumber.asInstanceOf[js.Any], PageSize = PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPageNumber(value: PageNumber): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: Long): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
  }
}
