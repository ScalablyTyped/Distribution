package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgePackagingJobSummary extends StObject {
  
  /**
    * The name of the SageMaker Neo compilation job.
    */
  var CompilationJobName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The timestamp of when the job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the edge packaging job.
    */
  var EdgePackagingJobArn: typings.awsSdk.clientsSagemakerMod.EdgePackagingJobArn
  
  /**
    * The name of the edge packaging job.
    */
  var EdgePackagingJobName: EntityName
  
  /**
    * The status of the edge packaging job.
    */
  var EdgePackagingJobStatus: typings.awsSdk.clientsSagemakerMod.EdgePackagingJobStatus
  
  /**
    * The timestamp of when the edge packaging job was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The version of the model.
    */
  var ModelVersion: js.UndefOr[EdgeVersion] = js.undefined
}
object EdgePackagingJobSummary {
  
  inline def apply(
    EdgePackagingJobArn: EdgePackagingJobArn,
    EdgePackagingJobName: EntityName,
    EdgePackagingJobStatus: EdgePackagingJobStatus
  ): EdgePackagingJobSummary = {
    val __obj = js.Dynamic.literal(EdgePackagingJobArn = EdgePackagingJobArn.asInstanceOf[js.Any], EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any], EdgePackagingJobStatus = EdgePackagingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgePackagingJobSummary]
  }
  
  extension [Self <: EdgePackagingJobSummary](x: Self) {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobNameUndefined: Self = StObject.set(x, "CompilationJobName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEdgePackagingJobArn(value: EdgePackagingJobArn): Self = StObject.set(x, "EdgePackagingJobArn", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobStatus(value: EdgePackagingJobStatus): Self = StObject.set(x, "EdgePackagingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
  }
}
