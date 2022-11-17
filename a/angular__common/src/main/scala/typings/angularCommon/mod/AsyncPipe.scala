package typings.angularCommon.mod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.PipeTransform
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵPipeDeclaration
import typings.rxjs.distTypesInternalTypesMod.Subscribable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "AsyncPipe")
@js.native
open class AsyncPipe protected ()
  extends StObject
     with OnDestroy
     with PipeTransform {
  def this(ref: ChangeDetectorRef) = this()
  
  /* private */ var _dispose: Any = js.native
  
  /* private */ var _latestValue: Any = js.native
  
  /* private */ var _obj: Any = js.native
  
  /* private */ var _ref: Any = js.native
  
  /* private */ var _selectStrategy: Any = js.native
  
  /* private */ var _strategy: Any = js.native
  
  /* private */ var _subscribe: Any = js.native
  
  /* private */ var _subscription: Any = js.native
  
  /* private */ var _updateLatestValue: Any = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /* CompleteClass */
  override def transform(value: Any, args: Any*): Any = js.native
  def transform[T](): T | Null = js.native
  def transform[T](obj: js.Promise[T]): T | Null = js.native
  def transform[T](obj: Subscribable[T]): T | Null = js.native
  def transform[T](obj: Observable_[T]): T | Null = js.native
  @JSName("transform")
  def transform_T_Null[T](): Null = js.native
}
/* static members */
object AsyncPipe {
  
  @JSImport("@angular/common", "AsyncPipe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "AsyncPipe.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[AsyncPipe, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[AsyncPipe, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "AsyncPipe.\u0275pipe")
  @js.native
  def ɵpipe: ɵɵPipeDeclaration[AsyncPipe, "async", true] = js.native
  inline def ɵpipe_=(x: ɵɵPipeDeclaration[AsyncPipe, "async", true]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275pipe")(x.asInstanceOf[js.Any])
}
