package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSourceResponse extends StObject {
  
  /**
    * The DataSource object.
    */
  var dataSource: js.UndefOr[DataSource] = js.native
}
object CreateDataSourceResponse {
  
  @scala.inline
  def apply(): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  
  @scala.inline
  implicit class CreateDataSourceResponseMutableBuilder[Self <: CreateDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
  }
}
