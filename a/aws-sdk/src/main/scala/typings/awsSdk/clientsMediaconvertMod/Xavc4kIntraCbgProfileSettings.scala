package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xavc4kIntraCbgProfileSettings extends StObject {
  
  /**
    * Specify the XAVC Intra 4k (CBG) Class to set the bitrate of your output. Outputs of the same class have similar image quality over the operating points that are valid for that class.
    */
  var XavcClass: js.UndefOr[Xavc4kIntraCbgProfileClass] = js.undefined
}
object Xavc4kIntraCbgProfileSettings {
  
  inline def apply(): Xavc4kIntraCbgProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xavc4kIntraCbgProfileSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xavc4kIntraCbgProfileSettings] (val x: Self) extends AnyVal {
    
    inline def setXavcClass(value: Xavc4kIntraCbgProfileClass): Self = StObject.set(x, "XavcClass", value.asInstanceOf[js.Any])
    
    inline def setXavcClassUndefined: Self = StObject.set(x, "XavcClass", js.undefined)
  }
}
