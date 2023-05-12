package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CascadingControlSource extends StObject {
  
  /**
    * The column identifier that determines which column to look up for the source sheet control.
    */
  var ColumnToMatch: js.UndefOr[ColumnIdentifier] = js.undefined
  
  /**
    * The source sheet control ID of a CascadingControlSource.
    */
  var SourceSheetControlId: js.UndefOr[String] = js.undefined
}
object CascadingControlSource {
  
  inline def apply(): CascadingControlSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascadingControlSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CascadingControlSource] (val x: Self) extends AnyVal {
    
    inline def setColumnToMatch(value: ColumnIdentifier): Self = StObject.set(x, "ColumnToMatch", value.asInstanceOf[js.Any])
    
    inline def setColumnToMatchUndefined: Self = StObject.set(x, "ColumnToMatch", js.undefined)
    
    inline def setSourceSheetControlId(value: String): Self = StObject.set(x, "SourceSheetControlId", value.asInstanceOf[js.Any])
    
    inline def setSourceSheetControlIdUndefined: Self = StObject.set(x, "SourceSheetControlId", js.undefined)
  }
}
