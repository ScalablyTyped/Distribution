package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initiator extends StObject {
  
  /**
    * Name of the Principal.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsS3Mod.DisplayName] = js.undefined
  
  /**
    * If the principal is an Amazon Web Services account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.
    */
  var ID: js.UndefOr[typings.awsSdk.clientsS3Mod.ID] = js.undefined
}
object Initiator {
  
  inline def apply(): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initiator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Initiator] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
