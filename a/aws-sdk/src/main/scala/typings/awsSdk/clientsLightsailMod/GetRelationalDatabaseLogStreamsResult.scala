package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseLogStreamsResult extends StObject {
  
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.undefined
}
object GetRelationalDatabaseLogStreamsResult {
  
  inline def apply(): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
  
  extension [Self <: GetRelationalDatabaseLogStreamsResult](x: Self) {
    
    inline def setLogStreams(value: StringList): Self = StObject.set(x, "logStreams", value.asInstanceOf[js.Any])
    
    inline def setLogStreamsUndefined: Self = StObject.set(x, "logStreams", js.undefined)
    
    inline def setLogStreamsVarargs(value: String*): Self = StObject.set(x, "logStreams", js.Array(value*))
  }
}
