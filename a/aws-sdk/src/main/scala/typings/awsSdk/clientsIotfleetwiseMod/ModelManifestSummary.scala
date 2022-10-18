package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelManifestSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the vehicle model.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The time the vehicle model was created, in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var creationTime: js.Date
  
  /**
    * A brief description of the vehicle model.
    */
  var description: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.description] = js.undefined
  
  /**
    * The time the vehicle model was last updated, in seconds since epoch (January 1, 1970 at midnight UTC time).
    */
  var lastModificationTime: js.Date
  
  /**
    * The name of the vehicle model.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The ARN of the signal catalog associated with the vehicle model.
    */
  var signalCatalogArn: js.UndefOr[arn] = js.undefined
  
  /**
    * The state of the vehicle model. If the status is ACTIVE, the vehicle model can't be edited. If the status is DRAFT, you can edit the vehicle model.
    */
  var status: js.UndefOr[ManifestStatus] = js.undefined
}
object ModelManifestSummary {
  
  inline def apply(creationTime: js.Date, lastModificationTime: js.Date): ModelManifestSummary = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastModificationTime = lastModificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelManifestSummary]
  }
  
  extension [Self <: ModelManifestSummary](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "lastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArnUndefined: Self = StObject.set(x, "signalCatalogArn", js.undefined)
    
    inline def setStatus(value: ManifestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
