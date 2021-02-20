package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Passed extends StObject {
  
  // 认证标识
  var passed: String = js.native
  
  // 认证是否通过
  var reason: js.UndefOr[String] = js.native
  
  var token: String = js.native
}
object Passed {
  
  @scala.inline
  def apply(passed: String, token: String): Passed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
  
  @scala.inline
  implicit class PassedMutableBuilder[Self <: Passed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassed(value: String): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
