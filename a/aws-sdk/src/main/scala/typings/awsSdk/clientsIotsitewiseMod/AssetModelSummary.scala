package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelSummary extends StObject {
  
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var arn: ARN
  
  /**
    * The date the asset model was created, in Unix epoch time.
    */
  var creationDate: js.Date
  
  /**
    * The asset model description.
    */
  var description: Description
  
  /**
    * The ID of the asset model (used with IoT SiteWise APIs).
    */
  var id: ID
  
  /**
    * The date the asset model was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.Date
  
  /**
    * The name of the asset model.
    */
  var name: Name
  
  /**
    * The current status of the asset model.
    */
  var status: AssetModelStatus
}
object AssetModelSummary {
  
  inline def apply(
    arn: ARN,
    creationDate: js.Date,
    description: Description,
    id: ID,
    lastUpdateDate: js.Date,
    name: Name,
    status: AssetModelStatus
  ): AssetModelSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelSummary]
  }
  
  extension [Self <: AssetModelSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AssetModelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
