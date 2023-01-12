package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResourceCount extends StObject {
  
  /**
    * The resource count.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object NetworkResourceCount {
  
  inline def apply(): NetworkResourceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkResourceCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkResourceCount] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
