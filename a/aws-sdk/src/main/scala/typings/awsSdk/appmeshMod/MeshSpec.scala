package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshSpec extends StObject {
  
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[EgressFilter] = js.undefined
}
object MeshSpec {
  
  @scala.inline
  def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  
  @scala.inline
  implicit class MeshSpecMutableBuilder[Self <: MeshSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEgressFilter(value: EgressFilter): Self = StObject.set(x, "egressFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressFilterUndefined: Self = StObject.set(x, "egressFilter", js.undefined)
  }
}
