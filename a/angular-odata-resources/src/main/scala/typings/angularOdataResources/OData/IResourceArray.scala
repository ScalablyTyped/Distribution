package typings.angularOdataResources.OData

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Really just a regular Array object with $promise and $resolve attached to it
  */
@js.native
trait IResourceArray[T]
  extends StObject
     with Array[T] {
  
  /** the promise of the original server interaction that created this collection. **/
  @JSName("$promise")
  var $promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<IResourceArray<T>> */ Any = js.native
  
  @JSName("$resolved")
  var $resolved: Boolean = js.native
}
