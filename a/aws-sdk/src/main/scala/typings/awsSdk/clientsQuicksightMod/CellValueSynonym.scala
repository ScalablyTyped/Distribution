package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellValueSynonym extends StObject {
  
  /**
    * The cell value.
    */
  var CellValue: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * Other names or aliases for the cell value.
    */
  var Synonyms: js.UndefOr[StringList] = js.undefined
}
object CellValueSynonym {
  
  inline def apply(): CellValueSynonym = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValueSynonym]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellValueSynonym] (val x: Self) extends AnyVal {
    
    inline def setCellValue(value: LimitedString): Self = StObject.set(x, "CellValue", value.asInstanceOf[js.Any])
    
    inline def setCellValueUndefined: Self = StObject.set(x, "CellValue", js.undefined)
    
    inline def setSynonyms(value: StringList): Self = StObject.set(x, "Synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "Synonyms", js.undefined)
    
    inline def setSynonymsVarargs(value: String*): Self = StObject.set(x, "Synonyms", js.Array(value*))
  }
}
