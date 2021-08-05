package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /**
    * The data that populates a row in a query result table.
    */
  var Data: js.UndefOr[datumList] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  extension [Self <: Row](x: Self) {
    
    inline def setData(value: datumList): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "Data", js.Array(value :_*))
  }
}
