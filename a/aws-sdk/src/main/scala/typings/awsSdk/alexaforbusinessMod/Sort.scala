package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort extends StObject {
  
  /**
    * The sort key of a sort object.
    */
  var Key: SortKey
  
  /**
    * The sort value of a sort object.
    */
  var Value: SortValue
}
object Sort {
  
  inline def apply(Key: SortKey, Value: SortValue): Sort = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setKey(value: SortKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SortValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
