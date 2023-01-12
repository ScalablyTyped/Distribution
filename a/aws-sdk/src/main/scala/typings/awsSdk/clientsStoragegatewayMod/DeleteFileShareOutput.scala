package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
}
object DeleteFileShareOutput {
  
  inline def apply(): DeleteFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileShareOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteFileShareOutput] (val x: Self) extends AnyVal {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
