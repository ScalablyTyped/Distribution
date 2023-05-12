package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProductAsAdminInput extends StObject {
  
  /**
    * The language code.    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The product identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Id] = js.undefined
  
  /**
    * The product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The unique identifier of the shared portfolio that the specified product is associated with. You can provide this parameter to retrieve the shared TagOptions associated with the product. If this parameter is provided and if TagOptions sharing is enabled in the portfolio share, the API returns both local and shared TagOptions associated with the product. Otherwise only local TagOptions will be returned. 
    */
  var SourcePortfolioId: js.UndefOr[Id] = js.undefined
}
object DescribeProductAsAdminInput {
  
  inline def apply(): DescribeProductAsAdminInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductAsAdminInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProductAsAdminInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSourcePortfolioId(value: Id): Self = StObject.set(x, "SourcePortfolioId", value.asInstanceOf[js.Any])
    
    inline def setSourcePortfolioIdUndefined: Self = StObject.set(x, "SourcePortfolioId", js.undefined)
  }
}
