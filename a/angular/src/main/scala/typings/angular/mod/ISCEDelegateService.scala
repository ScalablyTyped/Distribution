package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng/service/$sceDelegate
///////////////////////////////////////////////////////////////////////////
trait ISCEDelegateService extends StObject {
  
  def getTrusted(`type`: String, mayBeTrusted: Any): Any
  
  def trustAs(`type`: String, value: Any): Any
  
  def valueOf(value: Any): Any
}
object ISCEDelegateService {
  
  inline def apply(getTrusted: (String, Any) => Any, trustAs: (String, Any) => Any, valueOf: Any => Any): ISCEDelegateService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), trustAs = js.Any.fromFunction2(trustAs), valueOf = js.Any.fromFunction1(valueOf))
    __obj.asInstanceOf[ISCEDelegateService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISCEDelegateService] (val x: Self) extends AnyVal {
    
    inline def setGetTrusted(value: (String, Any) => Any): Self = StObject.set(x, "getTrusted", js.Any.fromFunction2(value))
    
    inline def setTrustAs(value: (String, Any) => Any): Self = StObject.set(x, "trustAs", js.Any.fromFunction2(value))
    
    inline def setValueOf(value: Any => Any): Self = StObject.set(x, "valueOf", js.Any.fromFunction1(value))
  }
}
