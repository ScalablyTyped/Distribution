package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingularSourceProperties extends StObject {
  
  /**
    *  The object specified in the Singular flow source. 
    */
  var `object`: Object
}
object SingularSourceProperties {
  
  inline def apply(`object`: Object): SingularSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingularSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
