package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// IResourceServiceProvider used to configure global settings
trait IResourceServiceProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  var defaults: IResourceOptions
}

object IResourceServiceProvider {
  @scala.inline
  def apply($get: js.Any, defaults: IResourceOptions): IResourceServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get, defaults = defaults)
  
    __obj.asInstanceOf[IResourceServiceProvider]
  }
}

