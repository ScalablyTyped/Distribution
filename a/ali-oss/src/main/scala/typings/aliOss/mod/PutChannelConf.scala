package typings.aliOss.mod

import typings.aliOss.anon.FragCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelConf extends StObject {
  
  var Description: js.UndefOr[String] = js.undefined
  
  var Status: js.UndefOr[String] = js.undefined
  
  var Target: js.UndefOr[FragCount] = js.undefined
}
object PutChannelConf {
  
  inline def apply(): PutChannelConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutChannelConf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelConf] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTarget(value: FragCount): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
