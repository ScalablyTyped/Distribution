package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputResources extends StObject {
  
  /**
    * The Amazon EC2 AMIs created by this image.
    */
  var amis: js.UndefOr[AmiList] = js.undefined
  
  /**
    * Container images that the pipeline has generated and stored in the output repository.
    */
  var containers: js.UndefOr[ContainerList] = js.undefined
}
object OutputResources {
  
  inline def apply(): OutputResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputResources]
  }
  
  extension [Self <: OutputResources](x: Self) {
    
    inline def setAmis(value: AmiList): Self = StObject.set(x, "amis", value.asInstanceOf[js.Any])
    
    inline def setAmisUndefined: Self = StObject.set(x, "amis", js.undefined)
    
    inline def setAmisVarargs(value: Ami*): Self = StObject.set(x, "amis", js.Array(value*))
    
    inline def setContainers(value: ContainerList): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value*))
  }
}
