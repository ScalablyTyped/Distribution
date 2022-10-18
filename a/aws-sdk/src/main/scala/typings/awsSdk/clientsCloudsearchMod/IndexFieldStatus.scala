package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexFieldStatus extends StObject {
  
  var Options: IndexField
  
  var Status: OptionStatus
}
object IndexFieldStatus {
  
  inline def apply(Options: IndexField, Status: OptionStatus): IndexFieldStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexFieldStatus]
  }
  
  extension [Self <: IndexFieldStatus](x: Self) {
    
    inline def setOptions(value: IndexField): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
