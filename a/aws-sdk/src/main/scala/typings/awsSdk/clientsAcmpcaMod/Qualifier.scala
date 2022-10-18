package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Qualifier extends StObject {
  
  /**
    * Contains a pointer to a certification practice statement (CPS) published by the CA.
    */
  var CpsUri: String256
}
object Qualifier {
  
  inline def apply(CpsUri: String256): Qualifier = {
    val __obj = js.Dynamic.literal(CpsUri = CpsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qualifier]
  }
  
  extension [Self <: Qualifier](x: Self) {
    
    inline def setCpsUri(value: String256): Self = StObject.set(x, "CpsUri", value.asInstanceOf[js.Any])
  }
}
