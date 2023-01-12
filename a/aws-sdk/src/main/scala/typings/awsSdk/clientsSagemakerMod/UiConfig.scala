package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiConfig extends StObject {
  
  /**
    * The ARN of the worker task template used to render the worker UI and tools for labeling job tasks. Use this parameter when you are creating a labeling job for named entity recognition, 3D point cloud and video frame labeling jobs. Use your labeling job task type to select one of the following ARNs and use it with this parameter when you create a labeling job. Replace aws-region with the Amazon Web Services Region you are creating your labeling job in. For example, replace aws-region with us-west-1 if you create a labeling job in US West (N. California).  Named Entity Recognition  Use the following HumanTaskUiArn for named entity recognition labeling jobs:  arn:aws:sagemaker:aws-region:394669845002:human-task-ui/NamedEntityRecognition   3D Point Cloud HumanTaskUiArns  Use this HumanTaskUiArn for 3D point cloud object detection and 3D point cloud object detection adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectDetection     Use this HumanTaskUiArn for 3D point cloud object tracking and 3D point cloud object tracking adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudObjectTracking     Use this HumanTaskUiArn for 3D point cloud semantic segmentation and 3D point cloud semantic segmentation adjustment labeling jobs.    arn:aws:sagemaker:aws-region:394669845002:human-task-ui/PointCloudSemanticSegmentation     Video Frame HumanTaskUiArns  Use this HumanTaskUiArn for video frame object detection and video frame object detection adjustment labeling jobs.     arn:aws:sagemaker:region:394669845002:human-task-ui/VideoObjectDetection     Use this HumanTaskUiArn for video frame object tracking and video frame object tracking adjustment labeling jobs.     arn:aws:sagemaker:aws-region:394669845002:human-task-ui/VideoObjectTracking   
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanTaskUiArn] = js.undefined
  
  /**
    * The Amazon S3 bucket location of the UI template, or worker task template. This is the template used to render the worker UI and tools for labeling job tasks. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: js.UndefOr[S3Uri] = js.undefined
}
object UiConfig {
  
  inline def apply(): UiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UiConfig] (val x: Self) extends AnyVal {
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiArnUndefined: Self = StObject.set(x, "HumanTaskUiArn", js.undefined)
    
    inline def setUiTemplateS3Uri(value: S3Uri): Self = StObject.set(x, "UiTemplateS3Uri", value.asInstanceOf[js.Any])
    
    inline def setUiTemplateS3UriUndefined: Self = StObject.set(x, "UiTemplateS3Uri", js.undefined)
  }
}
