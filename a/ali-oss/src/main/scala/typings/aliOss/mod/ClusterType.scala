package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterType extends StObject {
  
  var accessKeyId: String = js.native
  
  var accessKeySecret: String = js.native
  
  var host: String = js.native
}
object ClusterType {
  
  @scala.inline
  def apply(accessKeyId: String, accessKeySecret: String, host: String): ClusterType = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterType]
  }
  
  @scala.inline
  implicit class ClusterTypeMutableBuilder[Self <: ClusterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
