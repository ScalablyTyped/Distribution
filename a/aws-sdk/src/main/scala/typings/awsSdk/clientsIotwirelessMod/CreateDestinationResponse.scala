package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDestinationResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the new resource.
    */
  var Arn: js.UndefOr[DestinationArn] = js.undefined
  
  /**
    * The name of the new resource.
    */
  var Name: js.UndefOr[DestinationName] = js.undefined
}
object CreateDestinationResponse {
  
  inline def apply(): CreateDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DestinationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
