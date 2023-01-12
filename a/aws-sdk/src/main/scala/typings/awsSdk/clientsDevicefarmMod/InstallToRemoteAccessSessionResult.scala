package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallToRemoteAccessSessionResult extends StObject {
  
  /**
    * An app to upload or that has been uploaded.
    */
  var appUpload: js.UndefOr[Upload] = js.undefined
}
object InstallToRemoteAccessSessionResult {
  
  inline def apply(): InstallToRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallToRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
    inline def setAppUpload(value: Upload): Self = StObject.set(x, "appUpload", value.asInstanceOf[js.Any])
    
    inline def setAppUploadUndefined: Self = StObject.set(x, "appUpload", js.undefined)
  }
}
