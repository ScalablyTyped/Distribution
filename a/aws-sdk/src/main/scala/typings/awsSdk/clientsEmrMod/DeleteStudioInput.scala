package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStudioInput extends StObject {
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: XmlStringMaxLen256
}
object DeleteStudioInput {
  
  inline def apply(StudioId: XmlStringMaxLen256): DeleteStudioInput = {
    val __obj = js.Dynamic.literal(StudioId = StudioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStudioInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStudioInput] (val x: Self) extends AnyVal {
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
  }
}
