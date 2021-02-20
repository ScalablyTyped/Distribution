package typings.angularCommon.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.PipeTransform
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "AsyncPipe")
@js.native
class AsyncPipe protected ()
  extends OnDestroy
     with PipeTransform {
  def this(_ref: ChangeDetectorRef) = this()
  
  var _dispose: js.Any = js.native
  
  var _latestValue: js.Any = js.native
  
  var _obj: js.Any = js.native
  
  var _ref: js.Any = js.native
  
  var _selectStrategy: js.Any = js.native
  
  var _strategy: js.Any = js.native
  
  var _subscribe: js.Any = js.native
  
  var _subscription: js.Any = js.native
  
  var _updateLatestValue: js.Any = js.native
  
  def transform[T](): T | Null = js.native
  def transform[T](obj: js.Promise[T]): T | Null = js.native
  def transform[T](obj: Observable_[T]): T | Null = js.native
  @JSName("transform")
  def transform_T_Null[T](): Null = js.native
}
