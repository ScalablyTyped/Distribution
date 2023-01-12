package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var key: DocumentFilterKey
  
  /**
    * The value of the filter.
    */
  var value: DocumentFilterValue
}
object DocumentFilter {
  
  inline def apply(key: DocumentFilterKey, value: DocumentFilterValue): DocumentFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: DocumentFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: DocumentFilterValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
