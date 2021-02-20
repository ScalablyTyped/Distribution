package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServiceOptions extends StObject {
  
  var deprecated: js.UndefOr[Boolean] = js.native
}
object IServiceOptions {
  
  @scala.inline
  def apply(): IServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceOptions]
  }
  
  @scala.inline
  implicit class IServiceOptionsMutableBuilder[Self <: IServiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
  }
}
