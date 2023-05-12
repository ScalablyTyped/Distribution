package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VcfOptions extends StObject {
  
  /**
    * The file's ignore filter field setting.
    */
  var ignoreFilterField: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file's ignore qual field setting.
    */
  var ignoreQualField: js.UndefOr[Boolean] = js.undefined
}
object VcfOptions {
  
  inline def apply(): VcfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VcfOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VcfOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreFilterField(value: Boolean): Self = StObject.set(x, "ignoreFilterField", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFilterFieldUndefined: Self = StObject.set(x, "ignoreFilterField", js.undefined)
    
    inline def setIgnoreQualField(value: Boolean): Self = StObject.set(x, "ignoreQualField", value.asInstanceOf[js.Any])
    
    inline def setIgnoreQualFieldUndefined: Self = StObject.set(x, "ignoreQualField", js.undefined)
  }
}
