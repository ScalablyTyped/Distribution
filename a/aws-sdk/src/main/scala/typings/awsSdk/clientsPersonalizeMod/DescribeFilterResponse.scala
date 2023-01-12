package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFilterResponse extends StObject {
  
  /**
    * The filter's details.
    */
  var filter: js.UndefOr[Filter] = js.undefined
}
object DescribeFilterResponse {
  
  inline def apply(): DescribeFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFilterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFilterResponse] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
