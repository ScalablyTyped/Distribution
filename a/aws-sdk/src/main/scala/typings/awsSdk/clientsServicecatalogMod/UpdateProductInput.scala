package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProductInput extends StObject {
  
  /**
    * The language code.    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The tags to add to the product.
    */
  var AddTags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AddTags] = js.undefined
  
  /**
    * The updated description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
  
  /**
    * The updated distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * The product identifier.
    */
  var Id: typings.awsSdk.clientsServicecatalogMod.Id
  
  /**
    * The updated product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The updated owner of the product.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * The tags to remove from the product.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
  
  /**
    * Specifies connection details for the updated product and syncs the product to the connection source artifact. This automatically manages the product's artifacts based on changes to the source. The SourceConnection parameter consists of the following sub-fields.    Type     ConnectionParamters   
    */
  var SourceConnection: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SourceConnection] = js.undefined
  
  /**
    * The updated support description for the product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportDescription] = js.undefined
  
  /**
    * The updated support email for the product.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportEmail] = js.undefined
  
  /**
    * The updated support URL for the product.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.SupportUrl] = js.undefined
}
object UpdateProductInput {
  
  inline def apply(Id: Id): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProductInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAddTags(value: AddTags): Self = StObject.set(x, "AddTags", value.asInstanceOf[js.Any])
    
    inline def setAddTagsUndefined: Self = StObject.set(x, "AddTags", js.undefined)
    
    inline def setAddTagsVarargs(value: Tag*): Self = StObject.set(x, "AddTags", js.Array(value*))
    
    inline def setDescription(value: ProductViewShortDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDistributor(value: ProductViewOwner): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    inline def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setRemoveTags(value: TagKeys): Self = StObject.set(x, "RemoveTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveTagsUndefined: Self = StObject.set(x, "RemoveTags", js.undefined)
    
    inline def setRemoveTagsVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTags", js.Array(value*))
    
    inline def setSourceConnection(value: SourceConnection): Self = StObject.set(x, "SourceConnection", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectionUndefined: Self = StObject.set(x, "SourceConnection", js.undefined)
    
    inline def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    inline def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    inline def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
  }
}
