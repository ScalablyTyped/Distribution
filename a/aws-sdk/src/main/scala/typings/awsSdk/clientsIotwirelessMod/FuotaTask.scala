package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FuotaTask extends StObject {
  
  var Arn: js.UndefOr[FuotaTaskArn] = js.undefined
  
  var Id: js.UndefOr[FuotaTaskId] = js.undefined
  
  var Name: js.UndefOr[FuotaTaskName] = js.undefined
}
object FuotaTask {
  
  inline def apply(): FuotaTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FuotaTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FuotaTask] (val x: Self) extends AnyVal {
    
    inline def setArn(value: FuotaTaskArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: FuotaTaskId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: FuotaTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
