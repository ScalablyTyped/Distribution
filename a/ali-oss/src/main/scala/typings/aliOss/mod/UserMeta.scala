package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserMeta extends StObject {
  
  var pid: Double
  
  var uid: Double
}
object UserMeta {
  
  @scala.inline
  def apply(pid: Double, uid: Double): UserMeta = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMeta]
  }
  
  @scala.inline
  implicit class UserMetaMutableBuilder[Self <: UserMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
