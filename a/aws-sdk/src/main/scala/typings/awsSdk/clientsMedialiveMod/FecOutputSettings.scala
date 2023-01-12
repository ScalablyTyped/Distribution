package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FecOutputSettings extends StObject {
  
  /**
    * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.  The number of transport stream packets per column error correction packet. Must be between 4 and 20, inclusive.
    */
  var ColumnDepth: js.UndefOr[integerMin4Max20] = js.undefined
  
  /**
    * Enables column only or column and row based FEC
    */
  var IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.undefined
  
  /**
    * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.  Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values increase robustness.  If Row FEC is used, then this is the number of transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
    */
  var RowLength: js.UndefOr[integerMin1Max20] = js.undefined
}
object FecOutputSettings {
  
  inline def apply(): FecOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FecOutputSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FecOutputSettings] (val x: Self) extends AnyVal {
    
    inline def setColumnDepth(value: integerMin4Max20): Self = StObject.set(x, "ColumnDepth", value.asInstanceOf[js.Any])
    
    inline def setColumnDepthUndefined: Self = StObject.set(x, "ColumnDepth", js.undefined)
    
    inline def setIncludeFec(value: FecOutputIncludeFec): Self = StObject.set(x, "IncludeFec", value.asInstanceOf[js.Any])
    
    inline def setIncludeFecUndefined: Self = StObject.set(x, "IncludeFec", js.undefined)
    
    inline def setRowLength(value: integerMin1Max20): Self = StObject.set(x, "RowLength", value.asInstanceOf[js.Any])
    
    inline def setRowLengthUndefined: Self = StObject.set(x, "RowLength", js.undefined)
  }
}
