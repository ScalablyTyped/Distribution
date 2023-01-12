package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceTypeItem extends StObject {
  
  var InstanceType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.InstanceType] = js.undefined
}
object InstanceTypeItem {
  
  inline def apply(): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceTypeItem] (val x: Self) extends AnyVal {
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
