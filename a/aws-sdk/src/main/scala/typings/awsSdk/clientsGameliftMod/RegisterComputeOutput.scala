package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterComputeOutput extends StObject {
  
  /**
    * The details of the compute resource you registered to the specified fleet.
    */
  var Compute: js.UndefOr[typings.awsSdk.clientsGameliftMod.Compute] = js.undefined
}
object RegisterComputeOutput {
  
  inline def apply(): RegisterComputeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterComputeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterComputeOutput] (val x: Self) extends AnyVal {
    
    inline def setCompute(value: Compute): Self = StObject.set(x, "Compute", value.asInstanceOf[js.Any])
    
    inline def setComputeUndefined: Self = StObject.set(x, "Compute", js.undefined)
  }
}
