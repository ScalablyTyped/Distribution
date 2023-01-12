package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InforNexusSourceProperties extends StObject {
  
  /**
    *  The object specified in the Infor Nexus flow source. 
    */
  var `object`: Object
}
object InforNexusSourceProperties {
  
  inline def apply(`object`: Object): InforNexusSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InforNexusSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InforNexusSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
