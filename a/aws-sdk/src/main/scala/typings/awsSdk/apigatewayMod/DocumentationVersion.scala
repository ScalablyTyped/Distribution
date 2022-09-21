package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationVersion extends StObject {
  
  /**
    * The date when the API documentation snapshot is created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the API documentation snapshot.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The version identifier of the API documentation snapshot.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DocumentationVersion {
  
  inline def apply(): DocumentationVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationVersion]
  }
  
  extension [Self <: DocumentationVersion](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
