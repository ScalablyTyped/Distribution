package typings
package angularDashResourceLib.angularDashResourceMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extensions to base ng based on using angular-resource */
trait IModule extends js.Object {
  /** creating a resource service factory */
  def factory(
    name: java.lang.String,
    resourceServiceFactoryFunction: angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs.IResourceServiceFactoryFunction[_]
  ): IModule
}

