package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyWhenUploadedInput extends StObject {
  
  var FileShareARN: typings.awsSdk.clientsStoragegatewayMod.FileShareARN
}
object NotifyWhenUploadedInput {
  
  inline def apply(FileShareARN: FileShareARN): NotifyWhenUploadedInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWhenUploadedInput]
  }
  
  extension [Self <: NotifyWhenUploadedInput](x: Self) {
    
    inline def setFileShareARN(value: FileShareARN): Self = StObject.set(x, "FileShareARN", value.asInstanceOf[js.Any])
  }
}
