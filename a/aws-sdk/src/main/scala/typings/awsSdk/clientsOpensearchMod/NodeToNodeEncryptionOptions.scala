package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeToNodeEncryptionOptions extends StObject {
  
  /**
    * True to enable node-to-node encryption.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object NodeToNodeEncryptionOptions {
  
  inline def apply(): NodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeToNodeEncryptionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeToNodeEncryptionOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
