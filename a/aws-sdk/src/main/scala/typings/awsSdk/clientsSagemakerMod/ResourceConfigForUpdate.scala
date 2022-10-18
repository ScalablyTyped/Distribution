package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceConfigForUpdate extends StObject {
  
  /**
    * The KeepAlivePeriodInSeconds value specified in the ResourceConfig to update.
    */
  var KeepAlivePeriodInSeconds: typings.awsSdk.clientsSagemakerMod.KeepAlivePeriodInSeconds
}
object ResourceConfigForUpdate {
  
  inline def apply(KeepAlivePeriodInSeconds: KeepAlivePeriodInSeconds): ResourceConfigForUpdate = {
    val __obj = js.Dynamic.literal(KeepAlivePeriodInSeconds = KeepAlivePeriodInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConfigForUpdate]
  }
  
  extension [Self <: ResourceConfigForUpdate](x: Self) {
    
    inline def setKeepAlivePeriodInSeconds(value: KeepAlivePeriodInSeconds): Self = StObject.set(x, "KeepAlivePeriodInSeconds", value.asInstanceOf[js.Any])
  }
}
