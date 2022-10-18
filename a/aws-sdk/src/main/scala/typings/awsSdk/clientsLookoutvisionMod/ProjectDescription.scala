package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectDescription extends StObject {
  
  /**
    * The unix timestamp for the date and time that the project was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of datasets in the project.
    */
  var Datasets: js.UndefOr[DatasetMetadataList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ProjectArn] = js.undefined
  
  /**
    * The name of the project.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ProjectName] = js.undefined
}
object ProjectDescription {
  
  inline def apply(): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectDescription]
  }
  
  extension [Self <: ProjectDescription](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasets(value: DatasetMetadataList): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: DatasetMetadata*): Self = StObject.set(x, "Datasets", js.Array(value*))
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
  }
}
