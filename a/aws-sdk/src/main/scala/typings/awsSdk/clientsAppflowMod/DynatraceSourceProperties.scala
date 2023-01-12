package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynatraceSourceProperties extends StObject {
  
  /**
    *  The object specified in the Dynatrace flow source. 
    */
  var `object`: Object
}
object DynatraceSourceProperties {
  
  inline def apply(`object`: Object): DynatraceSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatraceSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynatraceSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
