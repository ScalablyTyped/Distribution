package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksContainerEnvironmentVariable extends StObject {
  
  /**
    * The name of the environment variable.
    */
  var name: String
  
  /**
    * The value of the environment variable.
    */
  var value: js.UndefOr[String] = js.undefined
}
object EksContainerEnvironmentVariable {
  
  inline def apply(name: String): EksContainerEnvironmentVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksContainerEnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksContainerEnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
