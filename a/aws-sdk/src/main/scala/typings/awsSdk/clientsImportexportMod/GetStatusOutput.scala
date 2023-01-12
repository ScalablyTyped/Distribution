package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatusOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typings.awsSdk.clientsImportexportMod.ArtifactList] = js.undefined
  
  var Carrier: js.UndefOr[typings.awsSdk.clientsImportexportMod.Carrier] = js.undefined
  
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  var CurrentManifest: js.UndefOr[typings.awsSdk.clientsImportexportMod.CurrentManifest] = js.undefined
  
  var ErrorCount: js.UndefOr[typings.awsSdk.clientsImportexportMod.ErrorCount] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.clientsImportexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typings.awsSdk.clientsImportexportMod.JobType] = js.undefined
  
  var LocationCode: js.UndefOr[typings.awsSdk.clientsImportexportMod.LocationCode] = js.undefined
  
  var LocationMessage: js.UndefOr[typings.awsSdk.clientsImportexportMod.LocationMessage] = js.undefined
  
  var LogBucket: js.UndefOr[typings.awsSdk.clientsImportexportMod.LogBucket] = js.undefined
  
  var LogKey: js.UndefOr[typings.awsSdk.clientsImportexportMod.LogKey] = js.undefined
  
  var ProgressCode: js.UndefOr[typings.awsSdk.clientsImportexportMod.ProgressCode] = js.undefined
  
  var ProgressMessage: js.UndefOr[typings.awsSdk.clientsImportexportMod.ProgressMessage] = js.undefined
  
  var Signature: js.UndefOr[typings.awsSdk.clientsImportexportMod.Signature] = js.undefined
  
  var SignatureFileContents: js.UndefOr[Signature] = js.undefined
  
  var TrackingNumber: js.UndefOr[typings.awsSdk.clientsImportexportMod.TrackingNumber] = js.undefined
}
object GetStatusOutput {
  
  inline def apply(): GetStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    inline def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    inline def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value*))
    
    inline def setCarrier(value: Carrier): Self = StObject.set(x, "Carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "Carrier", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCurrentManifest(value: CurrentManifest): Self = StObject.set(x, "CurrentManifest", value.asInstanceOf[js.Any])
    
    inline def setCurrentManifestUndefined: Self = StObject.set(x, "CurrentManifest", js.undefined)
    
    inline def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setLocationCode(value: LocationCode): Self = StObject.set(x, "LocationCode", value.asInstanceOf[js.Any])
    
    inline def setLocationCodeUndefined: Self = StObject.set(x, "LocationCode", js.undefined)
    
    inline def setLocationMessage(value: LocationMessage): Self = StObject.set(x, "LocationMessage", value.asInstanceOf[js.Any])
    
    inline def setLocationMessageUndefined: Self = StObject.set(x, "LocationMessage", js.undefined)
    
    inline def setLogBucket(value: LogBucket): Self = StObject.set(x, "LogBucket", value.asInstanceOf[js.Any])
    
    inline def setLogBucketUndefined: Self = StObject.set(x, "LogBucket", js.undefined)
    
    inline def setLogKey(value: LogKey): Self = StObject.set(x, "LogKey", value.asInstanceOf[js.Any])
    
    inline def setLogKeyUndefined: Self = StObject.set(x, "LogKey", js.undefined)
    
    inline def setProgressCode(value: ProgressCode): Self = StObject.set(x, "ProgressCode", value.asInstanceOf[js.Any])
    
    inline def setProgressCodeUndefined: Self = StObject.set(x, "ProgressCode", js.undefined)
    
    inline def setProgressMessage(value: ProgressMessage): Self = StObject.set(x, "ProgressMessage", value.asInstanceOf[js.Any])
    
    inline def setProgressMessageUndefined: Self = StObject.set(x, "ProgressMessage", js.undefined)
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureFileContents(value: Signature): Self = StObject.set(x, "SignatureFileContents", value.asInstanceOf[js.Any])
    
    inline def setSignatureFileContentsUndefined: Self = StObject.set(x, "SignatureFileContents", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setTrackingNumber(value: TrackingNumber): Self = StObject.set(x, "TrackingNumber", value.asInstanceOf[js.Any])
    
    inline def setTrackingNumberUndefined: Self = StObject.set(x, "TrackingNumber", js.undefined)
  }
}
