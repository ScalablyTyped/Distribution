package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColdStorageOptions extends StObject {
  
  /**
    * Enable cold storage option. Accepted values true or false
    */
  var Enabled: Boolean
}
object ColdStorageOptions {
  
  inline def apply(Enabled: Boolean): ColdStorageOptions = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColdStorageOptions]
  }
  
  extension [Self <: ColdStorageOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
