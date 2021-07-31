package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends StObject {
  
  @JSName("$delete")
  def $delete(): js.Any = js.native
  @JSName("$delete")
  def $delete(params: js.Object): js.Any = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(success: js.Function): js.Any = js.native
  @JSName("$delete")
  def $delete(success: js.Function, error: js.Function): js.Any = js.native
  
  @JSName("$get")
  def $get(): js.Any = js.native
  @JSName("$get")
  def $get(params: js.Object): js.Any = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(success: js.Function): js.Any = js.native
  @JSName("$get")
  def $get(success: js.Function, error: js.Function): js.Any = js.native
  
  /** the promise of the original server interaction that created this instance. **/
  @JSName("$promise")
  var $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<T> */ js.Any = js.native
  
  @JSName("$query")
  def $query(): js.Any = js.native
  @JSName("$query")
  def $query(params: js.Object): js.Any = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(success: js.Function): js.Any = js.native
  @JSName("$query")
  def $query(success: js.Function, error: js.Function): js.Any = js.native
  
  @JSName("$remove")
  def $remove(): js.Any = js.native
  @JSName("$remove")
  def $remove(params: js.Object): js.Any = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(success: js.Function): js.Any = js.native
  @JSName("$remove")
  def $remove(success: js.Function, error: js.Function): js.Any = js.native
  
  @JSName("$resolved")
  var $resolved: Boolean = js.native
  
  @JSName("$save")
  def $save(): js.Any = js.native
  @JSName("$save")
  def $save(params: js.Object): js.Any = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(success: js.Function): js.Any = js.native
  @JSName("$save")
  def $save(success: js.Function, error: js.Function): js.Any = js.native
  
  @JSName("$update")
  def $update(): js.Any = js.native
  @JSName("$update")
  def $update(params: js.Object): js.Any = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(params: js.Object, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(params: Unit, success: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(params: Unit, success: js.Function, error: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(params: Unit, success: Unit, error: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(success: js.Function): js.Any = js.native
  @JSName("$update")
  def $update(success: js.Function, error: js.Function): js.Any = js.native
}
