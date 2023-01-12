package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * reports a {@link DataTruncation} warning, on reads, or is thrown as a {@link DataTruncation} exception, on writes, when a data value is unexpectedly
  * truncated.
  *
  * The SQL state for a `DataTruncation` is `01004` .
  */
trait DataTruncation
  extends StObject
     with SQLException {
  
  /**
    * contains the number of bytes of data that should have been transferred. This number may be approximate if data conversions were being performed. The
    * value may be `-1` if the size is unknown.
    */
  var DataSize: Double
  
  /** is `TRUE` if a read was truncated. */
  var DuringRead: Boolean
  
  /** is the index of the parameter or column value. */
  var Index: Double
  
  /** is `TRUE` if a parameter value is truncated. */
  var IsParameter: Boolean
  
  /** contains the number of bytes of data actually transferred. The value may be `-1` if the size is unknown. */
  var TransferSize: Double
}
object DataTruncation {
  
  inline def apply(
    Context: XInterface,
    DataSize: Double,
    DuringRead: Boolean,
    ErrorCode: Double,
    Index: Double,
    IsParameter: Boolean,
    Message: String,
    NextException: Any,
    SQLState: String,
    TransferSize: Double
  ): DataTruncation = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DataSize = DataSize.asInstanceOf[js.Any], DuringRead = DuringRead.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], IsParameter = IsParameter.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any], TransferSize = TransferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTruncation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTruncation] (val x: Self) extends AnyVal {
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
    
    inline def setDuringRead(value: Boolean): Self = StObject.set(x, "DuringRead", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIsParameter(value: Boolean): Self = StObject.set(x, "IsParameter", value.asInstanceOf[js.Any])
    
    inline def setTransferSize(value: Double): Self = StObject.set(x, "TransferSize", value.asInstanceOf[js.Any])
  }
}
