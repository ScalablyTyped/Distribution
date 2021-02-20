package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDataCatalogInput extends StObject {
  
  /**
    * The name of the data catalog to delete.
    */
  var Name: CatalogNameString = js.native
}
object DeleteDataCatalogInput {
  
  @scala.inline
  def apply(Name: CatalogNameString): DeleteDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataCatalogInput]
  }
  
  @scala.inline
  implicit class DeleteDataCatalogInputMutableBuilder[Self <: DeleteDataCatalogInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CatalogNameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
