package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentRequires extends StObject {
  
  /**
    * The name of the required SSM document. The name can be an Amazon Resource Name (ARN).
    */
  var Name: DocumentARN
  
  /**
    * The document version required by the current document.
    */
  var Version: js.UndefOr[DocumentVersion] = js.undefined
}
object DocumentRequires {
  
  inline def apply(Name: DocumentARN): DocumentRequires = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRequires]
  }
  
  extension [Self <: DocumentRequires](x: Self) {
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: DocumentVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
