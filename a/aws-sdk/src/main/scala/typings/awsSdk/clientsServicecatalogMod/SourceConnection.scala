package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConnection extends StObject {
  
  /**
    * The connection details based on the connection Type. 
    */
  var ConnectionParameters: SourceConnectionParameters
  
  /**
    * The only supported SourceConnection type is Codestar. 
    */
  var Type: js.UndefOr[SourceType] = js.undefined
}
object SourceConnection {
  
  inline def apply(ConnectionParameters: SourceConnectionParameters): SourceConnection = {
    val __obj = js.Dynamic.literal(ConnectionParameters = ConnectionParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceConnection] (val x: Self) extends AnyVal {
    
    inline def setConnectionParameters(value: SourceConnectionParameters): Self = StObject.set(x, "ConnectionParameters", value.asInstanceOf[js.Any])
    
    inline def setType(value: SourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
