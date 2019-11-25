package typings.angularDashOdataDashResources.OData

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// IResourceServiceProvider used to configure global settings
trait IResourceServiceProvider extends IServiceProvider {
  var defaults: IResourceOptions
}

object IResourceServiceProvider {
  @scala.inline
  def apply($get: js.Any, defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResourceServiceProvider]
  }
}

