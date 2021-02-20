package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acl extends StObject {
  
  var acl: String = js.native
  
  var res: NormalSuccessResponse = js.native
}
object Acl {
  
  @scala.inline
  def apply(acl: String, res: NormalSuccessResponse): Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
  
  @scala.inline
  implicit class AclMutableBuilder[Self <: Acl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
