package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportReadSet extends StObject {
  
  /**
    * The set's ID.
    */
  var readSetId: ReadSetId
}
object ExportReadSet {
  
  inline def apply(readSetId: ReadSetId): ExportReadSet = {
    val __obj = js.Dynamic.literal(readSetId = readSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportReadSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportReadSet] (val x: Self) extends AnyVal {
    
    inline def setReadSetId(value: ReadSetId): Self = StObject.set(x, "readSetId", value.asInstanceOf[js.Any])
  }
}
