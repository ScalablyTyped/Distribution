package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriceList extends StObject {
  
  /**
    * The three alphabetical character ISO-4217 currency code the Price List files are denominated in. 
    */
  var CurrencyCode: js.UndefOr[typings.awsSdk.clientsPricingMod.CurrencyCode] = js.undefined
  
  /**
    * The format you want to retrieve your Price List files. The FileFormat can be obtained from the  ListPriceList  response. 
    */
  var FileFormats: js.UndefOr[typings.awsSdk.clientsPricingMod.FileFormats] = js.undefined
  
  /**
    * The unique identifier that maps to where your Price List files are located. PriceListArn can be obtained from the  ListPriceList  response. 
    */
  var PriceListArn: js.UndefOr[typings.awsSdk.clientsPricingMod.PriceListArn] = js.undefined
  
  /**
    * This is used to filter the Price List by Amazon Web Services Region. For example, to get the price list only for the US East (N. Virginia) Region, use us-east-1. If nothing is specified, you retrieve price lists for all applicable Regions. The available RegionCode list can be retrieved from  GetAttributeValues  API. 
    */
  var RegionCode: js.UndefOr[typings.awsSdk.clientsPricingMod.RegionCode] = js.undefined
}
object PriceList {
  
  inline def apply(): PriceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriceList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PriceList] (val x: Self) extends AnyVal {
    
    inline def setCurrencyCode(value: CurrencyCode): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setFileFormats(value: FileFormats): Self = StObject.set(x, "FileFormats", value.asInstanceOf[js.Any])
    
    inline def setFileFormatsUndefined: Self = StObject.set(x, "FileFormats", js.undefined)
    
    inline def setFileFormatsVarargs(value: FileFormat*): Self = StObject.set(x, "FileFormats", js.Array(value*))
    
    inline def setPriceListArn(value: PriceListArn): Self = StObject.set(x, "PriceListArn", value.asInstanceOf[js.Any])
    
    inline def setPriceListArnUndefined: Self = StObject.set(x, "PriceListArn", js.undefined)
    
    inline def setRegionCode(value: RegionCode): Self = StObject.set(x, "RegionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "RegionCode", js.undefined)
  }
}
