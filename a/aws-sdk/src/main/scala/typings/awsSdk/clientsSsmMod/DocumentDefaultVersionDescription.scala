package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentDefaultVersionDescription extends StObject {
  
  /**
    * The default version of the document.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
  
  /**
    * The default version of the artifact associated with the document.
    */
  var DefaultVersionName: js.UndefOr[DocumentVersionName] = js.undefined
  
  /**
    * The name of the document.
    */
  var Name: js.UndefOr[DocumentName] = js.undefined
}
object DocumentDefaultVersionDescription {
  
  inline def apply(): DocumentDefaultVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentDefaultVersionDescription]
  }
  
  extension [Self <: DocumentDefaultVersionDescription](x: Self) {
    
    inline def setDefaultVersion(value: DocumentVersion): Self = StObject.set(x, "DefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionName(value: DocumentVersionName): Self = StObject.set(x, "DefaultVersionName", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionNameUndefined: Self = StObject.set(x, "DefaultVersionName", js.undefined)
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "DefaultVersion", js.undefined)
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
