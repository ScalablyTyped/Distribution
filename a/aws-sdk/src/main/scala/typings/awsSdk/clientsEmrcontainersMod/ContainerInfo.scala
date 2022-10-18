package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerInfo extends StObject {
  
  /**
    * The information about the EKS cluster.
    */
  var eksInfo: js.UndefOr[EksInfo] = js.undefined
}
object ContainerInfo {
  
  inline def apply(): ContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerInfo]
  }
  
  extension [Self <: ContainerInfo](x: Self) {
    
    inline def setEksInfo(value: EksInfo): Self = StObject.set(x, "eksInfo", value.asInstanceOf[js.Any])
    
    inline def setEksInfoUndefined: Self = StObject.set(x, "eksInfo", js.undefined)
  }
}
