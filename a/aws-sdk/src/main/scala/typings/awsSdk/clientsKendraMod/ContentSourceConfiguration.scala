package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSourceConfiguration extends StObject {
  
  /**
    * The identifier of the data sources you want to use for your Amazon Kendra experience.
    */
  var DataSourceIds: js.UndefOr[DataSourceIdList] = js.undefined
  
  /**
    *  TRUE to use documents you indexed directly using the BatchPutDocument API.
    */
  var DirectPutContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the FAQs that you want to use for your Amazon Kendra experience.
    */
  var FaqIds: js.UndefOr[FaqIdsList] = js.undefined
}
object ContentSourceConfiguration {
  
  inline def apply(): ContentSourceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentSourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataSourceIds(value: DataSourceIdList): Self = StObject.set(x, "DataSourceIds", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdsUndefined: Self = StObject.set(x, "DataSourceIds", js.undefined)
    
    inline def setDataSourceIdsVarargs(value: DataSourceId*): Self = StObject.set(x, "DataSourceIds", js.Array(value*))
    
    inline def setDirectPutContent(value: Boolean): Self = StObject.set(x, "DirectPutContent", value.asInstanceOf[js.Any])
    
    inline def setDirectPutContentUndefined: Self = StObject.set(x, "DirectPutContent", js.undefined)
    
    inline def setFaqIds(value: FaqIdsList): Self = StObject.set(x, "FaqIds", value.asInstanceOf[js.Any])
    
    inline def setFaqIdsUndefined: Self = StObject.set(x, "FaqIds", js.undefined)
    
    inline def setFaqIdsVarargs(value: FaqId*): Self = StObject.set(x, "FaqIds", js.Array(value*))
  }
}
