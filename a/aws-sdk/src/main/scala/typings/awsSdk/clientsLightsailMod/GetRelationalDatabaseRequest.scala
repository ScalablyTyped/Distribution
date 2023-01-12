package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of the database that you are looking up.
    */
  var relationalDatabaseName: ResourceName
}
object GetRelationalDatabaseRequest {
  
  inline def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
