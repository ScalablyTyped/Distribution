package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryCatalogData extends StObject {
  
  /**
    * The longform description of the contents of the repository. This text appears in the repository details on the Amazon ECR Public Gallery.
    */
  var aboutText: js.UndefOr[AboutText] = js.undefined
  
  /**
    * The architecture tags that are associated with the repository.  Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see RepositoryCatalogDataInput. 
    */
  var architectures: js.UndefOr[ArchitectureList] = js.undefined
  
  /**
    * The short description of the repository.
    */
  var description: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The URL that contains the logo that's associated with the repository.
    */
  var logoUrl: js.UndefOr[ResourceUrl] = js.undefined
  
  /**
    * Indicates whether the repository is certified by Amazon Web Services Marketplace.
    */
  var marketplaceCertified: js.UndefOr[MarketplaceCertified] = js.undefined
  
  /**
    * The operating system tags that are associated with the repository.  Only supported operating system tags appear publicly in the Amazon ECR Public Gallery. For more information, see RepositoryCatalogDataInput. 
    */
  var operatingSystems: js.UndefOr[OperatingSystemList] = js.undefined
  
  /**
    * The longform usage details of the contents of the repository. The usage text provides context for users of the repository.
    */
  var usageText: js.UndefOr[UsageText] = js.undefined
}
object RepositoryCatalogData {
  
  inline def apply(): RepositoryCatalogData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryCatalogData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryCatalogData] (val x: Self) extends AnyVal {
    
    inline def setAboutText(value: AboutText): Self = StObject.set(x, "aboutText", value.asInstanceOf[js.Any])
    
    inline def setAboutTextUndefined: Self = StObject.set(x, "aboutText", js.undefined)
    
    inline def setArchitectures(value: ArchitectureList): Self = StObject.set(x, "architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: Architecture*): Self = StObject.set(x, "architectures", js.Array(value*))
    
    inline def setDescription(value: RepositoryDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLogoUrl(value: ResourceUrl): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setMarketplaceCertified(value: MarketplaceCertified): Self = StObject.set(x, "marketplaceCertified", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceCertifiedUndefined: Self = StObject.set(x, "marketplaceCertified", js.undefined)
    
    inline def setOperatingSystems(value: OperatingSystemList): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: OperatingSystem*): Self = StObject.set(x, "operatingSystems", js.Array(value*))
    
    inline def setUsageText(value: UsageText): Self = StObject.set(x, "usageText", value.asInstanceOf[js.Any])
    
    inline def setUsageTextUndefined: Self = StObject.set(x, "usageText", js.undefined)
  }
}
