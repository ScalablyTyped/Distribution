package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotEventsInputIdentifier extends StObject {
  
  /**
    *  The name of the input routed to AWS IoT Events. 
    */
  var inputName: InputName
}
object IotEventsInputIdentifier {
  
  inline def apply(inputName: InputName): IotEventsInputIdentifier = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsInputIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotEventsInputIdentifier] (val x: Self) extends AnyVal {
    
    inline def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
  }
}
