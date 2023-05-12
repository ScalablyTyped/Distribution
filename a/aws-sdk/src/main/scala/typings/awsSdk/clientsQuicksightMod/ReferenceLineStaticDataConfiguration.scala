package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceLineStaticDataConfiguration extends StObject {
  
  /**
    * The double input of the static data.
    */
  var Value: SensitiveDouble
}
object ReferenceLineStaticDataConfiguration {
  
  inline def apply(Value: SensitiveDouble): ReferenceLineStaticDataConfiguration = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceLineStaticDataConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceLineStaticDataConfiguration] (val x: Self) extends AnyVal {
    
    inline def setValue(value: SensitiveDouble): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
