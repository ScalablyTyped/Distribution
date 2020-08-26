package typings.assertsharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assertsharp", JSImport.Default)
@js.native
class default () extends Assert

/* static members */
@JSImport("assertsharp", JSImport.Default)
@js.native
object default extends js.Object {
  def AreEqual[T](expected: T, actual: T): Unit = js.native
  def AreEqual[T](expected: T, actual: T, message: String): Unit = js.native
  def AreNotEqual[T](notExpected: T, actual: T): Unit = js.native
  def AreNotEqual[T](notExpected: T, actual: T, message: String): Unit = js.native
  def AreNotSame[T](notExpected: T, actual: T): Unit = js.native
  def AreNotSame[T](notExpected: T, actual: T, message: String): Unit = js.native
  def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T]): Unit = js.native
  def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T], equals: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def AreSequenceEqual[T](
    expected: js.Array[T],
    actual: js.Array[T],
    equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
  ): Unit = js.native
  def AreSequenceEqual[T](
    expected: js.Array[T],
    actual: js.Array[T],
    equals: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean],
    message: String
  ): Unit = js.native
  def Fail(): Unit = js.native
  def Fail(message: String): Unit = js.native
  def IsFalse(actual: Boolean): Unit = js.native
  def IsFalse(actual: Boolean, message: String): Unit = js.native
  def IsInstanceOfType(actual: js.Any, expectedType: js.Function): Unit = js.native
  def IsInstanceOfType(actual: js.Any, expectedType: js.Function, message: String): Unit = js.native
  def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function): Unit = js.native
  def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function, message: String): Unit = js.native
  def IsNotNull(actual: js.Any): Unit = js.native
  def IsNotNull(actual: js.Any, message: String): Unit = js.native
  def IsNull(actual: js.Any): Unit = js.native
  def IsNull(actual: js.Any, message: String): Unit = js.native
  def IsTrue(actual: Boolean): Unit = js.native
  def IsTrue(actual: Boolean, message: String): Unit = js.native
  def Throws(fn: js.Function0[Unit]): Unit = js.native
  def Throws(fn: js.Function0[Unit], message: String): Unit = js.native
}

