package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  /**
    * Information about the job error.
    */
  var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.ImportAssetFromSignedUrlJobErrorDetails] = js.undefined
  
  /**
    * Information about the job error.
    */
  var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry] = js.undefined
}
object Details {
  
  inline def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setImportAssetFromSignedUrlJobErrorDetails(value: ImportAssetFromSignedUrlJobErrorDetails): Self = StObject.set(x, "ImportAssetFromSignedUrlJobErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromSignedUrlJobErrorDetailsUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrlJobErrorDetails", js.undefined)
    
    inline def setImportAssetsFromS3JobErrorDetails(value: ListOfAssetSourceEntry): Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromS3JobErrorDetailsUndefined: Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", js.undefined)
    
    inline def setImportAssetsFromS3JobErrorDetailsVarargs(value: AssetSourceEntry*): Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", js.Array(value*))
  }
}
