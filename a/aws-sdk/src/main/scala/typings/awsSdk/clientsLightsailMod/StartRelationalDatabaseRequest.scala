package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of your database to start.
    */
  var relationalDatabaseName: ResourceName
}
object StartRelationalDatabaseRequest {
  
  inline def apply(relationalDatabaseName: ResourceName): StartRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
