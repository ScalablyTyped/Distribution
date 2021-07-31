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
  
  @scala.inline
  def apply(): PutChannelConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutChannelConf]
  }
  
  @scala.inline
  implicit class PutChannelConfMutableBuilder[Self <: PutChannelConf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTarget(value: FragCount): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
