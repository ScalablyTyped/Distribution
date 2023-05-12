package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedFieldSelector extends StObject {
  
  /**
    * An operator that includes events that match the last few characters of the event record field specified as the value of Field.
    */
  var EndsWith: js.UndefOr[Operator] = js.undefined
  
  /**
    *  An operator that includes events that match the exact value of the event record field specified as the value of Field. This is the only valid operator that you can use with the readOnly, eventCategory, and resources.type fields.
    */
  var Equals: js.UndefOr[Operator] = js.undefined
  
  /**
    *  A field in a CloudTrail event record on which to filter events to be logged. For event data stores for Config configuration items, Audit Manager evidence, or non-Amazon Web Services events, the field is used only for selecting events as filtering is not supported.   For CloudTrail event records, supported fields include readOnly, eventCategory, eventSource (for management events), eventName, resources.type, and resources.ARN.   For event data stores for Config configuration items, Audit Manager evidence, or non-Amazon Web Services events, the only supported field is eventCategory.      readOnly  - Optional. Can be set to Equals a value of true or false. If you do not add this field, CloudTrail logs both read and write events. A value of true logs only read events. A value of false logs only write events.     eventSource  - For filtering management events only. This can be set only to NotEquals kms.amazonaws.com.     eventName  - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event logged to CloudTrail, such as PutBucket or GetSnapshotBlock. You can have multiple values for this ﬁeld, separated by commas.     eventCategory  - This is required and must be set to Equals.     For CloudTrail event records, the value must be Management or Data.     For Config configuration items, the value must be ConfigurationItem.     For Audit Manager evidence, the value must be Evidence.     For non-Amazon Web Services events, the value must be ActivityAuditLog.        resources.type  - This ﬁeld is required for CloudTrail data events. resources.type can only use the Equals operator, and the value can be one of the following:    AWS::CloudTrail::Channel     AWS::S3::Object     AWS::Lambda::Function     AWS::DynamoDB::Table     AWS::S3Outposts::Object     AWS::ManagedBlockchain::Node     AWS::S3ObjectLambda::AccessPoint     AWS::EC2::Snapshot     AWS::S3::AccessPoint     AWS::DynamoDB::Stream     AWS::Glue::Table     AWS::FinSpace::Environment     AWS::SageMaker::ExperimentTrialComponent     AWS::SageMaker::FeatureGroup     You can have only one resources.type ﬁeld per selector. To log data events on more than one resource type, add another selector.     resources.ARN  - You can use any operator with resources.ARN, but if you use Equals or NotEquals, the value must exactly match the ARN of a valid resource of the type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals AWS::S3::Object, the ARN must be in one of the following formats. To log all data events for all objects in a specific S3 bucket, use the StartsWith operator, and include only the bucket ARN as the matching value. The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than symbols (&lt;&gt;) with resource-specific information.     arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/     arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/    When resources.type equals AWS::S3::AccessPoint, and the operator is set to Equals or NotEquals, the ARN must be in one of the following formats. To log events on all objects in an S3 access point, we recommend that you use only the access point ARN, don’t include the object path, and use the StartsWith or NotStartsWith operators.    arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;     arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;    When resources.type equals AWS::Lambda::Function, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;    When resources.type equals AWS::DynamoDB::Table, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;    When resources.type equals AWS::CloudTrail::Channel, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;    When resources.type equals AWS::S3Outposts::Object, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;    When resources.type equals AWS::ManagedBlockchain::Node, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;    When resources.type equals AWS::S3ObjectLambda::AccessPoint, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;    When resources.type equals AWS::EC2::Snapshot, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;    When resources.type equals AWS::DynamoDB::Stream, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;    When resources.type equals AWS::Glue::Table, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;    When resources.type equals AWS::FinSpace::Environment, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;    When resources.type equals AWS::SageMaker::ExperimentTrialComponent, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;    When resources.type equals AWS::SageMaker::FeatureGroup, and the operator is set to Equals or NotEquals, the ARN must be in the following format:    arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;     
    */
  var Field: SelectorField
  
  /**
    *  An operator that excludes events that match the last few characters of the event record field specified as the value of Field. 
    */
  var NotEndsWith: js.UndefOr[Operator] = js.undefined
  
  /**
    *  An operator that excludes events that match the exact value of the event record field specified as the value of Field. 
    */
  var NotEquals: js.UndefOr[Operator] = js.undefined
  
  /**
    *  An operator that excludes events that match the first few characters of the event record field specified as the value of Field. 
    */
  var NotStartsWith: js.UndefOr[Operator] = js.undefined
  
  /**
    * An operator that includes events that match the first few characters of the event record field specified as the value of Field.
    */
  var StartsWith: js.UndefOr[Operator] = js.undefined
}
object AdvancedFieldSelector {
  
  inline def apply(Field: SelectorField): AdvancedFieldSelector = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedFieldSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdvancedFieldSelector] (val x: Self) extends AnyVal {
    
    inline def setEndsWith(value: Operator): Self = StObject.set(x, "EndsWith", value.asInstanceOf[js.Any])
    
    inline def setEndsWithUndefined: Self = StObject.set(x, "EndsWith", js.undefined)
    
    inline def setEndsWithVarargs(value: OperatorValue*): Self = StObject.set(x, "EndsWith", js.Array(value*))
    
    inline def setEquals(value: Operator): Self = StObject.set(x, "Equals", value.asInstanceOf[js.Any])
    
    inline def setEqualsUndefined: Self = StObject.set(x, "Equals", js.undefined)
    
    inline def setEqualsVarargs(value: OperatorValue*): Self = StObject.set(x, "Equals", js.Array(value*))
    
    inline def setField(value: SelectorField): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setNotEndsWith(value: Operator): Self = StObject.set(x, "NotEndsWith", value.asInstanceOf[js.Any])
    
    inline def setNotEndsWithUndefined: Self = StObject.set(x, "NotEndsWith", js.undefined)
    
    inline def setNotEndsWithVarargs(value: OperatorValue*): Self = StObject.set(x, "NotEndsWith", js.Array(value*))
    
    inline def setNotEquals(value: Operator): Self = StObject.set(x, "NotEquals", value.asInstanceOf[js.Any])
    
    inline def setNotEqualsUndefined: Self = StObject.set(x, "NotEquals", js.undefined)
    
    inline def setNotEqualsVarargs(value: OperatorValue*): Self = StObject.set(x, "NotEquals", js.Array(value*))
    
    inline def setNotStartsWith(value: Operator): Self = StObject.set(x, "NotStartsWith", value.asInstanceOf[js.Any])
    
    inline def setNotStartsWithUndefined: Self = StObject.set(x, "NotStartsWith", js.undefined)
    
    inline def setNotStartsWithVarargs(value: OperatorValue*): Self = StObject.set(x, "NotStartsWith", js.Array(value*))
    
    inline def setStartsWith(value: Operator): Self = StObject.set(x, "StartsWith", value.asInstanceOf[js.Any])
    
    inline def setStartsWithUndefined: Self = StObject.set(x, "StartsWith", js.undefined)
    
    inline def setStartsWithVarargs(value: OperatorValue*): Self = StObject.set(x, "StartsWith", js.Array(value*))
  }
}
