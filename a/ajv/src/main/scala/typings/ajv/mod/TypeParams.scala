package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParams
  extends StObject
     with ErrorParameters {
  
  var `type`: String
}
object TypeParams {
  
  @scala.inline
  def apply(`type`: String): TypeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParams]
  }
  
  @scala.inline
  implicit class TypeParamsMutableBuilder[Self <: TypeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
