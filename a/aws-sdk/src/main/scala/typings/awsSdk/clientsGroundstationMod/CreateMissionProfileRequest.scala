package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMissionProfileRequest extends StObject {
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: DataflowEdgeList
  
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: PositiveDurationInSeconds
  
  /**
    * Name of a mission profile.
    */
  var name: SafeName
  
  /**
    * KMS key to use for encrypting streams.
    */
  var streamsKmsKey: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * Role to use for encrypting streams with KMS key.
    */
  var streamsKmsRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: ConfigArn
}
object CreateMissionProfileRequest {
  
  inline def apply(
    dataflowEdges: DataflowEdgeList,
    minimumViableContactDurationSeconds: PositiveDurationInSeconds,
    name: SafeName,
    trackingConfigArn: ConfigArn
  ): CreateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(dataflowEdges = dataflowEdges.asInstanceOf[js.Any], minimumViableContactDurationSeconds = minimumViableContactDurationSeconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trackingConfigArn = trackingConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMissionProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMissionProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setContactPostPassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPostPassDurationSecondsUndefined: Self = StObject.set(x, "contactPostPassDurationSeconds", js.undefined)
    
    inline def setContactPrePassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPrePassDurationSecondsUndefined: Self = StObject.set(x, "contactPrePassDurationSeconds", js.undefined)
    
    inline def setDataflowEdges(value: DataflowEdgeList): Self = StObject.set(x, "dataflowEdges", value.asInstanceOf[js.Any])
    
    inline def setDataflowEdgesVarargs(value: DataflowEdge*): Self = StObject.set(x, "dataflowEdges", js.Array(value*))
    
    inline def setMinimumViableContactDurationSeconds(value: PositiveDurationInSeconds): Self = StObject.set(x, "minimumViableContactDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStreamsKmsKey(value: KmsKey): Self = StObject.set(x, "streamsKmsKey", value.asInstanceOf[js.Any])
    
    inline def setStreamsKmsKeyUndefined: Self = StObject.set(x, "streamsKmsKey", js.undefined)
    
    inline def setStreamsKmsRole(value: RoleArn): Self = StObject.set(x, "streamsKmsRole", value.asInstanceOf[js.Any])
    
    inline def setStreamsKmsRoleUndefined: Self = StObject.set(x, "streamsKmsRole", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTrackingConfigArn(value: ConfigArn): Self = StObject.set(x, "trackingConfigArn", value.asInstanceOf[js.Any])
  }
}
