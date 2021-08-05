package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotResource extends StObject {
  
  var NotResource: String | js.Array[String]
}
object NotResource {
  
  inline def apply(NotResource: String | js.Array[String]): NotResource = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotResource]
  }
  
  extension [Self <: NotResource](x: Self) {
    
    inline def setNotResource(value: String | js.Array[String]): Self = StObject.set(x, "NotResource", value.asInstanceOf[js.Any])
    
    inline def setNotResourceVarargs(value: String*): Self = StObject.set(x, "NotResource", js.Array(value :_*))
  }
}
