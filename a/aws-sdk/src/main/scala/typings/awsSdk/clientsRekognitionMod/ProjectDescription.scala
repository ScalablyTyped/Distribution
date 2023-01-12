package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDescription extends StObject {
  
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Information about the training and test datasets in the project. 
    */
  var Datasets: js.UndefOr[DatasetMetadataList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ProjectArn] = js.undefined
  
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.undefined
}
object ProjectDescription {
  
  inline def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasets(value: DatasetMetadataList): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: DatasetMetadata*): Self = StObject.set(x, "Datasets", js.Array(value*))
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
    
    inline def setStatus(value: ProjectStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
