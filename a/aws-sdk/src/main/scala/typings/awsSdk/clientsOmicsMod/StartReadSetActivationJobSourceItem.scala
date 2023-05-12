package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReadSetActivationJobSourceItem extends StObject {
  
  /**
    * The source's read set ID.
    */
  var readSetId: ReadSetId
}
object StartReadSetActivationJobSourceItem {
  
  inline def apply(readSetId: ReadSetId): StartReadSetActivationJobSourceItem = {
    val __obj = js.Dynamic.literal(readSetId = readSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReadSetActivationJobSourceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReadSetActivationJobSourceItem] (val x: Self) extends AnyVal {
    
    inline def setReadSetId(value: ReadSetId): Self = StObject.set(x, "readSetId", value.asInstanceOf[js.Any])
  }
}
