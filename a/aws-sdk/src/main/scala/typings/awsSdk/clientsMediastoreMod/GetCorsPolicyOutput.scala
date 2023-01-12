package typings.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCorsPolicyOutput extends StObject {
  
  /**
    * The CORS policy assigned to the container.
    */
  var CorsPolicy: typings.awsSdk.clientsMediastoreMod.CorsPolicy
}
object GetCorsPolicyOutput {
  
  inline def apply(CorsPolicy: CorsPolicy): GetCorsPolicyOutput = {
    val __obj = js.Dynamic.literal(CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCorsPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCorsPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "CorsPolicy", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicyVarargs(value: CorsRule*): Self = StObject.set(x, "CorsPolicy", js.Array(value*))
  }
}
