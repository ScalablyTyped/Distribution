package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNodeFromTemplateJobRequest extends StObject {
  
  /**
    * Tags for the job.
    */
  var JobTags: js.UndefOr[JobTagsList] = js.undefined
  
  /**
    * A description for the node.
    */
  var NodeDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * A name for the node.
    */
  var NodeName: typings.awsSdk.clientsPanoramaMod.NodeName
  
  /**
    * An output package name for the node.
    */
  var OutputPackageName: NodePackageName
  
  /**
    * An output package version for the node.
    */
  var OutputPackageVersion: NodePackageVersion
  
  /**
    * Template parameters for the node.
    */
  var TemplateParameters: TemplateParametersMap
  
  /**
    * The type of node.
    */
  var TemplateType: typings.awsSdk.clientsPanoramaMod.TemplateType
}
object CreateNodeFromTemplateJobRequest {
  
  inline def apply(
    NodeName: NodeName,
    OutputPackageName: NodePackageName,
    OutputPackageVersion: NodePackageVersion,
    TemplateParameters: TemplateParametersMap,
    TemplateType: TemplateType
  ): CreateNodeFromTemplateJobRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName.asInstanceOf[js.Any], OutputPackageName = OutputPackageName.asInstanceOf[js.Any], OutputPackageVersion = OutputPackageVersion.asInstanceOf[js.Any], TemplateParameters = TemplateParameters.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodeFromTemplateJobRequest]
  }
  
  extension [Self <: CreateNodeFromTemplateJobRequest](x: Self) {
    
    inline def setJobTags(value: JobTagsList): Self = StObject.set(x, "JobTags", value.asInstanceOf[js.Any])
    
    inline def setJobTagsUndefined: Self = StObject.set(x, "JobTags", js.undefined)
    
    inline def setJobTagsVarargs(value: JobResourceTags*): Self = StObject.set(x, "JobTags", js.Array(value*))
    
    inline def setNodeDescription(value: Description): Self = StObject.set(x, "NodeDescription", value.asInstanceOf[js.Any])
    
    inline def setNodeDescriptionUndefined: Self = StObject.set(x, "NodeDescription", js.undefined)
    
    inline def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setOutputPackageName(value: NodePackageName): Self = StObject.set(x, "OutputPackageName", value.asInstanceOf[js.Any])
    
    inline def setOutputPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "OutputPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateParameters(value: TemplateParametersMap): Self = StObject.set(x, "TemplateParameters", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: TemplateType): Self = StObject.set(x, "TemplateType", value.asInstanceOf[js.Any])
  }
}
