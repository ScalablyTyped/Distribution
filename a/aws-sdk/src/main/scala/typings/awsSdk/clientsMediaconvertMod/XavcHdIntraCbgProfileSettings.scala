package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XavcHdIntraCbgProfileSettings extends StObject {
  
  /**
    * Specify the XAVC Intra HD (CBG) Class to set the bitrate of your output. Outputs of the same class have similar image quality over the operating points that are valid for that class.
    */
  var XavcClass: js.UndefOr[XavcHdIntraCbgProfileClass] = js.undefined
}
object XavcHdIntraCbgProfileSettings {
  
  inline def apply(): XavcHdIntraCbgProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XavcHdIntraCbgProfileSettings]
  }
  
  extension [Self <: XavcHdIntraCbgProfileSettings](x: Self) {
    
    inline def setXavcClass(value: XavcHdIntraCbgProfileClass): Self = StObject.set(x, "XavcClass", value.asInstanceOf[js.Any])
    
    inline def setXavcClassUndefined: Self = StObject.set(x, "XavcClass", js.undefined)
  }
}
