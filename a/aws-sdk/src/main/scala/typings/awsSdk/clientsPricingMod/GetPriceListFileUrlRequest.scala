package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPriceListFileUrlRequest extends StObject {
  
  /**
    * The format that you want to retrieve your Price List files in. The FileFormat can be obtained from the  ListPriceLists  response. 
    */
  var FileFormat: typings.awsSdk.clientsPricingMod.FileFormat
  
  /**
    * The unique identifier that maps to where your Price List files are located. PriceListArn can be obtained from the  ListPriceLists  response. 
    */
  var PriceListArn: typings.awsSdk.clientsPricingMod.PriceListArn
}
object GetPriceListFileUrlRequest {
  
  inline def apply(FileFormat: FileFormat, PriceListArn: PriceListArn): GetPriceListFileUrlRequest = {
    val __obj = js.Dynamic.literal(FileFormat = FileFormat.asInstanceOf[js.Any], PriceListArn = PriceListArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPriceListFileUrlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPriceListFileUrlRequest] (val x: Self) extends AnyVal {
    
    inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "FileFormat", value.asInstanceOf[js.Any])
    
    inline def setPriceListArn(value: PriceListArn): Self = StObject.set(x, "PriceListArn", value.asInstanceOf[js.Any])
  }
}
