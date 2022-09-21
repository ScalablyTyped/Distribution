package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMDocumentType extends StObject {
  
  /* private */ @JSName("MSHTML.IDOMDocumentType_typekey")
  var MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType
  
  val entities: Any
  
  val internalSubset: Any
  
  val name: String
  
  val notations: Any
  
  val publicId: Any
  
  val systemId: Any
}
object IDOMDocumentType {
  
  inline def apply(
    MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType,
    entities: Any,
    internalSubset: Any,
    name: String,
    notations: Any,
    publicId: Any,
    systemId: Any
  ): IDOMDocumentType = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], internalSubset = internalSubset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMDocumentType_typekey")(MSHTMLDotIDOMDocumentType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMDocumentType]
  }
  
  extension [Self <: IDOMDocumentType](x: Self) {
    
    inline def setEntities(value: Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setInternalSubset(value: Any): Self = StObject.set(x, "internalSubset", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIDOMDocumentType_typekey(value: IDOMDocumentType): Self = StObject.set(x, "MSHTML.IDOMDocumentType_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotations(value: Any): Self = StObject.set(x, "notations", value.asInstanceOf[js.Any])
    
    inline def setPublicId(value: Any): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setSystemId(value: Any): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
