package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUserEvent[T]
  extends StObject
     with HttpEvent[T] {
  
  var `type`: User
}
object HttpUserEvent {
  
  @scala.inline
  def apply[T](`type`: User): HttpUserEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUserEvent[T]]
  }
  
  @scala.inline
  implicit class HttpUserEventMutableBuilder[Self <: HttpUserEvent[?], T] (val x: Self & HttpUserEvent[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: User): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
