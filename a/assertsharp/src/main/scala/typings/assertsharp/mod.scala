package typings.assertsharp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assertsharp", JSImport.Default)
  @js.native
  class default () extends Assert
  /* static members */
  object default {
    
    @JSImport("assertsharp", "default.AreEqual")
    @js.native
    def AreEqual[T](expected: T, actual: T): Unit = js.native
    @JSImport("assertsharp", "default.AreEqual")
    @js.native
    def AreEqual[T](expected: T, actual: T, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.AreNotEqual")
    @js.native
    def AreNotEqual[T](notExpected: T, actual: T): Unit = js.native
    @JSImport("assertsharp", "default.AreNotEqual")
    @js.native
    def AreNotEqual[T](notExpected: T, actual: T, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.AreNotSame")
    @js.native
    def AreNotSame[T](notExpected: T, actual: T): Unit = js.native
    @JSImport("assertsharp", "default.AreNotSame")
    @js.native
    def AreNotSame[T](notExpected: T, actual: T, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.AreSequenceEqual")
    @js.native
    def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T]): Unit = js.native
    @JSImport("assertsharp", "default.AreSequenceEqual")
    @js.native
    def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T], equals: js.UndefOr[scala.Nothing], message: String): Unit = js.native
    @JSImport("assertsharp", "default.AreSequenceEqual")
    @js.native
    def AreSequenceEqual[T](
      expected: js.Array[T],
      actual: js.Array[T],
      equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
    ): Unit = js.native
    @JSImport("assertsharp", "default.AreSequenceEqual")
    @js.native
    def AreSequenceEqual[T](
      expected: js.Array[T],
      actual: js.Array[T],
      equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean],
      message: String
    ): Unit = js.native
    
    @JSImport("assertsharp", "default.Fail")
    @js.native
    def Fail(): Unit = js.native
    @JSImport("assertsharp", "default.Fail")
    @js.native
    def Fail(message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsFalse")
    @js.native
    def IsFalse(actual: Boolean): Unit = js.native
    @JSImport("assertsharp", "default.IsFalse")
    @js.native
    def IsFalse(actual: Boolean, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsInstanceOfType")
    @js.native
    def IsInstanceOfType(actual: js.Any, expectedType: js.Function): Unit = js.native
    @JSImport("assertsharp", "default.IsInstanceOfType")
    @js.native
    def IsInstanceOfType(actual: js.Any, expectedType: js.Function, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsNotInstanceOfType")
    @js.native
    def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function): Unit = js.native
    @JSImport("assertsharp", "default.IsNotInstanceOfType")
    @js.native
    def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsNotNull")
    @js.native
    def IsNotNull(actual: js.Any): Unit = js.native
    @JSImport("assertsharp", "default.IsNotNull")
    @js.native
    def IsNotNull(actual: js.Any, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsNull")
    @js.native
    def IsNull(actual: js.Any): Unit = js.native
    @JSImport("assertsharp", "default.IsNull")
    @js.native
    def IsNull(actual: js.Any, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.IsTrue")
    @js.native
    def IsTrue(actual: Boolean): Unit = js.native
    @JSImport("assertsharp", "default.IsTrue")
    @js.native
    def IsTrue(actual: Boolean, message: String): Unit = js.native
    
    @JSImport("assertsharp", "default.Throws")
    @js.native
    def Throws(fn: js.Function0[Unit]): Unit = js.native
    @JSImport("assertsharp", "default.Throws")
    @js.native
    def Throws(fn: js.Function0[Unit], message: String): Unit = js.native
  }
  
  @js.native
  trait Assert extends StObject
}
