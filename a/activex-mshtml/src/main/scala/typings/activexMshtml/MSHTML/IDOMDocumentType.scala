package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDOMDocumentType extends StObject {
  
  @JSName("MSHTML.IDOMDocumentType_typekey")
  var MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType
  
  val entities: js.Any
  
  val internalSubset: js.Any
  
  val name: String
  
  val notations: js.Any
  
  val publicId: js.Any
  
  val systemId: js.Any
}
object IDOMDocumentType {
  
  @scala.inline
  def apply(
    MSHTMLDotIDOMDocumentType_typekey: IDOMDocumentType,
    entities: js.Any,
    internalSubset: js.Any,
    name: String,
    notations: js.Any,
    publicId: js.Any,
    systemId: js.Any
  ): IDOMDocumentType = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], internalSubset = internalSubset.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMDocumentType_typekey")(MSHTMLDotIDOMDocumentType_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMDocumentType]
  }
  
  @scala.inline
  implicit class IDOMDocumentTypeMutableBuilder[Self <: IDOMDocumentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Any): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSubset(value: js.Any): Self = StObject.set(x, "internalSubset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIDOMDocumentType_typekey(value: IDOMDocumentType): Self = StObject.set(x, "MSHTML.IDOMDocumentType_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotations(value: js.Any): Self = StObject.set(x, "notations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicId(value: js.Any): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemId(value: js.Any): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
  }
}
