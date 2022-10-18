package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZone extends StObject {
  
  /**
    * The name of the Availability Zone.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object AvailabilityZone {
  
  inline def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  extension [Self <: AvailabilityZone](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
