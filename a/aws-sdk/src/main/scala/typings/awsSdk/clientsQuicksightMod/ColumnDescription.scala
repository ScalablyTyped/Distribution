package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnDescription extends StObject {
  
  /**
    * The text of a description for a column.
    */
  var Text: js.UndefOr[ColumnDescriptiveText] = js.undefined
}
object ColumnDescription {
  
  inline def apply(): ColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnDescription] (val x: Self) extends AnyVal {
    
    inline def setText(value: ColumnDescriptiveText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
