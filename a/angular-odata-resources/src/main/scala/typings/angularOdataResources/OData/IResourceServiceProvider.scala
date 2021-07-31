package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// IResourceServiceProvider used to configure global settings
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait IResourceServiceProvider extends StObject {
  
  var defaults: IResourceOptions
}
object IResourceServiceProvider {
  
  @scala.inline
  def apply(defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceServiceProvider]
  }
  
  @scala.inline
  implicit class IResourceServiceProviderMutableBuilder[Self <: IResourceServiceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: IResourceOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
  }
}
