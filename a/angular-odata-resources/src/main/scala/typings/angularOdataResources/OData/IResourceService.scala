package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// ResourceService
// see http://docs.angularjs.org/api/ngResource.$resource
// Most part of the following definitions were achieved by analyzing the
// actual implementation, since the documentation doesn't seem to cover
// that deeply.
///////////////////////////////////////////////////////////////////////////
@js.native
trait IResourceService extends StObject {
  
  def apply(url: String): IResourceClass[IResource[js.Any]] = js.native
  def apply(url: String, paramDefaults: js.Any): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: js.Any,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any
  ): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: js.Any,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any,
    options: IResourceOptions
  ): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: js.Any,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: Unit,
    options: IResourceOptions
  ): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: Unit,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any
  ): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: Unit,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any,
    options: IResourceOptions
  ): IResourceClass[IResource[js.Any]] = js.native
  def apply(
    url: String,
    paramDefaults: Unit,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: Unit,
    options: IResourceOptions
  ): IResourceClass[IResource[js.Any]] = js.native
}
