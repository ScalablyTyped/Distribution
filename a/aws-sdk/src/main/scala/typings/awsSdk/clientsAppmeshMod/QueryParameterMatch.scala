package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterMatch extends StObject {
  
  /**
    * The exact query parameter to match on.
    */
  var exact: js.UndefOr[String] = js.undefined
}
object QueryParameterMatch {
  
  inline def apply(): QueryParameterMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryParameterMatch] (val x: Self) extends AnyVal {
    
    inline def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
  }
}
