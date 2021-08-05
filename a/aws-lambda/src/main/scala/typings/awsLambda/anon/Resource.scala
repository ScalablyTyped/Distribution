package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  var Resource: String | js.Array[String]
}
object Resource {
  
  inline def apply(Resource: String | js.Array[String]): Resource = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "Resource", js.Array(value :_*))
  }
}
