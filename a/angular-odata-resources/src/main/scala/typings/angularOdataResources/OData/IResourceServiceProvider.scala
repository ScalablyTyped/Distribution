package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// IResourceServiceProvider used to configure global settings
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ @js.native
trait IResourceServiceProvider extends js.Object {
  var defaults: IResourceOptions = js.native
}

object IResourceServiceProvider {
  @scala.inline
  def apply(defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceServiceProvider]
  }
  @scala.inline
  implicit class IResourceServiceProviderOps[Self <: IResourceServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaults(value: IResourceOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
  
}

