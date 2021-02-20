package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataCatalogOutput extends StObject {
  
  /**
    * The data catalog returned.
    */
  var DataCatalog: js.UndefOr[typings.awsSdk.athenaMod.DataCatalog] = js.native
}
object GetDataCatalogOutput {
  
  @scala.inline
  def apply(): GetDataCatalogOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogOutput]
  }
  
  @scala.inline
  implicit class GetDataCatalogOutputMutableBuilder[Self <: GetDataCatalogOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCatalog(value: DataCatalog): Self = StObject.set(x, "DataCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCatalogUndefined: Self = StObject.set(x, "DataCatalog", js.undefined)
  }
}
