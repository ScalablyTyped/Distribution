package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudtrail", "CloudTrail")
@js.native
object CloudTrailNs extends js.Object {
  trait AddTagsRequest extends js.Object {
    /**
      * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var ResourceId: String
    /**
      * Contains a list of CloudTrail tags, up to a limit of 50
      */
    var TagsList: js.UndefOr[TagsList] = js.undefined
  }
  
  trait AddTagsResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateTrailRequest extends js.Object {
    /**
      * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
      */
    var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether log file integrity validation is enabled. The default is false.  When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail will not create digest files for log files that were delivered during a period in which log file integrity validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail. 
      */
    var EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is publishing events from global services such as IAM to the log files.
      */
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is created in the current region or in all regions. The default is false.
      */
    var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is created for all accounts in an organization in AWS Organizations, or only for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account that is the master account for an organization in AWS Organizations.
      */
    var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique identifier. Examples:   alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012   12345678-1234-1234-1234-123456789012  
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the trail. The name must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)  
      */
    var Name: String
    /**
      * Specifies the name of the Amazon S3 bucket designated for publishing log files. See Amazon S3 Bucket Naming Requirements.
      */
    var S3BucketName: String
    /**
      * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files. The maximum length is 200 characters.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is 256 characters.
      */
    var SnsTopicName: js.UndefOr[String] = js.undefined
  }
  
  trait CreateTrailResponse extends js.Object {
    /**
      * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
      */
    var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether the trail is publishing events from global services such as IAM to the log files.
      */
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail exists in one region or in all regions.
      */
    var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is an organization trail.
      */
    var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether log file integrity validation is enabled.
      */
    var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the name of the trail.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the Amazon S3 bucket designated for publishing log files.
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
      */
    var SnsTopicARN: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated. Use SnsTopicARN.
      */
    var SnsTopicName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the trail that was created. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailARN: js.UndefOr[String] = js.undefined
  }
  
  trait DataResource extends js.Object {
    /**
      * The resource type in which you want to log data events. You can specify AWS::S3::Object or AWS::Lambda::Function resources.
      */
    var Type: js.UndefOr[String] = js.undefined
    /**
      * An array of Amazon Resource Name (ARN) strings or partial ARN strings for the specified objects.   To log data events for all objects in all S3 buckets in your AWS account, specify the prefix as arn:aws:s3:::.   This will also enable logging of data event activity performed by any user or role in your AWS account, even if that activity is performed on a bucket that belongs to another AWS account.     To log data events for all objects in all S3 buckets that include my-bucket in their names, specify the prefix as aws:s3:::my-bucket. The trail logs data events for all objects in all buckets whose name contains a match for my-bucket.    To log data events for all objects in an S3 bucket, specify the bucket and an empty object prefix such as arn:aws:s3:::bucket-1/. The trail logs data events for all objects in this S3 bucket.   To log data events for specific objects, specify the S3 bucket and object prefix such as arn:aws:s3:::bucket-1/example-images. The trail logs data events for objects in this S3 bucket that match the prefix.   To log data events for all functions in your AWS account, specify the prefix as arn:aws:lambda.  This will also enable logging of Invoke activity performed by any user or role in your AWS account, even if that activity is performed on a function that belongs to another AWS account.     To log data eents for a specific Lambda function, specify the function ARN.  Lambda function ARNs are exact. Unlike S3, you cannot use matching. For example, if you specify a function ARN arn:aws:lambda:us-west-2:111111111111:function:helloworld, data events will only be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld. They will not be logged for arn:aws:lambda:us-west-2:111111111111:function:helloworld2.   
      */
    var Values: js.UndefOr[DataResourceValues] = js.undefined
  }
  
  trait DeleteTrailRequest extends js.Object {
    /**
      * Specifies the name or the CloudTrail ARN of the trail to be deleted. The format of a trail ARN is: arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var Name: String
  }
  
  trait DeleteTrailResponse extends js.Object
  
  trait DescribeTrailsRequest extends js.Object {
    /**
      * Specifies whether to include shadow trails in the response. A shadow trail is the replication in a region of a trail that was created in a different region, or in the case of an organization trail, the replication of an organization trail in member accounts. If you do not include shadow trails, organization trails in a member account and region replication trails will not be returned. The default is true.
      */
    var includeShadowTrails: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies a list of trail names, trail ARNs, or both, of the trails to describe. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail  If an empty list is specified, information for the trail in the current region is returned.   If an empty list is specified and IncludeShadowTrails is false, then information for all trails in the current region is returned.   If an empty list is specified and IncludeShadowTrails is null or true, then information for all trails in the current region and any associated shadow trails in other regions is returned.    If one or more trail names are specified, information is returned only if the names match the names of trails belonging only to the current region. To return information about a trail in another region, you must specify its trail ARN. 
      */
    var trailNameList: js.UndefOr[TrailNameList] = js.undefined
  }
  
  trait DescribeTrailsResponse extends js.Object {
    /**
      * The list of trail objects.
      */
    var trailList: js.UndefOr[TrailList] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * The AWS access key ID that was used to sign the request. If the request was made with temporary security credentials, this is the access key ID of the temporary credentials.
      */
    var AccessKeyId: js.UndefOr[String] = js.undefined
    /**
      * A JSON string that contains a representation of the event returned.
      */
    var CloudTrailEvent: js.UndefOr[String] = js.undefined
    /**
      * The CloudTrail ID of the event returned.
      */
    var EventId: js.UndefOr[String] = js.undefined
    /**
      * The name of the event returned.
      */
    var EventName: js.UndefOr[String] = js.undefined
    /**
      * The AWS service that the request was made to.
      */
    var EventSource: js.UndefOr[String] = js.undefined
    /**
      * The date and time of the event returned.
      */
    var EventTime: js.UndefOr[_Date] = js.undefined
    /**
      * Information about whether the event is a write event or a read event. 
      */
    var ReadOnly: js.UndefOr[String] = js.undefined
    /**
      * A list of resources referenced by the event returned.
      */
    var Resources: js.UndefOr[ResourceList] = js.undefined
    /**
      * A user name or role name of the requester that called the API in the event returned.
      */
    var Username: js.UndefOr[String] = js.undefined
  }
  
  trait EventSelector extends js.Object {
    /**
      * CloudTrail supports data event logging for Amazon S3 objects and AWS Lambda functions. You can specify up to 250 resources for an individual event selector, but the total number of data resources cannot exceed 250 across all event selectors in a trail. This limit does not apply if you configure resource logging for all data events.  For more information, see Data Events and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
      */
    var DataResources: js.UndefOr[DataResources] = js.undefined
    /**
      * Specify if you want your event selector to include management events for your trail.  For more information, see Management Events in the AWS CloudTrail User Guide. By default, the value is true.
      */
    var IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specify if you want your trail to log read-only events, write-only events, or all. For example, the EC2 GetConsoleOutput is a read-only API operation and RunInstances is a write-only API operation.  By default, the value is All.
      */
    var ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined
  }
  
  trait GetEventSelectorsRequest extends js.Object {
    /**
      * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are not valid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailName: String
  }
  
  trait GetEventSelectorsResponse extends js.Object {
    /**
      * The event selectors that are configured for the trail.
      */
    var EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    /**
      * The specified trail ARN that has the event selectors.
      */
    var TrailARN: js.UndefOr[String] = js.undefined
  }
  
  trait GetTrailStatusRequest extends js.Object {
    /**
      * Specifies the name or the CloudTrail ARN of the trail for which you are requesting status. To get the status of a shadow trail (a replication of the trail in another region), you must specify its ARN. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var Name: String
  }
  
  trait GetTrailStatusResponse extends js.Object {
    /**
      * Whether the CloudTrail is currently logging AWS API calls.
      */
    var IsLogging: js.UndefOr[Boolean] = js.undefined
    /**
      * Displays any CloudWatch Logs error that CloudTrail encountered when attempting to deliver logs to CloudWatch Logs.
      */
    var LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined
    /**
      * Displays the most recent date and time when CloudTrail delivered logs to CloudWatch Logs.
      */
    var LatestCloudWatchLogsDeliveryTime: js.UndefOr[_Date] = js.undefined
    /**
      * This field is deprecated.
      */
    var LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated.
      */
    var LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined
    /**
      * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver log files to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
      */
    var LatestDeliveryError: js.UndefOr[String] = js.undefined
    /**
      * Specifies the date and time that CloudTrail last delivered log files to an account's Amazon S3 bucket.
      */
    var LatestDeliveryTime: js.UndefOr[_Date] = js.undefined
    /**
      * Displays any Amazon S3 error that CloudTrail encountered when attempting to deliver a digest file to the designated bucket. For more information see the topic Error Responses in the Amazon S3 API Reference.   This error occurs only when there is a problem with the destination S3 bucket and will not occur for timeouts. To resolve the issue, create a new bucket and call UpdateTrail to specify the new bucket, or fix the existing objects so that CloudTrail can again write to the bucket. 
      */
    var LatestDigestDeliveryError: js.UndefOr[String] = js.undefined
    /**
      * Specifies the date and time that CloudTrail last delivered a digest file to an account's Amazon S3 bucket.
      */
    var LatestDigestDeliveryTime: js.UndefOr[_Date] = js.undefined
    /**
      * This field is deprecated.
      */
    var LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated.
      */
    var LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined
    /**
      * Displays any Amazon SNS error that CloudTrail encountered when attempting to send a notification. For more information about Amazon SNS errors, see the Amazon SNS Developer Guide. 
      */
    var LatestNotificationError: js.UndefOr[String] = js.undefined
    /**
      * Specifies the date and time of the most recent Amazon SNS notification that CloudTrail has written a new log file to an account's Amazon S3 bucket.
      */
    var LatestNotificationTime: js.UndefOr[_Date] = js.undefined
    /**
      * Specifies the most recent date and time when CloudTrail started recording API calls for an AWS account.
      */
    var StartLoggingTime: js.UndefOr[_Date] = js.undefined
    /**
      * Specifies the most recent date and time when CloudTrail stopped recording API calls for an AWS account.
      */
    var StopLoggingTime: js.UndefOr[_Date] = js.undefined
    /**
      * This field is deprecated.
      */
    var TimeLoggingStarted: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated.
      */
    var TimeLoggingStopped: js.UndefOr[String] = js.undefined
  }
  
  trait ListPublicKeysRequest extends js.Object {
    /**
      * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used.
      */
    var EndTime: js.UndefOr[_Date] = js.undefined
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used, and the current public key is returned.
      */
    var StartTime: js.UndefOr[_Date] = js.undefined
  }
  
  trait ListPublicKeysResponse extends js.Object {
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
      */
    var PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Specifies a list of trail ARNs whose tags will be listed. The list has a limit of 20 ARNs. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var ResourceIdList: ResourceIdList
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * Reserved for future use.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * A list of resource tags.
      */
    var ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined
  }
  
  trait LookupAttribute extends js.Object {
    /**
      * Specifies an attribute on which to filter the events returned.
      */
    var AttributeKey: LookupAttributeKey
    /**
      * Specifies a value for the specified AttributeKey.
      */
    var AttributeValue: String
  }
  
  trait LookupEventsRequest extends js.Object {
    /**
      * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
      */
    var EndTime: js.UndefOr[_Date] = js.undefined
    /**
      * Contains a list of lookup attributes. Currently the list can contain only one item.
      */
    var LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined
    /**
      * The number of events to return. Possible values are 1 through 50. The default is 50.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
      */
    var StartTime: js.UndefOr[_Date] = js.undefined
  }
  
  trait LookupEventsResponse extends js.Object {
    /**
      * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is sorted by time. The most recent event is listed first.
      */
    var Events: js.UndefOr[EventsList] = js.undefined
    /**
      * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait PublicKey extends js.Object {
    /**
      * The fingerprint of the public key.
      */
    var Fingerprint: js.UndefOr[String] = js.undefined
    /**
      * The ending time of validity of the public key.
      */
    var ValidityEndTime: js.UndefOr[_Date] = js.undefined
    /**
      * The starting time of validity of the public key.
      */
    var ValidityStartTime: js.UndefOr[_Date] = js.undefined
    /**
      * The DER encoded public key value in PKCS#1 format.
      */
    var Value: js.UndefOr[ByteBuffer] = js.undefined
  }
  
  trait PutEventSelectorsRequest extends js.Object {
    /**
      * Specifies the settings for your event selectors. You can configure up to five event selectors for a trail.
      */
    var EventSelectors: EventSelectors
    /**
      * Specifies the name of the trail or trail ARN. If you specify a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)   If you specify a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailName: String
  }
  
  trait PutEventSelectorsResponse extends js.Object {
    /**
      * Specifies the event selectors configured for your trail.
      */
    var EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    /**
      * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailARN: js.UndefOr[String] = js.undefined
  }
  
  trait RemoveTagsRequest extends js.Object {
    /**
      * Specifies the ARN of the trail from which tags should be removed. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var ResourceId: String
    /**
      * Specifies a list of tags to be removed.
      */
    var TagsList: js.UndefOr[TagsList] = js.undefined
  }
  
  trait RemoveTagsResponse extends js.Object
  
  trait Resource extends js.Object {
    /**
      * The name of the resource referenced by the event returned. These are user-created names whose values will depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group or "i-1234567" for an EC2 Instance.
      */
    var ResourceName: js.UndefOr[String] = js.undefined
    /**
      * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is returned. Some examples of resource types are: Instance for EC2, Trail for CloudTrail, DBInstance for RDS, and AccessKey for IAM. For a list of resource types supported for event lookup, see Resource Types Supported for Event Lookup.
      */
    var ResourceType: js.UndefOr[String] = js.undefined
  }
  
  trait ResourceTag extends js.Object {
    /**
      * Specifies the ARN of the resource.
      */
    var ResourceId: js.UndefOr[String] = js.undefined
    /**
      * A list of tags.
      */
    var TagsList: js.UndefOr[TagsList] = js.undefined
  }
  
  trait StartLoggingRequest extends js.Object {
    /**
      * Specifies the name or the CloudTrail ARN of the trail for which CloudTrail logs AWS API calls. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var Name: String
  }
  
  trait StartLoggingResponse extends js.Object
  
  trait StopLoggingRequest extends js.Object {
    /**
      * Specifies the name or the CloudTrail ARN of the trail for which CloudTrail will stop logging AWS API calls. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var Name: String
  }
  
  trait StopLoggingResponse extends js.Object
  
  trait Tag extends js.Object {
    /**
      * The key in a key-value pair. The key must be must be no longer than 128 Unicode characters. The key must be unique for the resource to which it applies.
      */
    var Key: String
    /**
      * The value in a key-value pair of a tag. The value must be no longer than 256 Unicode characters.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait Trail extends js.Object {
    /**
      * Specifies an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered.
      */
    var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies if the trail has custom event selectors.
      */
    var HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined
    /**
      * The region in which the trail was created.
      */
    var HomeRegion: js.UndefOr[String] = js.undefined
    /**
      * Set to True to include AWS API calls from AWS global services such as IAM. Otherwise, False.
      */
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail belongs only to one region or exists in all regions.
      */
    var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is an organization trail.
      */
    var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether log file validation is enabled.
      */
    var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Name of the trail set by calling CreateTrail. The maximum length is 128 characters.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * Name of the Amazon S3 bucket into which CloudTrail delivers your trail files. See Amazon S3 Bucket Naming Requirements.
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.The maximum length is 200 characters.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
      */
    var SnsTopicARN: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated. Use SnsTopicARN.
      */
    var SnsTopicName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the trail. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailARN: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per trail. Overwrites an existing tag's value when a new value is specified for an existing tag key. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail that applies to all regions only from the region in which the trail was created (that is, from its home region).
      */
    def addTags(): awsDashSdkLib.libRequestMod.Request[AddTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more tags to a trail, up to a limit of 50. Tags must be unique per trail. Overwrites an existing tag's value when a new value is specified for an existing tag key. If you specify a key without a value, the tag will be created with the specified key and a value of null. You can tag a trail that applies to all regions only from the region in which the trail was created (that is, from its home region).
      */
    def addTags(params: AddTagsRequest): awsDashSdkLib.libRequestMod.Request[AddTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTags(
      params: AddTagsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ AddTagsResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[AddTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five trails can exist in a region, irrespective of the region in which they were created.
      */
    def createTrail(): awsDashSdkLib.libRequestMod.Request[CreateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a trail that specifies the settings for delivery of log data to an Amazon S3 bucket. A maximum of five trails can exist in a region, irrespective of the region in which they were created.
      */
    def createTrail(params: CreateTrailRequest): awsDashSdkLib.libRequestMod.Request[CreateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTrail(
      params: CreateTrailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a trail. This operation must be called from the region in which the trail was created. DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
      */
    def deleteTrail(): awsDashSdkLib.libRequestMod.Request[DeleteTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a trail. This operation must be called from the region in which the trail was created. DeleteTrail cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
      */
    def deleteTrail(params: DeleteTrailRequest): awsDashSdkLib.libRequestMod.Request[DeleteTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTrail(
      params: DeleteTrailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves settings for the trail associated with the current region for your account.
      */
    def describeTrails(): awsDashSdkLib.libRequestMod.Request[DescribeTrailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves settings for the trail associated with the current region for your account.
      */
    def describeTrails(params: DescribeTrailsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTrailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTrails(
      params: DescribeTrailsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTrailsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTrailsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging for data events.   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.
      */
    def getEventSelectors(): awsDashSdkLib.libRequestMod.Request[GetEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventSelectors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEventSelectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the settings for the event selectors that you configured for your trail. The information returned for your event selectors includes the following:   If your event selector includes read-only events, write-only events, or all events. This applies to both management events and data events.   If your event selector includes management events.   If your event selector includes data events, the Amazon S3 objects or AWS Lambda functions that you are logging for data events.   For more information, see Logging Data and Management Events for Trails  in the AWS CloudTrail User Guide.
      */
    def getEventSelectors(params: GetEventSelectorsRequest): awsDashSdkLib.libRequestMod.Request[GetEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getEventSelectors(
      params: GetEventSelectorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEventSelectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns trail status from a single region. To return trail status from all regions, you must call the operation on each region.
      */
    def getTrailStatus(): awsDashSdkLib.libRequestMod.Request[GetTrailStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrailStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrailStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrailStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a JSON-formatted list of information about the specified trail. Fields include information on delivery errors, Amazon SNS and Amazon S3 errors, and start and stop logging times for each trail. This operation returns trail status from a single region. To return trail status from all regions, you must call the operation on each region.
      */
    def getTrailStatus(params: GetTrailStatusRequest): awsDashSdkLib.libRequestMod.Request[GetTrailStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTrailStatus(
      params: GetTrailStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTrailStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTrailStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the same region for its corresponding public key. 
      */
    def listPublicKeys(): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPublicKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublicKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all public keys whose private keys were used to sign the digest files within the specified time range. The public key is needed to validate digest files that were signed with its corresponding private key.  CloudTrail uses different private/public key pairs per region. Each digest file is signed with a private key unique to its region. Therefore, when you validate a digest file from a particular region, you must look in the same region for its corresponding public key. 
      */
    def listPublicKeys(params: ListPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPublicKeys(
      params: ListPublicKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublicKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the trail in the current region.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the tags for the trail in the current region.
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Looks up management events captured by CloudTrail. Events for a region can be looked up in that region during the last 90 days. Lookup supports the following attributes:   AWS access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to one per second per account. If this limit is exceeded, a throttling error occurs.   Events that occurred during the selected time range will not be available for lookup if CloudTrail logging was not enabled when the events occurred. 
      */
    def lookupEvents(): awsDashSdkLib.libRequestMod.Request[LookupEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def lookupEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Looks up management events captured by CloudTrail. Events for a region can be looked up in that region during the last 90 days. Lookup supports the following attributes:   AWS access key   Event ID   Event name   Event source   Read only   Resource name   Resource type   User name   All attributes are optional. The default number of results returned is 50, with a maximum of 50 possible. The response includes a token that you can use to get the next page of results.  The rate of lookup requests is limited to one per second per account. If this limit is exceeded, a throttling error occurs.   Events that occurred during the selected time range will not be available for lookup if CloudTrail logging was not enabled when the events occurred. 
      */
    def lookupEvents(params: LookupEventsRequest): awsDashSdkLib.libRequestMod.Request[LookupEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def lookupEvents(
      params: LookupEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures an event selector for your trail. Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events.  When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.  Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event but it doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown. You can configure up to five event selectors for each trail. For more information, see Logging Data and Management Events for Trails  and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
      */
    def putEventSelectors(): awsDashSdkLib.libRequestMod.Request[PutEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEventSelectors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventSelectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures an event selector for your trail. Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events.  When an event occurs in your account, CloudTrail evaluates the event selectors in all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.  Example   You create an event selector for a trail and specify that you want write-only events.   The EC2 GetConsoleOutput and RunInstances API operations occur in your account.   CloudTrail evaluates whether the events match your event selectors.   The RunInstances is a write-only event and it matches your event selector. The trail logs the event.   The GetConsoleOutput is a read-only event but it doesn't match your event selector. The trail doesn't log the event.    The PutEventSelectors operation must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown. You can configure up to five event selectors for each trail. For more information, see Logging Data and Management Events for Trails  and Limits in AWS CloudTrail in the AWS CloudTrail User Guide.
      */
    def putEventSelectors(params: PutEventSelectorsRequest): awsDashSdkLib.libRequestMod.Request[PutEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putEventSelectors(
      params: PutEventSelectorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEventSelectorsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEventSelectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from a trail.
      */
    def removeTags(): awsDashSdkLib.libRequestMod.Request[RemoveTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from a trail.
      */
    def removeTags(params: RemoveTagsRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTags(
      params: RemoveTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
      */
    def startLogging(): awsDashSdkLib.libRequestMod.Request[StartLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLogging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLoggingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the recording of AWS API calls and log file delivery for a trail. For a trail that is enabled in all regions, this operation must be called from the region in which the trail was created. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail that is enabled in all regions.
      */
    def startLogging(params: StartLoggingRequest): awsDashSdkLib.libRequestMod.Request[StartLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startLogging(
      params: StartLoggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartLoggingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
      */
    def stopLogging(): awsDashSdkLib.libRequestMod.Request[StopLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopLogging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopLoggingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends the recording of AWS API calls and log file delivery for the specified trail. Under most circumstances, there is no need to use this action. You can update a trail without stopping it first. This action is the only way to stop recording. For a trail enabled in all regions, this operation must be called from the region in which the trail was created, or an InvalidHomeRegionException will occur. This operation cannot be called on the shadow trails (replicated trails in other regions) of a trail enabled in all regions.
      */
    def stopLogging(params: StopLoggingRequest): awsDashSdkLib.libRequestMod.Request[StopLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopLogging(
      params: StopLoggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopLoggingResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopLoggingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
      */
    def updateTrail(): awsDashSdkLib.libRequestMod.Request[UpdateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrail(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the settings that specify delivery of log files. Changes to a trail do not require stopping the CloudTrail service. Use this action to designate an existing bucket for log delivery. If the existing bucket has previously been a target for CloudTrail log files, an IAM policy exists for the bucket. UpdateTrail must be called from the region in which the trail was created; otherwise, an InvalidHomeRegionException is thrown.
      */
    def updateTrail(params: UpdateTrailRequest): awsDashSdkLib.libRequestMod.Request[UpdateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTrail(
      params: UpdateTrailRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTrailResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTrailResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateTrailRequest extends js.Object {
    /**
      * Specifies a log group name using an Amazon Resource Name (ARN), a unique identifier that represents the log group to which CloudTrail logs will be delivered. Not required unless you specify CloudWatchLogsRoleArn.
      */
    var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether log file validation is enabled. The default is false.  When you disable log file integrity validation, the chain of digest files is broken after one hour. CloudTrail will not create digest files for log files that were delivered during a period in which log file integrity validation was disabled. For example, if you enable log file integrity validation at noon on January 1, disable it at noon on January 2, and re-enable it at noon on January 10, digest files will not be created for the log files delivered from noon on January 2 to noon on January 10. The same applies whenever you stop CloudTrail logging or delete a trail. 
      */
    var EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is publishing events from global services such as IAM to the log files.
      */
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail applies only to the current region or to all regions. The default is false. If the trail exists only in the current region and this value is set to true, shadow trails (replications of the trail) will be created in the other regions. If the trail exists in all regions and this value is set to false, the trail will remain in the region where it was created, and its shadow trails in other regions will be deleted.
      */
    var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is applied to all accounts in an organization in AWS Organizations, or only for the current AWS account. The default is false, and cannot be true unless the call is made on behalf of an AWS account that is the master account for an organization in AWS Organizations. If the trail is not an organization trail and this is set to true, the trail will be created in all AWS accounts that belong to the organization. If the trail is an organization trail and this is set to false, the trail will remain in the current AWS account but be deleted from all member accounts in the organization.
      */
    var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the KMS key ID to use to encrypt the logs delivered by CloudTrail. The value can be an alias name prefixed by "alias/", a fully specified ARN to an alias, a fully specified ARN to a key, or a globally unique identifier. Examples:   alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:alias/MyAliasName   arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012   12345678-1234-1234-1234-123456789012  
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the trail or trail ARN. If Name is a trail name, the string must meet the following requirements:   Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)   Start with a letter or number, and end with a letter or number   Be between 3 and 128 characters   Have no adjacent periods, underscores or dashes. Names like my-_namespace and my--namespace are invalid.   Not be in IP address format (for example, 192.168.5.4)   If Name is a trail ARN, it must be in the format:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var Name: String
    /**
      * Specifies the name of the Amazon S3 bucket designated for publishing log files. See Amazon S3 Bucket Naming Requirements.
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files. The maximum length is 200 characters.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the Amazon SNS topic defined for notification of log file delivery. The maximum length is 256 characters.
      */
    var SnsTopicName: js.UndefOr[String] = js.undefined
  }
  
  trait UpdateTrailResponse extends js.Object {
    /**
      * Specifies the Amazon Resource Name (ARN) of the log group to which CloudTrail logs will be delivered.
      */
    var CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies the role for the CloudWatch Logs endpoint to assume to write to a user's log group.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether the trail is publishing events from global services such as IAM to the log files.
      */
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail exists in one region or in all regions.
      */
    var IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies whether the trail is an organization trail.
      */
    var IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail. The value is a fully specified ARN to a KMS key in the format:  arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012 
      */
    var KmsKeyId: js.UndefOr[String] = js.undefined
    /**
      * Specifies whether log file integrity validation is enabled.
      */
    var LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * Specifies the name of the trail.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * Specifies the name of the Amazon S3 bucket designated for publishing log files.
      */
    var S3BucketName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the Amazon S3 key prefix that comes after the name of the bucket you have designated for log file delivery. For more information, see Finding Your CloudTrail Log Files.
      */
    var S3KeyPrefix: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the Amazon SNS topic that CloudTrail uses to send notifications when log files are delivered. The format of a topic ARN is:  arn:aws:sns:us-east-2:123456789012:MyTopic 
      */
    var SnsTopicARN: js.UndefOr[String] = js.undefined
    /**
      * This field is deprecated. Use SnsTopicARN.
      */
    var SnsTopicName: js.UndefOr[String] = js.undefined
    /**
      * Specifies the ARN of the trail that was updated. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
      */
    var TrailARN: js.UndefOr[String] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ByteBuffer = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsCloudtrailMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  type LookupAttributeKey = awsDashSdkLib.awsDashSdkLibStrings.EventId | awsDashSdkLib.awsDashSdkLibStrings.EventName | awsDashSdkLib.awsDashSdkLibStrings.ReadOnly | awsDashSdkLib.awsDashSdkLibStrings.Username | awsDashSdkLib.awsDashSdkLibStrings.ResourceType | awsDashSdkLib.awsDashSdkLibStrings.ResourceName | awsDashSdkLib.awsDashSdkLibStrings.EventSource | awsDashSdkLib.awsDashSdkLibStrings.AccessKeyId | java.lang.String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PublicKeyList = js.Array[PublicKey]
  type ReadWriteType = awsDashSdkLib.awsDashSdkLibStrings.ReadOnly | awsDashSdkLib.awsDashSdkLibStrings.WriteOnly | awsDashSdkLib.awsDashSdkLibStrings.All | java.lang.String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceTagList = js.Array[ResourceTag]
  type String = java.lang.String
  type TagsList = js.Array[Tag]
  type TrailList = js.Array[Trail]
  type TrailNameList = js.Array[String]
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2013-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

