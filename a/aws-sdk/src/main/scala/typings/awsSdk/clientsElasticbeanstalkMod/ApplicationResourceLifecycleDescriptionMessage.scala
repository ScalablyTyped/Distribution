package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationResourceLifecycleDescriptionMessage extends StObject {
  
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
}
object ApplicationResourceLifecycleDescriptionMessage {
  
  inline def apply(): ApplicationResourceLifecycleDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationResourceLifecycleDescriptionMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    inline def setResourceLifecycleConfig(value: ApplicationResourceLifecycleConfig): Self = StObject.set(x, "ResourceLifecycleConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceLifecycleConfigUndefined: Self = StObject.set(x, "ResourceLifecycleConfig", js.undefined)
  }
}
