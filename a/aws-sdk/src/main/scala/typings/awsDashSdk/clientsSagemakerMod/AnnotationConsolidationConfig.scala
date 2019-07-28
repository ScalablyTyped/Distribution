package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationConsolidationConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of a Lambda function implements the logic for annotation consolidation. For the built-in bounding box, image classification, semantic segmentation, and text classification task types, Amazon SageMaker Ground Truth provides the following Lambda functions:    Bounding box - Finds the most similar boxes from different workers based on the Jaccard index of the boxes.  arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox   arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox   arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox   arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox   arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox   arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox     Image classification - Uses a variant of the Expectation Maximization approach to estimate the true class of an image based on annotations from individual workers.  arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass   arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass   arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass   arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass   arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass   arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass     Semantic segmentation - Treats each pixel in an image as a multi-class classification and treats pixel annotations from workers as "votes" for the correct label.  arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation   arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation   arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation   arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation   arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation   arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation     Text classification - Uses a variant of the Expectation Maximization approach to estimate the true class of text based on annotations from individual workers.  arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass   arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass   arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass   arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass   arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass   arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass    For more information, see Annotation Consolidation.
    */
  var AnnotationConsolidationLambdaArn: LambdaFunctionArn
}

object AnnotationConsolidationConfig {
  @scala.inline
  def apply(AnnotationConsolidationLambdaArn: LambdaFunctionArn): AnnotationConsolidationConfig = {
    val __obj = js.Dynamic.literal(AnnotationConsolidationLambdaArn = AnnotationConsolidationLambdaArn)
  
    __obj.asInstanceOf[AnnotationConsolidationConfig]
  }
}

