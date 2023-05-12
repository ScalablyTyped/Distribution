package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRegistryConfiguration extends StObject {
  
  /**
    *  Includes the definition of a tagQuery. 
    */
  var tagQueryConfiguration: js.UndefOr[TagQueryConfiguration] = js.undefined
}
object AppRegistryConfiguration {
  
  inline def apply(): AppRegistryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRegistryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppRegistryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTagQueryConfiguration(value: TagQueryConfiguration): Self = StObject.set(x, "tagQueryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTagQueryConfigurationUndefined: Self = StObject.set(x, "tagQueryConfiguration", js.undefined)
  }
}
