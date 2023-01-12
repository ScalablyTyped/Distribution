package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRuntimeStatisticsRows extends StObject {
  
  /**
    * The number of bytes read to execute the query.
    */
  var InputBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows read to execute the query.
    */
  var InputRows: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of bytes returned by the query.
    */
  var OutputBytes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows returned by the query.
    */
  var OutputRows: js.UndefOr[Long] = js.undefined
}
object QueryRuntimeStatisticsRows {
  
  inline def apply(): QueryRuntimeStatisticsRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRuntimeStatisticsRows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRuntimeStatisticsRows] (val x: Self) extends AnyVal {
    
    inline def setInputBytes(value: Long): Self = StObject.set(x, "InputBytes", value.asInstanceOf[js.Any])
    
    inline def setInputBytesUndefined: Self = StObject.set(x, "InputBytes", js.undefined)
    
    inline def setInputRows(value: Long): Self = StObject.set(x, "InputRows", value.asInstanceOf[js.Any])
    
    inline def setInputRowsUndefined: Self = StObject.set(x, "InputRows", js.undefined)
    
    inline def setOutputBytes(value: Long): Self = StObject.set(x, "OutputBytes", value.asInstanceOf[js.Any])
    
    inline def setOutputBytesUndefined: Self = StObject.set(x, "OutputBytes", js.undefined)
    
    inline def setOutputRows(value: Long): Self = StObject.set(x, "OutputRows", value.asInstanceOf[js.Any])
    
    inline def setOutputRowsUndefined: Self = StObject.set(x, "OutputRows", js.undefined)
  }
}
