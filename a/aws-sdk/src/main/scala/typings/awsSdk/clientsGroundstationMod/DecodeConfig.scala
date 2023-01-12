package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeConfig extends StObject {
  
  /**
    * Unvalidated JSON of a decode Config.
    */
  var unvalidatedJSON: JsonString
}
object DecodeConfig {
  
  inline def apply(unvalidatedJSON: JsonString): DecodeConfig = {
    val __obj = js.Dynamic.literal(unvalidatedJSON = unvalidatedJSON.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecodeConfig] (val x: Self) extends AnyVal {
    
    inline def setUnvalidatedJSON(value: JsonString): Self = StObject.set(x, "unvalidatedJSON", value.asInstanceOf[js.Any])
  }
}
