package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestOverridesPayload extends StObject {
  
  /**
    * The overrides document.
    */
  var PayloadData: js.UndefOr[ManifestOverridesPayloadData] = js.undefined
}
object ManifestOverridesPayload {
  
  inline def apply(): ManifestOverridesPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestOverridesPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestOverridesPayload] (val x: Self) extends AnyVal {
    
    inline def setPayloadData(value: ManifestOverridesPayloadData): Self = StObject.set(x, "PayloadData", value.asInstanceOf[js.Any])
    
    inline def setPayloadDataUndefined: Self = StObject.set(x, "PayloadData", js.undefined)
  }
}
