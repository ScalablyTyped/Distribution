package typings
package assertsharpLib.assertsharpMod

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
  def AreEqual[T](expected: T, actual: T): scala.Unit = js.native
  def AreEqual[T](expected: T, actual: T, message: java.lang.String): scala.Unit = js.native
  def AreNotEqual[T](notExpected: T, actual: T): scala.Unit = js.native
  def AreNotEqual[T](notExpected: T, actual: T, message: java.lang.String): scala.Unit = js.native
  def AreNotSame[T](notExpected: T, actual: T): scala.Unit = js.native
  def AreNotSame[T](notExpected: T, actual: T, message: java.lang.String): scala.Unit = js.native
  def AreSequenceEqual[T](expected: js.Array[T], actual: js.Array[T]): scala.Unit = js.native
  def AreSequenceEqual[T](
    expected: js.Array[T],
    actual: js.Array[T],
    equals: js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean]
  ): scala.Unit = js.native
  def AreSequenceEqual[T](
    expected: js.Array[T],
    actual: js.Array[T],
    equals: js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean],
    message: java.lang.String
  ): scala.Unit = js.native
  def Fail(): scala.Unit = js.native
  def Fail(message: java.lang.String): scala.Unit = js.native
  def IsFalse(actual: scala.Boolean): scala.Unit = js.native
  def IsFalse(actual: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def IsInstanceOfType(actual: js.Any, expectedType: js.Function): scala.Unit = js.native
  def IsInstanceOfType(actual: js.Any, expectedType: js.Function, message: java.lang.String): scala.Unit = js.native
  def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function): scala.Unit = js.native
  def IsNotInstanceOfType(actual: js.Any, wrongType: js.Function, message: java.lang.String): scala.Unit = js.native
  def IsNotNull(actual: js.Any): scala.Unit = js.native
  def IsNotNull(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  def IsNull(actual: js.Any): scala.Unit = js.native
  def IsNull(actual: js.Any, message: java.lang.String): scala.Unit = js.native
  def IsTrue(actual: scala.Boolean): scala.Unit = js.native
  def IsTrue(actual: scala.Boolean, message: java.lang.String): scala.Unit = js.native
  def Throws(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def Throws(fn: js.Function0[scala.Unit], message: java.lang.String): scala.Unit = js.native
}

