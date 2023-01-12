package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformApplication extends StObject {
  
  /**
    * Attributes for platform application object.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  
  /**
    * PlatformApplicationArn for platform application object.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.undefined
}
object PlatformApplication {
  
  inline def apply(): PlatformApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformApplication] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformApplicationArnUndefined: Self = StObject.set(x, "PlatformApplicationArn", js.undefined)
  }
}
