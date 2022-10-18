package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportProjectResult extends StObject {
  
  /**
    *  URL which can be used to download the exported project configuation file(s). 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.undefined
  
  /**
    *  URL which can be shared to allow other AWS users to create their own project in AWS Mobile Hub with the same configuration as the specified project. This URL pertains to a snapshot in time of the project configuration that is created when this API is called. If you want to share additional changes to your project configuration, then you will need to create and share a new snapshot by calling this method again. 
    */
  var shareUrl: js.UndefOr[ShareUrl] = js.undefined
  
  /**
    *  Unique identifier for the exported snapshot of the project configuration. This snapshot identifier is included in the share URL. 
    */
  var snapshotId: js.UndefOr[SnapshotId] = js.undefined
}
object ExportProjectResult {
  
  inline def apply(): ExportProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportProjectResult]
  }
  
  extension [Self <: ExportProjectResult](x: Self) {
    
    inline def setDownloadUrl(value: DownloadUrl): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setShareUrl(value: ShareUrl): Self = StObject.set(x, "shareUrl", value.asInstanceOf[js.Any])
    
    inline def setShareUrlUndefined: Self = StObject.set(x, "shareUrl", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
