package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDatabaseInput extends StObject {
  
  /**
    * The name of the data catalog that contains the database to return.
    */
  var CatalogName: CatalogNameString = js.native
  
  /**
    * The name of the database to return.
    */
  var DatabaseName: NameString = js.native
}
object GetDatabaseInput {
  
  @scala.inline
  def apply(CatalogName: CatalogNameString, DatabaseName: NameString): GetDatabaseInput = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatabaseInput]
  }
  
  @scala.inline
  implicit class GetDatabaseInputMutableBuilder[Self <: GetDatabaseInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogName(value: CatalogNameString): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
