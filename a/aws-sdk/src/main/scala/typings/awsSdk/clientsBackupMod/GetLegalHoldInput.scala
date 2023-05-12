package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLegalHoldInput extends StObject {
  
  /**
    * This is the ID required to use GetLegalHold. This unique ID is associated with a specific legal hold.
    */
  var LegalHoldId: String
}
object GetLegalHoldInput {
  
  inline def apply(LegalHoldId: String): GetLegalHoldInput = {
    val __obj = js.Dynamic.literal(LegalHoldId = LegalHoldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLegalHoldInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLegalHoldInput] (val x: Self) extends AnyVal {
    
    inline def setLegalHoldId(value: String): Self = StObject.set(x, "LegalHoldId", value.asInstanceOf[js.Any])
  }
}
