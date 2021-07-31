package typings.activexInfopath.global.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.UserObject")
@js.native
class UserObject protected ()
  extends StObject
     with typings.activexInfopath.InfoPath.UserObject {
  
  /* CompleteClass */
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: typings.activexInfopath.InfoPath.UserObject = js.native
  
  /* CompleteClass */
  override def IsCurrentUser(bstrUsername: String): Boolean = js.native
  
  /* CompleteClass */
  override def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}
