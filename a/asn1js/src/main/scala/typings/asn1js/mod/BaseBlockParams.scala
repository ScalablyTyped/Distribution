package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBlockParams extends LocalBaseBlockParams {
  
  var name: js.UndefOr[String] = js.native
  
  var optional: js.UndefOr[scala.Boolean] = js.native
  
  var primitiveSchema: js.UndefOr[js.Object] = js.native
}
object BaseBlockParams {
  
  @scala.inline
  def apply(): BaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBlockParams]
  }
  
  @scala.inline
  implicit class BaseBlockParamsMutableBuilder[Self <: BaseBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptional(value: scala.Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setPrimitiveSchema(value: js.Object): Self = StObject.set(x, "primitiveSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveSchemaUndefined: Self = StObject.set(x, "primitiveSchema", js.undefined)
  }
}
