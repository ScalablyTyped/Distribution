package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshStatus extends StObject {
  
  /**
    * The current mesh status.
    */
  var status: js.UndefOr[MeshStatusCode] = js.undefined
}
object MeshStatus {
  
  @scala.inline
  def apply(): MeshStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshStatus]
  }
  
  @scala.inline
  implicit class MeshStatusMutableBuilder[Self <: MeshStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: MeshStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
