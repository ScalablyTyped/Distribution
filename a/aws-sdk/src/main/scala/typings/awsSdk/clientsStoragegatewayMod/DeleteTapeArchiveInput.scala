package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapeArchiveInput extends StObject {
  
  /**
    * Set to TRUE to delete an archived tape that belongs to a custom pool with tape retention lock. Only archived tapes with tape retention lock set to governance can be deleted. Archived tapes with tape retention lock set to compliance can't be deleted.
    */
  var BypassGovernanceRetention: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
    */
  var TapeARN: typings.awsSdk.clientsStoragegatewayMod.TapeARN
}
object DeleteTapeArchiveInput {
  
  inline def apply(TapeARN: TapeARN): DeleteTapeArchiveInput = {
    val __obj = js.Dynamic.literal(TapeARN = TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeArchiveInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTapeArchiveInput] (val x: Self) extends AnyVal {
    
    inline def setBypassGovernanceRetention(value: scala.Boolean): Self = StObject.set(x, "BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    inline def setBypassGovernanceRetentionUndefined: Self = StObject.set(x, "BypassGovernanceRetention", js.undefined)
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
  }
}
