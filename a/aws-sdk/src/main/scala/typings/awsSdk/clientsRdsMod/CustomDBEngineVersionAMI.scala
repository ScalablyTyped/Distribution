package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDBEngineVersionAMI extends StObject {
  
  /**
    * A value that indicates the ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates the status of a custom engine version (CEV).
    */
  var Status: js.UndefOr[String] = js.undefined
}
object CustomDBEngineVersionAMI {
  
  inline def apply(): CustomDBEngineVersionAMI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDBEngineVersionAMI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomDBEngineVersionAMI] (val x: Self) extends AnyVal {
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
