package typings.asyncblockGenerators

import typings.asyncblockGenerators.ab.ab.Flow
import typings.asyncblockGenerators.ab.ab.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](run: js.Function0[T]): Result[T] = ^.asInstanceOf[js.Dynamic].apply(run.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  @scala.inline
  def apply[T](run: js.Function0[T], done: js.Function): Result[T] = (^.asInstanceOf[js.Dynamic].apply(run.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
  @scala.inline
  def apply[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = ^.asInstanceOf[js.Dynamic].apply(run.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  @scala.inline
  def apply[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = (^.asInstanceOf[js.Dynamic].apply(run.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
  
  @JSImport("asyncblock-generators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def enableTransform(module: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enableTransform")(module.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getCurrentFlow(): Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentFlow")().asInstanceOf[Flow]
  
  @scala.inline
  def ifError(callback: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def nostack[T](run: js.Function0[T]): Result[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nostack")(run.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  @scala.inline
  def nostack[T](run: js.Function0[T], done: js.Function): Result[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nostack")(run.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
  @scala.inline
  def nostack[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nostack")(run.asInstanceOf[js.Any]).asInstanceOf[Result[T]]
  @scala.inline
  def nostack[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nostack")(run.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Result[T]]
}
