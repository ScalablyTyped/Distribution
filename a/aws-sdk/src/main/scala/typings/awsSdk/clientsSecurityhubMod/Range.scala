package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * The number of lines (for a line range) or characters (for an offset range) from the beginning of the file to the end of the sensitive data.
    */
  var End: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of lines (for a line range) or characters (for an offset range) from the beginning of the file to the end of the sensitive data.
    */
  var Start: js.UndefOr[Long] = js.undefined
  
  /**
    * In the line where the sensitive data starts, the column within the line where the sensitive data starts.
    */
  var StartColumn: js.UndefOr[Long] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Long): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: Long): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartColumn(value: Long): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    inline def setStartColumnUndefined: Self = StObject.set(x, "StartColumn", js.undefined)
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
