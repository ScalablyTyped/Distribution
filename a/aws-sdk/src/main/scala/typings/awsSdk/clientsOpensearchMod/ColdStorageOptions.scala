package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColdStorageOptions extends StObject {
  
  /**
    * Whether to enable or disable cold storage on the domain.
    */
  var Enabled: Boolean
}
object ColdStorageOptions {
  
  inline def apply(Enabled: Boolean): ColdStorageOptions = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColdStorageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColdStorageOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
