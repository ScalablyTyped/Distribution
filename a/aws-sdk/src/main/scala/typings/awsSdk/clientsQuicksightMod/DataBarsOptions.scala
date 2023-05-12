package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataBarsOptions extends StObject {
  
  /**
    * The field ID for the data bars options.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The color of the negative data bar.
    */
  var NegativeColor: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The color of the positive data bar.
    */
  var PositiveColor: js.UndefOr[HexColor] = js.undefined
}
object DataBarsOptions {
  
  inline def apply(FieldId: FieldId): DataBarsOptions = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataBarsOptions] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setNegativeColor(value: HexColor): Self = StObject.set(x, "NegativeColor", value.asInstanceOf[js.Any])
    
    inline def setNegativeColorUndefined: Self = StObject.set(x, "NegativeColor", js.undefined)
    
    inline def setPositiveColor(value: HexColor): Self = StObject.set(x, "PositiveColor", value.asInstanceOf[js.Any])
    
    inline def setPositiveColorUndefined: Self = StObject.set(x, "PositiveColor", js.undefined)
  }
}
