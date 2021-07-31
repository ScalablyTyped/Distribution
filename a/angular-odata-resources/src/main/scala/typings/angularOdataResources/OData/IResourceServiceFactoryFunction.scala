package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** when creating a resource factory via IModule.factory */
@js.native
trait IResourceServiceFactoryFunction[T] extends StObject {
  
  def apply($resource: IResourceService): IResourceClass[T] = js.native
}
