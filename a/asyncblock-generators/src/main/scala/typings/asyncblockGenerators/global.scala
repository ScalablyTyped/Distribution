package typings.asyncblockGenerators

import typings.asyncblockGenerators.ab.ab.Flow
import typings.asyncblockGenerators.ab.ab.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ab {
    
    object ab {
      
      @JSGlobal("_ab.ab")
      @js.native
      def apply[T](run: js.Function0[T]): Result[T] = js.native
      @JSGlobal("_ab.ab")
      @js.native
      def apply[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
      @JSGlobal("_ab.ab")
      @js.native
      def apply[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
      @JSGlobal("_ab.ab")
      @js.native
      def apply[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
      
      @JSGlobal("_ab.ab.enableTransform")
      @js.native
      def enableTransform(module: js.Any): Boolean = js.native
      
      @JSGlobal("_ab.ab.getCurrentFlow")
      @js.native
      def getCurrentFlow(): Flow = js.native
      
      @JSGlobal("_ab.ab.ifError")
      @js.native
      def ifError(callback: js.Function): js.Function = js.native
      
      @JSGlobal("_ab.ab.nostack")
      @js.native
      def nostack[T](run: js.Function0[T]): Result[T] = js.native
      @JSGlobal("_ab.ab.nostack")
      @js.native
      def nostack[T](run: js.Function0[T], done: js.Function): Result[T] = js.native
      @JSGlobal("_ab.ab.nostack")
      @js.native
      def nostack[T](run: js.Function1[/* flow */ Flow, T]): Result[T] = js.native
      @JSGlobal("_ab.ab.nostack")
      @js.native
      def nostack[T](run: js.Function1[/* flow */ Flow, T], done: js.Function): Result[T] = js.native
    }
  }
}
