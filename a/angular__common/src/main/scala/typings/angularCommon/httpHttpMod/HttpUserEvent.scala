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
  
  inline def apply[T](`type`: User): HttpUserEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUserEvent[T]]
  }
  
  extension [Self <: HttpUserEvent[?], T](x: Self & HttpUserEvent[T]) {
    
    inline def setType(value: User): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
