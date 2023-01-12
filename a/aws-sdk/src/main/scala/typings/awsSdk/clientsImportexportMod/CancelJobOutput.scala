package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobOutput extends StObject {
  
  var Success: js.UndefOr[typings.awsSdk.clientsImportexportMod.Success] = js.undefined
}
object CancelJobOutput {
  
  inline def apply(): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobOutput] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
