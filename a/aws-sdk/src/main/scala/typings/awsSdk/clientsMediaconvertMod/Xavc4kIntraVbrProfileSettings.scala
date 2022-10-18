package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xavc4kIntraVbrProfileSettings extends StObject {
  
  /**
    * Specify the XAVC Intra 4k (VBR) Class to set the bitrate of your output. Outputs of the same class have similar image quality over the operating points that are valid for that class.
    */
  var XavcClass: js.UndefOr[Xavc4kIntraVbrProfileClass] = js.undefined
}
object Xavc4kIntraVbrProfileSettings {
  
  inline def apply(): Xavc4kIntraVbrProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xavc4kIntraVbrProfileSettings]
  }
  
  extension [Self <: Xavc4kIntraVbrProfileSettings](x: Self) {
    
    inline def setXavcClass(value: Xavc4kIntraVbrProfileClass): Self = StObject.set(x, "XavcClass", value.asInstanceOf[js.Any])
    
    inline def setXavcClassUndefined: Self = StObject.set(x, "XavcClass", js.undefined)
  }
}
