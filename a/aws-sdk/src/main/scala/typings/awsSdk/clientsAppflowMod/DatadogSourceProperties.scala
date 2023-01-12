package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogSourceProperties extends StObject {
  
  /**
    *  The object specified in the Datadog flow source. 
    */
  var `object`: Object
}
object DatadogSourceProperties {
  
  inline def apply(`object`: Object): DatadogSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatadogSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
