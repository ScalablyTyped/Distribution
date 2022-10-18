package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationId extends StObject {
  
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: string
  
  /**
    * The revision number of the configuration.
    */
  var Revision: js.UndefOr[integer] = js.undefined
}
object ConfigurationId {
  
  inline def apply(Id: string): ConfigurationId = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationId]
  }
  
  extension [Self <: ConfigurationId](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: integer): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
  }
}
