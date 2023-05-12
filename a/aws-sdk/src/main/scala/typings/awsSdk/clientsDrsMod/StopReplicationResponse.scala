package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationResponse extends StObject {
  
  /**
    * The Source Server that this action was targeted on.
    */
  var sourceServer: js.UndefOr[SourceServer] = js.undefined
}
object StopReplicationResponse {
  
  inline def apply(): StopReplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopReplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopReplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setSourceServer(value: SourceServer): Self = StObject.set(x, "sourceServer", value.asInstanceOf[js.Any])
    
    inline def setSourceServerUndefined: Self = StObject.set(x, "sourceServer", js.undefined)
  }
}
