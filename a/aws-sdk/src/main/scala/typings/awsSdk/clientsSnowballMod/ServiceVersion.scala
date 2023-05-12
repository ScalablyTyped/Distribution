package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceVersion extends StObject {
  
  /**
    * The version number of the requested service.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object ServiceVersion {
  
  inline def apply(): ServiceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceVersion] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
