package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  /**
    * The name of an AWS service. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of an AWS service.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Tool {
  
  inline def apply(): Tool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tool]
  }
  
  extension [Self <: Tool](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
