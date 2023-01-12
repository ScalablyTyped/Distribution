package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStudioOutput extends StObject {
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The unique Studio access URL.
    */
  var Url: js.UndefOr[XmlString] = js.undefined
}
object CreateStudioOutput {
  
  inline def apply(): CreateStudioOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStudioOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStudioOutput] (val x: Self) extends AnyVal {
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "StudioId", js.undefined)
    
    inline def setUrl(value: XmlString): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
