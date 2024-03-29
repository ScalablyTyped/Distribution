package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictKey
  extends StObject
     with /* Key */ StringDictionary[Any] {
  
  var ServiceToken: String
}
object DictKey {
  
  inline def apply(ServiceToken: String): DictKey = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictKey] (val x: Self) extends AnyVal {
    
    inline def setServiceToken(value: String): Self = StObject.set(x, "ServiceToken", value.asInstanceOf[js.Any])
  }
}
