package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TtmlDestinationSettings extends StObject {
  
  /**
    * This field is not currently supported and will not affect the output styling. Leave the default value.
    */
  var StyleControl: js.UndefOr[TtmlDestinationStyleControl] = js.undefined
}
object TtmlDestinationSettings {
  
  inline def apply(): TtmlDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TtmlDestinationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TtmlDestinationSettings] (val x: Self) extends AnyVal {
    
    inline def setStyleControl(value: TtmlDestinationStyleControl): Self = StObject.set(x, "StyleControl", value.asInstanceOf[js.Any])
    
    inline def setStyleControlUndefined: Self = StObject.set(x, "StyleControl", js.undefined)
  }
}
