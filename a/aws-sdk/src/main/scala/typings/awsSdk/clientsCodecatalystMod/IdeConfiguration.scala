package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdeConfiguration extends StObject {
  
  /**
    * The name of the IDE. Valid values include Cloud9, IntelliJ, PyCharm, GoLand, and VSCode.
    */
  var name: js.UndefOr[IdeConfigurationNameString] = js.undefined
  
  /**
    * A link to the IDE runtime image.   This parameter is not required for VSCode. 
    */
  var runtime: js.UndefOr[IdeConfigurationRuntimeString] = js.undefined
}
object IdeConfiguration {
  
  inline def apply(): IdeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setName(value: IdeConfigurationNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRuntime(value: IdeConfigurationRuntimeString): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
  }
}
