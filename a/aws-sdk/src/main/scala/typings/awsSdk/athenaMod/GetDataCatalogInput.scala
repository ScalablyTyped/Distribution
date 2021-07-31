package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataCatalogInput extends StObject {
  
  /**
    * The name of the data catalog to return.
    */
  var Name: CatalogNameString
}
object GetDataCatalogInput {
  
  @scala.inline
  def apply(Name: CatalogNameString): GetDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataCatalogInput]
  }
  
  @scala.inline
  implicit class GetDataCatalogInputMutableBuilder[Self <: GetDataCatalogInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CatalogNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
