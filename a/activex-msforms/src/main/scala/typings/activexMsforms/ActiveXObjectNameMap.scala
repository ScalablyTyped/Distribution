package typings.activexMsforms

import typings.activexMsforms.MSForms.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Forms.Image")
  var FormsDotImage: Image
}
object ActiveXObjectNameMap {
  
  inline def apply(FormsDotImage: Image): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Forms.Image")(FormsDotImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setFormsDotImage(value: Image): Self = StObject.set(x, "Forms.Image", value.asInstanceOf[js.Any])
  }
}
