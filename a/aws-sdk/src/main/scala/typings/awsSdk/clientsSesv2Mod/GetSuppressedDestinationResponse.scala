package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuppressedDestinationResponse extends StObject {
  
  /**
    * An object containing information about the suppressed email address.
    */
  var SuppressedDestination: typings.awsSdk.clientsSesv2Mod.SuppressedDestination
}
object GetSuppressedDestinationResponse {
  
  inline def apply(SuppressedDestination: SuppressedDestination): GetSuppressedDestinationResponse = {
    val __obj = js.Dynamic.literal(SuppressedDestination = SuppressedDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuppressedDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSuppressedDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setSuppressedDestination(value: SuppressedDestination): Self = StObject.set(x, "SuppressedDestination", value.asInstanceOf[js.Any])
  }
}
