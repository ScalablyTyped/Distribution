package typings.angularDashOdataDashResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** when creating a resource factory via IModule.factory */
@js.native
trait IResourceServiceFactoryFunction[T] extends js.Object {
  def apply($resource: IResourceService): IResourceClass[T] = js.native
}

