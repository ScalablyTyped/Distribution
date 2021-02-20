package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnumOptions extends StObject {
  
  var allowAlias: js.UndefOr[Boolean] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
}
object IEnumOptions {
  
  @scala.inline
  def apply(): IEnumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumOptions]
  }
  
  @scala.inline
  implicit class IEnumOptionsMutableBuilder[Self <: IEnumOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAlias(value: Boolean): Self = StObject.set(x, "allowAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAliasUndefined: Self = StObject.set(x, "allowAlias", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
  }
}
