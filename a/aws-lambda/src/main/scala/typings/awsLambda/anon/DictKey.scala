package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictKey
  extends StObject
     with /* Key */ StringDictionary[js.Any] {
  
  var ServiceToken: String
}
object DictKey {
  
  @scala.inline
  def apply(ServiceToken: String): DictKey = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictKey]
  }
  
  @scala.inline
  implicit class DictKeyMutableBuilder[Self <: DictKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceToken(value: String): Self = StObject.set(x, "ServiceToken", value.asInstanceOf[js.Any])
  }
}
