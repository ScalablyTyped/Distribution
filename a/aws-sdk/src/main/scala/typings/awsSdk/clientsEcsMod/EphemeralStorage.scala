package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EphemeralStorage extends StObject {
  
  /**
    * The total amount, in GiB, of ephemeral storage to set for the task. The minimum supported value is 21 GiB and the maximum supported value is 200 GiB.
    */
  var sizeInGiB: Integer
}
object EphemeralStorage {
  
  inline def apply(sizeInGiB: Integer): EphemeralStorage = {
    val __obj = js.Dynamic.literal(sizeInGiB = sizeInGiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EphemeralStorage] (val x: Self) extends AnyVal {
    
    inline def setSizeInGiB(value: Integer): Self = StObject.set(x, "sizeInGiB", value.asInstanceOf[js.Any])
  }
}
