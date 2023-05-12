package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryJobListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a discovery job.
    */
  var DiscoveryJobArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn] = js.undefined
  
  /**
    * The status of a discovery job. For more information, see Discovery job statuses.
    */
  var Status: js.UndefOr[DiscoveryJobStatus] = js.undefined
}
object DiscoveryJobListEntry {
  
  inline def apply(): DiscoveryJobListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryJobListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryJobListEntry] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryJobArnUndefined: Self = StObject.set(x, "DiscoveryJobArn", js.undefined)
    
    inline def setStatus(value: DiscoveryJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
