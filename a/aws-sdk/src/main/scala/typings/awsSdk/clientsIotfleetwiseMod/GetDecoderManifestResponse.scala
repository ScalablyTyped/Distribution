package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDecoderManifestResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the decoder manifest. 
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The time the decoder manifest was created in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var creationTime: js.Date
  
  /**
    *  A brief description of the decoder manifest.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    *  The time the decoder manifest was last updated in seconds since epoch (January 1, 1970 at midnight UTC time). 
    */
  var lastModificationTime: js.Date
  
  /**
    *  The ARN of a vehicle model (model manifest) associated with the decoder manifest.
    */
  var modelManifestArn: js.UndefOr[arn] = js.undefined
  
  /**
    *  The name of the decoder manifest. 
    */
  var name: java.lang.String
  
  /**
    *  The state of the decoder manifest. If the status is ACTIVE, the decoder manifest can't be edited. If the status is marked DRAFT, you can edit the decoder manifest.
    */
  var status: js.UndefOr[ManifestStatus] = js.undefined
}
object GetDecoderManifestResponse {
  
  inline def apply(arn: arn, creationTime: js.Date, lastModificationTime: js.Date, name: java.lang.String): GetDecoderManifestResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDecoderManifestResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDecoderManifestResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArn(value: arn): Self = StObject.set(x, "modelManifestArn", value.asInstanceOf[js.Any])
    
    inline def setModelManifestArnUndefined: Self = StObject.set(x, "modelManifestArn", js.undefined)
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ManifestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
