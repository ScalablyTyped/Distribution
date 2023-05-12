package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRefreshScheduleRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the topic you're creating a refresh schedule for.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: Arn
  
  /**
    * The name of the dataset.
    */
  var DatasetName: js.UndefOr[String] = js.undefined
  
  /**
    * The definition of a refresh schedule.
    */
  var RefreshSchedule: TopicRefreshSchedule
  
  /**
    * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object CreateTopicRefreshScheduleRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DatasetArn: Arn,
    RefreshSchedule: TopicRefreshSchedule,
    TopicId: TopicId
  ): CreateTopicRefreshScheduleRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any], RefreshSchedule = RefreshSchedule.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRefreshScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTopicRefreshScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetName(value: String): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setRefreshSchedule(value: TopicRefreshSchedule): Self = StObject.set(x, "RefreshSchedule", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
