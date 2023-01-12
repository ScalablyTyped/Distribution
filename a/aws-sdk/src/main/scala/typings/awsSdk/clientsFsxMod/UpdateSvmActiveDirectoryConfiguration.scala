package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSvmActiveDirectoryConfiguration extends StObject {
  
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryConfigurationUpdates] = js.undefined
}
object UpdateSvmActiveDirectoryConfiguration {
  
  inline def apply(): UpdateSvmActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSvmActiveDirectoryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSvmActiveDirectoryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfigurationUpdates): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
  }
}
