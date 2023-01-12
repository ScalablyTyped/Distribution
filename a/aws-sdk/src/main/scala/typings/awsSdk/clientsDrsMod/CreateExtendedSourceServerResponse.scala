package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExtendedSourceServerResponse extends StObject {
  
  /**
    * Created extended source server.
    */
  var sourceServer: js.UndefOr[SourceServer] = js.undefined
}
object CreateExtendedSourceServerResponse {
  
  inline def apply(): CreateExtendedSourceServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExtendedSourceServerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateExtendedSourceServerResponse] (val x: Self) extends AnyVal {
    
    inline def setSourceServer(value: SourceServer): Self = StObject.set(x, "sourceServer", value.asInstanceOf[js.Any])
    
    inline def setSourceServerUndefined: Self = StObject.set(x, "sourceServer", js.undefined)
  }
}
