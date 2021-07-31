package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconPropsTypeMod {
  
  trait IconPropsType extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object IconPropsType {
    
    @scala.inline
    def apply(`type`: String): IconPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconPropsType]
    }
    
    @scala.inline
    implicit class IconPropsTypeMutableBuilder[Self <: IconPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
