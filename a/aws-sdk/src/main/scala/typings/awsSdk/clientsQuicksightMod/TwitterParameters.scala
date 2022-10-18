package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitterParameters extends StObject {
  
  /**
    * Maximum number of rows to query Twitter.
    */
  var MaxRows: PositiveInteger
  
  /**
    * Twitter query string.
    */
  var Query: typings.awsSdk.clientsQuicksightMod.Query
}
object TwitterParameters {
  
  inline def apply(MaxRows: PositiveInteger, Query: Query): TwitterParameters = {
    val __obj = js.Dynamic.literal(MaxRows = MaxRows.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterParameters]
  }
  
  extension [Self <: TwitterParameters](x: Self) {
    
    inline def setMaxRows(value: PositiveInteger): Self = StObject.set(x, "MaxRows", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
  }
}
