package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSMBFileShareOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated SMB file share.
    */
  var FileShareARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.FileShareARN] = js.undefined
}
object UpdateSMBFileShareOutput {
  
  inline def apply(): UpdateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSMBFileShareOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSMBFileShareOutput] (val x: Self) extends AnyVal {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
    
    inline def setFileShareARNUndefined: Self = StObject.set(x, "FileShareARN", js.undefined)
  }
}
