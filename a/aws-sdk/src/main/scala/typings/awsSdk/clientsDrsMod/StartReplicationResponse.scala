package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationResponse extends StObject {
  
  /**
    * The Source Server that this action was targeted on.
    */
  var sourceServer: js.UndefOr[SourceServer] = js.undefined
}
object StartReplicationResponse {
  
  inline def apply(): StartReplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setSourceServer(value: SourceServer): Self = StObject.set(x, "sourceServer", value.asInstanceOf[js.Any])
    
    inline def setSourceServerUndefined: Self = StObject.set(x, "sourceServer", js.undefined)
  }
}
