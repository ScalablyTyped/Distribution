package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconPropsTypeMod {
  
  trait IconPropsType extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object IconPropsType {
    
    inline def apply(`type`: String): IconPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconPropsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconPropsType] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
