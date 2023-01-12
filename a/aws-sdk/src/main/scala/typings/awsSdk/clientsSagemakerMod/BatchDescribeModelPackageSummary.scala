package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeModelPackageSummary extends StObject {
  
  /**
    * The creation time of the mortgage package summary.
    */
  var CreationTime: js.Date
  
  var InferenceSpecification: typings.awsSdk.clientsSagemakerMod.InferenceSpecification
  
  /**
    * The approval status of the model.
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.clientsSagemakerMod.ModelPackageArn
  
  /**
    * The description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The group name for the model package
    */
  var ModelPackageGroupName: EntityName
  
  /**
    * The status of the mortgage package.
    */
  var ModelPackageStatus: typings.awsSdk.clientsSagemakerMod.ModelPackageStatus
  
  /**
    * The version number of a versioned model.
    */
  var ModelPackageVersion: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageVersion] = js.undefined
}
object BatchDescribeModelPackageSummary {
  
  inline def apply(
    CreationTime: js.Date,
    InferenceSpecification: InferenceSpecification,
    ModelPackageArn: ModelPackageArn,
    ModelPackageGroupName: EntityName,
    ModelPackageStatus: ModelPackageStatus
  ): BatchDescribeModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], InferenceSpecification = InferenceSpecification.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeModelPackageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDescribeModelPackageSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersion(value: ModelPackageVersion): Self = StObject.set(x, "ModelPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersionUndefined: Self = StObject.set(x, "ModelPackageVersion", js.undefined)
  }
}
