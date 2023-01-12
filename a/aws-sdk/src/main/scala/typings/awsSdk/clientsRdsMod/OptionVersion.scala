package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionVersion extends StObject {
  
  /**
    * True if the version is the default version of the option, and otherwise false.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the option.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object OptionVersion {
  
  inline def apply(): OptionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionVersion] (val x: Self) extends AnyVal {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
