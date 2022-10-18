package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteArchiveRequest extends StObject {
  
  /**
    * The name of the archive to delete.
    */
  var ArchiveName: typings.awsSdk.clientsCloudwatcheventsMod.ArchiveName
}
object DeleteArchiveRequest {
  
  inline def apply(ArchiveName: ArchiveName): DeleteArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteArchiveRequest]
  }
  
  extension [Self <: DeleteArchiveRequest](x: Self) {
    
    inline def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
  }
}
