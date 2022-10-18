package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChefConfiguration extends StObject {
  
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.undefined
}
object ChefConfiguration {
  
  inline def apply(): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChefConfiguration]
  }
  
  extension [Self <: ChefConfiguration](x: Self) {
    
    inline def setBerkshelfVersion(value: String): Self = StObject.set(x, "BerkshelfVersion", value.asInstanceOf[js.Any])
    
    inline def setBerkshelfVersionUndefined: Self = StObject.set(x, "BerkshelfVersion", js.undefined)
    
    inline def setManageBerkshelf(value: Boolean): Self = StObject.set(x, "ManageBerkshelf", value.asInstanceOf[js.Any])
    
    inline def setManageBerkshelfUndefined: Self = StObject.set(x, "ManageBerkshelf", js.undefined)
  }
}
