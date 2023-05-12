package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMissionProfileRequest extends StObject {
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined
  
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[PositiveDurationInSeconds] = js.undefined
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: Uuid
  
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * KMS key to use for encrypting streams.
    */
  var streamsKmsKey: js.UndefOr[KmsKey] = js.undefined
  
  /**
    * Role to use for encrypting streams with KMS key.
    */
  var streamsKmsRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
}
object UpdateMissionProfileRequest {
  
  inline def apply(missionProfileId: Uuid): UpdateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMissionProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMissionProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setContactPostPassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPostPassDurationSecondsUndefined: Self = StObject.set(x, "contactPostPassDurationSeconds", js.undefined)
    
    inline def setContactPrePassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPrePassDurationSecondsUndefined: Self = StObject.set(x, "contactPrePassDurationSeconds", js.undefined)
    
    inline def setDataflowEdges(value: DataflowEdgeList): Self = StObject.set(x, "dataflowEdges", value.asInstanceOf[js.Any])
    
    inline def setDataflowEdgesUndefined: Self = StObject.set(x, "dataflowEdges", js.undefined)
    
    inline def setDataflowEdgesVarargs(value: DataflowEdge*): Self = StObject.set(x, "dataflowEdges", js.Array(value*))
    
    inline def setMinimumViableContactDurationSeconds(value: PositiveDurationInSeconds): Self = StObject.set(x, "minimumViableContactDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinimumViableContactDurationSecondsUndefined: Self = StObject.set(x, "minimumViableContactDurationSeconds", js.undefined)
    
    inline def setMissionProfileId(value: Uuid): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    inline def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStreamsKmsKey(value: KmsKey): Self = StObject.set(x, "streamsKmsKey", value.asInstanceOf[js.Any])
    
    inline def setStreamsKmsKeyUndefined: Self = StObject.set(x, "streamsKmsKey", js.undefined)
    
    inline def setStreamsKmsRole(value: RoleArn): Self = StObject.set(x, "streamsKmsRole", value.asInstanceOf[js.Any])
    
    inline def setStreamsKmsRoleUndefined: Self = StObject.set(x, "streamsKmsRole", js.undefined)
    
    inline def setTrackingConfigArn(value: ConfigArn): Self = StObject.set(x, "trackingConfigArn", value.asInstanceOf[js.Any])
    
    inline def setTrackingConfigArnUndefined: Self = StObject.set(x, "trackingConfigArn", js.undefined)
  }
}
