package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionLoaResponse extends StObject {
  
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.undefined
}
object DescribeConnectionLoaResponse {
  
  inline def apply(): DescribeConnectionLoaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionLoaResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConnectionLoaResponse] (val x: Self) extends AnyVal {
    
    inline def setLoa(value: Loa): Self = StObject.set(x, "loa", value.asInstanceOf[js.Any])
    
    inline def setLoaUndefined: Self = StObject.set(x, "loa", js.undefined)
  }
}
