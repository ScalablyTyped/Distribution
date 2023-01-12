package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountVdmAttributesRequest extends StObject {
  
  /**
    * The VDM attributes that you wish to apply to your Amazon SES account.
    */
  var VdmAttributes: typings.awsSdk.clientsSesv2Mod.VdmAttributes
}
object PutAccountVdmAttributesRequest {
  
  inline def apply(VdmAttributes: VdmAttributes): PutAccountVdmAttributesRequest = {
    val __obj = js.Dynamic.literal(VdmAttributes = VdmAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountVdmAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccountVdmAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setVdmAttributes(value: VdmAttributes): Self = StObject.set(x, "VdmAttributes", value.asInstanceOf[js.Any])
  }
}
