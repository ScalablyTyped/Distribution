package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpQueryParameter extends StObject {
  
  /**
    * The query parameter to match on.
    */
  var `match`: js.UndefOr[QueryParameterMatch] = js.undefined
  
  /**
    * A name for the query parameter that will be matched on.
    */
  var name: QueryParameterName
}
object HttpQueryParameter {
  
  inline def apply(name: QueryParameterName): HttpQueryParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpQueryParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpQueryParameter] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: QueryParameterMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: QueryParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
