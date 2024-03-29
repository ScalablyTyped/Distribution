package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUploadResult extends StObject {
  
  /**
    * A test spec uploaded to Device Farm.
    */
  var upload: js.UndefOr[Upload] = js.undefined
}
object UpdateUploadResult {
  
  inline def apply(): UpdateUploadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUploadResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateUploadResult] (val x: Self) extends AnyVal {
    
    inline def setUpload(value: Upload): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
  }
}
