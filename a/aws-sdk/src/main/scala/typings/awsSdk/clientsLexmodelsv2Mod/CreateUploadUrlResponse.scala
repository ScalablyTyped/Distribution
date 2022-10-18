package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUploadUrlResponse extends StObject {
  
  /**
    * An identifier for a unique import job. Use it when you call the StartImport operation.
    */
  var importId: js.UndefOr[Id] = js.undefined
  
  /**
    * A pre-signed S3 write URL. Upload the zip archive file that contains the definition of your bot or bot locale.
    */
  var uploadUrl: js.UndefOr[PresignedS3Url] = js.undefined
}
object CreateUploadUrlResponse {
  
  inline def apply(): CreateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUploadUrlResponse]
  }
  
  extension [Self <: CreateUploadUrlResponse](x: Self) {
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setUploadUrl(value: PresignedS3Url): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
