package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcsEnvironmentVariable extends StObject {
  
  /**
    * The name of the key-value pair. For environment variables, this is the name of the environment variable.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the key-value pair. For environment variables, this is the value of the environment variable.
    */
  var value: js.UndefOr[String] = js.undefined
}
object EcsEnvironmentVariable {
  
  inline def apply(): EcsEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsEnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcsEnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
