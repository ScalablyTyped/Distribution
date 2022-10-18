package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePortfolioInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AddTags] = js.undefined
  
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var Id: typings.awsSdk.clientsServicecatalogMod.Id
  
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProviderName] = js.undefined
  
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
}
object UpdatePortfolioInput {
  
  inline def apply(Id: Id): UpdatePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
  
  extension [Self <: UpdatePortfolioInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAddTags(value: AddTags): Self = StObject.set(x, "AddTags", value.asInstanceOf[js.Any])
    
    inline def setAddTagsUndefined: Self = StObject.set(x, "AddTags", js.undefined)
    
    inline def setAddTagsVarargs(value: Tag*): Self = StObject.set(x, "AddTags", js.Array(value*))
    
    inline def setDescription(value: PortfolioDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayName(value: PortfolioDisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: ProviderName): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameUndefined: Self = StObject.set(x, "ProviderName", js.undefined)
    
    inline def setRemoveTags(value: TagKeys): Self = StObject.set(x, "RemoveTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveTagsUndefined: Self = StObject.set(x, "RemoveTags", js.undefined)
    
    inline def setRemoveTagsVarargs(value: TagKey*): Self = StObject.set(x, "RemoveTags", js.Array(value*))
  }
}
