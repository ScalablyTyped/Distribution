package typings.angularCommon.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.PipeTransform
import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def transform[T](obj: js.UndefOr[scala.Nothing]): js.UndefOr[scala.Nothing] = js.native
  def transform[T](obj: js.Promise[T]): T | Null = js.native
  def transform[T](obj: Null): Null = js.native
  def transform[T](obj: Observable_[T]): T | Null = js.native
}

