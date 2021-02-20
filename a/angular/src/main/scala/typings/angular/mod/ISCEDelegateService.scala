package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng/service/$sceDelegate
///////////////////////////////////////////////////////////////////////////
@js.native
trait ISCEDelegateService extends StObject {
  
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any = js.native
  
  def trustAs(`type`: String, value: js.Any): js.Any = js.native
  
  def valueOf(value: js.Any): js.Any = js.native
}
object ISCEDelegateService {
  
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => js.Any,
    trustAs: (String, js.Any) => js.Any,
    valueOf: js.Any => js.Any
  ): ISCEDelegateService = {
    val __obj = js.Dynamic.literal(getTrusted = js.Any.fromFunction2(getTrusted), trustAs = js.Any.fromFunction2(trustAs), valueOf = js.Any.fromFunction1(valueOf))
    __obj.asInstanceOf[ISCEDelegateService]
  }
  
  @scala.inline
  implicit class ISCEDelegateServiceMutableBuilder[Self <: ISCEDelegateService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTrusted(value: (String, js.Any) => js.Any): Self = StObject.set(x, "getTrusted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTrustAs(value: (String, js.Any) => js.Any): Self = StObject.set(x, "trustAs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueOf(value: js.Any => js.Any): Self = StObject.set(x, "valueOf", js.Any.fromFunction1(value))
  }
}
