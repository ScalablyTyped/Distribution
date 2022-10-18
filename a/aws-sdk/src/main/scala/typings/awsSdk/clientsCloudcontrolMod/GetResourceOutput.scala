package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceOutput extends StObject {
  
  var ResourceDescription: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.ResourceDescription] = js.undefined
  
  /**
    * The name of the resource type.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.TypeName] = js.undefined
}
object GetResourceOutput {
  
  inline def apply(): GetResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceOutput]
  }
  
  extension [Self <: GetResourceOutput](x: Self) {
    
    inline def setResourceDescription(value: ResourceDescription): Self = StObject.set(x, "ResourceDescription", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptionUndefined: Self = StObject.set(x, "ResourceDescription", js.undefined)
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
