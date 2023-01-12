package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MulticastGroup extends StObject {
  
  var Arn: js.UndefOr[MulticastGroupArn] = js.undefined
  
  var Id: js.UndefOr[MulticastGroupId] = js.undefined
  
  var Name: js.UndefOr[MulticastGroupName] = js.undefined
}
object MulticastGroup {
  
  inline def apply(): MulticastGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulticastGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MulticastGroup] (val x: Self) extends AnyVal {
    
    inline def setArn(value: MulticastGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: MulticastGroupId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: MulticastGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
