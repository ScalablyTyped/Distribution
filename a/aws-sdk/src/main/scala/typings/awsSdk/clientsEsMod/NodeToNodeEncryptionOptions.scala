package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeToNodeEncryptionOptions extends StObject {
  
  /**
    * Specify true to enable node-to-node encryption.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object NodeToNodeEncryptionOptions {
  
  inline def apply(): NodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeToNodeEncryptionOptions]
  }
  
  extension [Self <: NodeToNodeEncryptionOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
