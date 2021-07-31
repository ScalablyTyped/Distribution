package typings.assertsharp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assertsharp", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Assert
  /* static members */
  object default {
    
    @JSImport("assertsharp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def AreEqual[T](expected: T, actual: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreEqual[T](expected: T, actual: T, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def AreNotEqual[T](notExpected: T, actual: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreNotEqual")(notExpected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreNotEqual[T](notExpected: T, actual: T, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreNotEqual")(notExpected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def AreNotSame[T](notExpected: T, actual: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreNotSame")(notExpected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreNotSame[T](notExpected: T, actual: T, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreNotSame")(notExpected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreSequenceEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreSequenceEqual[T](
      expected: js.Array[T],
      actual: js.Array[T],
      equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreSequenceEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], equals.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreSequenceEqual[T](
      expected: js.Array[T],
      actual: js.Array[T],
      equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean],
      message: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreSequenceEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], equals.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T], equals: Unit, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("AreSequenceEqual")(expected.asInstanceOf[js.Any], actual.asInstanceOf[js.Any], equals.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Fail(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Fail")().asInstanceOf[Unit]
    @scala.inline
    def Fail(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def IsFalse(actual: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFalse")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def IsFalse(actual: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsFalse")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def IsInstanceOfType(actual: js.Any, expectedType: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInstanceOfType")(actual.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def IsInstanceOfType(actual: js.Any, expectedType: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInstanceOfType")(actual.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotInstanceOfType")(actual.asInstanceOf[js.Any], wrongType.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotInstanceOfType")(actual.asInstanceOf[js.Any], wrongType.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def IsNotNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def IsNotNull(actual: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotNull")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def IsNull(actual: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNull")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def IsNull(actual: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNull")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def IsTrue(actual: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IsTrue")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def IsTrue(actual: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("IsTrue")(actual.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Throws(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Throws")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Throws(fn: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Throws")(fn.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait Assert extends StObject
}
