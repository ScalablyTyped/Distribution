package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// IResourceServiceProvider used to configure global settings
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ trait IResourceServiceProvider extends js.Object {
  var defaults: IResourceOptions
}

object IResourceServiceProvider {
  @scala.inline
  def apply(defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResourceServiceProvider]
  }
}

