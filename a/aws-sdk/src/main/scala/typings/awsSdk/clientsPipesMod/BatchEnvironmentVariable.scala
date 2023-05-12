package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEnvironmentVariable extends StObject {
  
  /**
    * The name of the key-value pair. For environment variables, this is the name of the environment variable.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the key-value pair. For environment variables, this is the value of the environment variable.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object BatchEnvironmentVariable {
  
  inline def apply(): BatchEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEnvironmentVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchEnvironmentVariable] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
