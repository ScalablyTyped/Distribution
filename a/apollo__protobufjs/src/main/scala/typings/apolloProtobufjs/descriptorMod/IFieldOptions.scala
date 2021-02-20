package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldOptions extends StObject {
  
  var jstype: js.UndefOr[IFieldOptionsJSType] = js.native
  
  var packed: js.UndefOr[Boolean] = js.native
}
object IFieldOptions {
  
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit class IFieldOptionsMutableBuilder[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJstype(value: IFieldOptionsJSType): Self = StObject.set(x, "jstype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJstypeUndefined: Self = StObject.set(x, "jstype", js.undefined)
    
    @scala.inline
    def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
  }
}
