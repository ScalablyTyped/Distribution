package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryId extends StObject {
  
  /**
    * Arn of the registry to be updated. One of RegistryArn or RegistryName has to be provided.
    */
  var RegistryArn: js.UndefOr[GlueResourceArn] = js.undefined
  
  /**
    * Name of the registry. Used only for lookup. One of RegistryArn or RegistryName has to be provided. 
    */
  var RegistryName: js.UndefOr[SchemaRegistryNameString] = js.undefined
}
object RegistryId {
  
  inline def apply(): RegistryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegistryId] (val x: Self) extends AnyVal {
    
    inline def setRegistryArn(value: GlueResourceArn): Self = StObject.set(x, "RegistryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryArnUndefined: Self = StObject.set(x, "RegistryArn", js.undefined)
    
    inline def setRegistryName(value: SchemaRegistryNameString): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    inline def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
  }
}
