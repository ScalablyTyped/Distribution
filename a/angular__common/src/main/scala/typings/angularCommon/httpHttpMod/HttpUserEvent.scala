package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUserEvent[T] extends HttpEvent[T] {
  
  var `type`: User = js.native
}
object HttpUserEvent {
  
  @scala.inline
  def apply[T](`type`: User): HttpUserEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUserEvent[T]]
  }
  
  @scala.inline
  implicit class HttpUserEventMutableBuilder[Self <: HttpUserEvent[_], T] (val x: Self with HttpUserEvent[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: User): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
