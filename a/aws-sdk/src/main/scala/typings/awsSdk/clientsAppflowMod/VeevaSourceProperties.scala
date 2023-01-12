package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VeevaSourceProperties extends StObject {
  
  /**
    * The document type specified in the Veeva document extract flow.
    */
  var documentType: js.UndefOr[DocumentType] = js.undefined
  
  /**
    * Boolean value to include All Versions of files in Veeva document extract flow.
    */
  var includeAllVersions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean value to include file renditions in Veeva document extract flow.
    */
  var includeRenditions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean value to include source files in Veeva document extract flow.
    */
  var includeSourceFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The object specified in the Veeva flow source. 
    */
  var `object`: Object
}
object VeevaSourceProperties {
  
  inline def apply(`object`: Object): VeevaSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VeevaSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setDocumentType(value: DocumentType): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setIncludeAllVersions(value: Boolean): Self = StObject.set(x, "includeAllVersions", value.asInstanceOf[js.Any])
    
    inline def setIncludeAllVersionsUndefined: Self = StObject.set(x, "includeAllVersions", js.undefined)
    
    inline def setIncludeRenditions(value: Boolean): Self = StObject.set(x, "includeRenditions", value.asInstanceOf[js.Any])
    
    inline def setIncludeRenditionsUndefined: Self = StObject.set(x, "includeRenditions", js.undefined)
    
    inline def setIncludeSourceFiles(value: Boolean): Self = StObject.set(x, "includeSourceFiles", value.asInstanceOf[js.Any])
    
    inline def setIncludeSourceFilesUndefined: Self = StObject.set(x, "includeSourceFiles", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
