package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ResourceService
// see http://docs.angularjs.org/api/ngResource.$resource
// Most part of the following definitions were achieved by analyzing the
// actual implementation, since the documentation doesn't seem to cover
// that deeply.
///////////////////////////////////////////////////////////////////////////
@js.native
trait IResourceService extends js.Object {
  def apply(url: java.lang.String): IResourceClass[IResource[_]] = js.native
  def apply(url: java.lang.String, paramDefaults: js.Any): IResourceClass[IResource[_]] = js.native
  def apply(
    url: java.lang.String,
    paramDefaults: js.Any,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any
  ): IResourceClass[IResource[_]] = js.native
  def apply(
    url: java.lang.String,
    paramDefaults: js.Any,
    /** example:  {update: { method: 'PUT' }, delete: deleteDescriptor }
    where deleteDescriptor : IActionDescriptor */
  actions: js.Any,
    options: IResourceOptions
  ): IResourceClass[IResource[_]] = js.native
}

