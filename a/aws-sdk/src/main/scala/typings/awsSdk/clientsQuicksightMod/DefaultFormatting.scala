package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFormatting extends StObject {
  
  /**
    * The display format. Valid values for this structure are AUTO, PERCENT, CURRENCY, NUMBER, DATE, and STRING.
    */
  var DisplayFormat: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DisplayFormat] = js.undefined
  
  /**
    * The additional options for display formatting.
    */
  var DisplayFormatOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DisplayFormatOptions] = js.undefined
}
object DefaultFormatting {
  
  inline def apply(): DefaultFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultFormatting] (val x: Self) extends AnyVal {
    
    inline def setDisplayFormat(value: DisplayFormat): Self = StObject.set(x, "DisplayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatOptions(value: DisplayFormatOptions): Self = StObject.set(x, "DisplayFormatOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatOptionsUndefined: Self = StObject.set(x, "DisplayFormatOptions", js.undefined)
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "DisplayFormat", js.undefined)
  }
}
