package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFilter extends StObject {
  
  /**
    * The tag key.
    */
  var Key: js.UndefOr[XmlStringMaxLen128] = js.undefined
  
  /**
    * The tag values (0 to 20).
    */
  var Values: js.UndefOr[TagValues] = js.undefined
}
object TagFilter {
  
  inline def apply(): TagFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagFilter]
  }
  
  extension [Self <: TagFilter](x: Self) {
    
    inline def setKey(value: XmlStringMaxLen128): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: TagValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
