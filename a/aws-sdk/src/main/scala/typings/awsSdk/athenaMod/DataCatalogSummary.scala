package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogSummary extends StObject {
  
  /**
    * The name of the data catalog.
    */
  var CatalogName: js.UndefOr[CatalogNameString] = js.native
  
  /**
    * The data catalog type.
    */
  var Type: js.UndefOr[DataCatalogType] = js.native
}
object DataCatalogSummary {
  
  @scala.inline
  def apply(): DataCatalogSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCatalogSummary]
  }
  
  @scala.inline
  implicit class DataCatalogSummaryMutableBuilder[Self <: DataCatalogSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogName(value: CatalogNameString): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogNameUndefined: Self = StObject.set(x, "CatalogName", js.undefined)
    
    @scala.inline
    def setType(value: DataCatalogType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
