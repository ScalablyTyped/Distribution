package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReferenceMetadataResponse extends StObject {
  
  /**
    * The reference's ARN.
    */
  var arn: ReferenceArn
  
  /**
    * When the reference was created.
    */
  var creationTime: js.Date
  
  /**
    * The reference's description.
    */
  var description: js.UndefOr[ReferenceDescription] = js.undefined
  
  /**
    * The reference's files.
    */
  var files: js.UndefOr[ReferenceFiles] = js.undefined
  
  /**
    * The reference's ID.
    */
  var id: ReferenceId
  
  /**
    * The reference's MD5 checksum.
    */
  var md5: Md5
  
  /**
    * The reference's name.
    */
  var name: js.UndefOr[ReferenceName] = js.undefined
  
  /**
    * The reference's reference store ID.
    */
  var referenceStoreId: ReferenceStoreId
  
  /**
    * The reference's status.
    */
  var status: js.UndefOr[ReferenceStatus] = js.undefined
  
  /**
    * When the reference was updated.
    */
  var updateTime: js.Date
}
object GetReferenceMetadataResponse {
  
  inline def apply(
    arn: ReferenceArn,
    creationTime: js.Date,
    id: ReferenceId,
    md5: Md5,
    referenceStoreId: ReferenceStoreId,
    updateTime: js.Date
  ): GetReferenceMetadataResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], referenceStoreId = referenceStoreId.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReferenceMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReferenceMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ReferenceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ReferenceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: ReferenceFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setId(value: ReferenceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: Md5): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setName(value: ReferenceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceStoreId(value: ReferenceStoreId): Self = StObject.set(x, "referenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReferenceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
