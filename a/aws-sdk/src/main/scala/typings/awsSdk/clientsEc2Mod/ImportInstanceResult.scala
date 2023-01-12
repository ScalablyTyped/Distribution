package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportInstanceResult extends StObject {
  
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typings.awsSdk.clientsEc2Mod.ConversionTask] = js.undefined
}
object ImportInstanceResult {
  
  inline def apply(): ImportInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setConversionTask(value: ConversionTask): Self = StObject.set(x, "ConversionTask", value.asInstanceOf[js.Any])
    
    inline def setConversionTaskUndefined: Self = StObject.set(x, "ConversionTask", js.undefined)
  }
}
