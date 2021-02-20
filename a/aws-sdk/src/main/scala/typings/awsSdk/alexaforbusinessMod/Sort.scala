package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sort extends StObject {
  
  /**
    * The sort key of a sort object.
    */
  var Key: SortKey = js.native
  
  /**
    * The sort value of a sort object.
    */
  var Value: SortValue = js.native
}
object Sort {
  
  @scala.inline
  def apply(Key: SortKey, Value: SortValue): Sort = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit class SortMutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: SortKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: SortValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
