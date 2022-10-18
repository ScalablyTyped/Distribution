package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateCreatedArtifactRequest extends StObject {
  
  /**
    * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.) 
    */
  var CreatedArtifact: typings.awsSdk.clientsMigrationhubMod.CreatedArtifact
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.DryRun] = js.undefined
  
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typings.awsSdk.clientsMigrationhubMod.MigrationTaskName
  
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsSdk.clientsMigrationhubMod.ProgressUpdateStream
}
object AssociateCreatedArtifactRequest {
  
  inline def apply(
    CreatedArtifact: CreatedArtifact,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream
  ): AssociateCreatedArtifactRequest = {
    val __obj = js.Dynamic.literal(CreatedArtifact = CreatedArtifact.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCreatedArtifactRequest]
  }
  
  extension [Self <: AssociateCreatedArtifactRequest](x: Self) {
    
    inline def setCreatedArtifact(value: CreatedArtifact): Self = StObject.set(x, "CreatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMigrationTaskName(value: MigrationTaskName): Self = StObject.set(x, "MigrationTaskName", value.asInstanceOf[js.Any])
    
    inline def setProgressUpdateStream(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStream", value.asInstanceOf[js.Any])
  }
}
