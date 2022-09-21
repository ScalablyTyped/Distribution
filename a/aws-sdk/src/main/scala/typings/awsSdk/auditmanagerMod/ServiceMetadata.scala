package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceMetadata extends StObject {
  
  /**
    *  The category that the Amazon Web Service belongs to, such as compute, storage, or database. 
    */
  var category: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The description of the Amazon Web Service. 
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The display name of the Amazon Web Service. 
    */
  var displayName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the Amazon Web Service. 
    */
  var name: js.UndefOr[AWSServiceName] = js.undefined
}
object ServiceMetadata {
  
  inline def apply(): ServiceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceMetadata]
  }
  
  extension [Self <: ServiceMetadata](x: Self) {
    
    inline def setCategory(value: NonEmptyString): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NonEmptyString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: AWSServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
