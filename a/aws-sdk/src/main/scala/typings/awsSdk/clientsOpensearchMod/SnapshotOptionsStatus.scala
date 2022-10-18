package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptionsStatus extends StObject {
  
  /**
    * The daily snapshot options specified for the domain.
    */
  var Options: SnapshotOptions
  
  /**
    * The status of a daily automated snapshot.
    */
  var Status: OptionStatus
}
object SnapshotOptionsStatus {
  
  inline def apply(Options: SnapshotOptions, Status: OptionStatus): SnapshotOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotOptionsStatus]
  }
  
  extension [Self <: SnapshotOptionsStatus](x: Self) {
    
    inline def setOptions(value: SnapshotOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
