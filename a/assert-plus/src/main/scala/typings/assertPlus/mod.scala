package typings.assertPlus

import typings.node.Buffer
import typings.node.streamMod.Stream
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert-plus", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def AssertionError(options: js.Any): Unit = js.native
  def AssertionError(options: js.Any, message: String): Unit = js.native
  def array(arr: js.Array[_]): Unit = js.native
  def array(arr: js.Array[_], message: String): Unit = js.native
  def arrayOfArray(arr: js.Array[js.Array[_]]): Unit = js.native
  def arrayOfArray(arr: js.Array[js.Array[_]], message: String): Unit = js.native
  def arrayOfBool(arr: js.Array[Boolean]): Unit = js.native
  def arrayOfBool(arr: js.Array[Boolean], message: String): Unit = js.native
  def arrayOfBuffer(arr: js.Array[Buffer]): Unit = js.native
  def arrayOfBuffer(arr: js.Array[Buffer], message: String): Unit = js.native
  def arrayOfDate(arr: js.Array[Date]): Unit = js.native
  def arrayOfDate(arr: js.Array[Date], message: String): Unit = js.native
  def arrayOfFinite(arr: js.Array[Double]): Unit = js.native
  def arrayOfFinite(arr: js.Array[Double], message: String): Unit = js.native
  def arrayOfFunc(arr: js.Array[_]): Unit = js.native
  def arrayOfFunc(arr: js.Array[_], message: String): Unit = js.native
  def arrayOfNumber(arr: js.Array[Double]): Unit = js.native
  def arrayOfNumber(arr: js.Array[Double], message: String): Unit = js.native
  def arrayOfObject(arr: js.Array[_]): Unit = js.native
  def arrayOfObject(arr: js.Array[_], message: String): Unit = js.native
  def arrayOfRegexp(arr: js.Array[RegExp]): Unit = js.native
  def arrayOfRegexp(arr: js.Array[RegExp], message: String): Unit = js.native
  def arrayOfStream(arr: js.Array[Stream]): Unit = js.native
  def arrayOfStream(arr: js.Array[Stream], message: String): Unit = js.native
  def arrayOfString(arr: js.Array[String]): Unit = js.native
  def arrayOfString(arr: js.Array[String], message: String): Unit = js.native
  def arrayOfUuid(arr: js.Array[String]): Unit = js.native
  def arrayOfUuid(arr: js.Array[String], message: String): Unit = js.native
  def bool(bool: Boolean): Unit = js.native
  def bool(bool: Boolean, message: String): Unit = js.native
  def buffer(buffer: Buffer): Unit = js.native
  def buffer(buffer: Buffer, message: String): Unit = js.native
  def date(date: Date): Unit = js.native
  def date(date: Date, message: String): Unit = js.native
  def deepEqual[T](actual: T, expected: T): Unit = js.native
  def deepEqual[T](actual: T, expected: T, message: String): Unit = js.native
  def doesNotThrow(block: js.Any): Unit = js.native
  def doesNotThrow(block: js.Any, error: js.Any): Unit = js.native
  def doesNotThrow(block: js.Any, error: js.Any, message: String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: js.Any, operator: js.Any): Unit = js.native
  def finite(finite: Double): Unit = js.native
  def finite(finite: Double, message: String): Unit = js.native
  def func(func: js.Any): Unit = js.native
  def func(func: js.Any, message: String): Unit = js.native
  def ifError(value: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def number(number: Double): Unit = js.native
  def number(number: Double, message: String): Unit = js.native
  def `object`(obj: js.Any): Unit = js.native
  def `object`(obj: js.Any, message: String): Unit = js.native
  def ok(options: js.Any): Unit = js.native
  def ok(options: js.Any, message: String): Unit = js.native
  def optionalArray(): Unit = js.native
  def optionalArray(arr: js.Array[_]): Unit = js.native
  def optionalArray(arr: js.Array[_], message: String): Unit = js.native
  def optionalArrayOfArray(): Unit = js.native
  def optionalArrayOfArray(arr: js.Array[js.Array[_]]): Unit = js.native
  def optionalArrayOfArray(arr: js.Array[js.Array[_]], message: String): Unit = js.native
  def optionalArrayOfBool(): Unit = js.native
  def optionalArrayOfBool(arr: js.Array[Boolean]): Unit = js.native
  def optionalArrayOfBool(arr: js.Array[Boolean], message: String): Unit = js.native
  def optionalArrayOfBuffer(): Unit = js.native
  def optionalArrayOfBuffer(arr: js.Array[Buffer]): Unit = js.native
  def optionalArrayOfBuffer(arr: js.Array[Buffer], message: String): Unit = js.native
  def optionalArrayOfDate(): Unit = js.native
  def optionalArrayOfDate(arr: js.Array[Date]): Unit = js.native
  def optionalArrayOfDate(arr: js.Array[Date], message: String): Unit = js.native
  def optionalArrayOfFinite(): Unit = js.native
  def optionalArrayOfFinite(arr: js.Array[Double]): Unit = js.native
  def optionalArrayOfFinite(arr: js.Array[Double], message: String): Unit = js.native
  def optionalArrayOfFunc(): Unit = js.native
  def optionalArrayOfFunc(arr: js.Array[_]): Unit = js.native
  def optionalArrayOfFunc(arr: js.Array[_], message: String): Unit = js.native
  def optionalArrayOfNumber(): Unit = js.native
  def optionalArrayOfNumber(arr: js.Array[Double]): Unit = js.native
  def optionalArrayOfNumber(arr: js.Array[Double], message: String): Unit = js.native
  def optionalArrayOfObject(): Unit = js.native
  def optionalArrayOfObject(arr: js.Array[_]): Unit = js.native
  def optionalArrayOfObject(arr: js.Array[_], message: String): Unit = js.native
  def optionalArrayOfRegexp(): Unit = js.native
  def optionalArrayOfRegexp(arr: js.Array[RegExp]): Unit = js.native
  def optionalArrayOfRegexp(arr: js.Array[RegExp], message: String): Unit = js.native
  def optionalArrayOfStream(): Unit = js.native
  def optionalArrayOfStream(arr: js.Array[Stream]): Unit = js.native
  def optionalArrayOfStream(arr: js.Array[Stream], message: String): Unit = js.native
  def optionalArrayOfString(): Unit = js.native
  def optionalArrayOfString(arr: js.Array[String]): Unit = js.native
  def optionalArrayOfString(arr: js.Array[String], message: String): Unit = js.native
  def optionalArrayOfUuid(): Unit = js.native
  def optionalArrayOfUuid(arr: js.Array[String]): Unit = js.native
  def optionalArrayOfUuid(arr: js.Array[String], message: String): Unit = js.native
  def optionalBool(): Unit = js.native
  def optionalBool(bool: Boolean): Unit = js.native
  def optionalBool(bool: Boolean, message: String): Unit = js.native
  def optionalBuffer(): Unit = js.native
  def optionalBuffer(buffer: Buffer): Unit = js.native
  def optionalBuffer(buffer: Buffer, message: String): Unit = js.native
  def optionalDate(): Unit = js.native
  def optionalDate(options: Date): Unit = js.native
  def optionalDate(options: Date, message: String): Unit = js.native
  def optionalFinite(): Unit = js.native
  def optionalFinite(options: Double): Unit = js.native
  def optionalFinite(options: Double, message: String): Unit = js.native
  def optionalFunc(options: js.Any): Unit = js.native
  def optionalFunc(options: js.Any, message: String): Unit = js.native
  def optionalNumber(): Unit = js.native
  def optionalNumber(options: Double): Unit = js.native
  def optionalNumber(options: Double, message: String): Unit = js.native
  def optionalObject(options: js.Any): Unit = js.native
  def optionalObject(options: js.Any, message: String): Unit = js.native
  def optionalRegexp(): Unit = js.native
  def optionalRegexp(options: RegExp): Unit = js.native
  def optionalRegexp(options: RegExp, message: String): Unit = js.native
  def optionalStream(): Unit = js.native
  def optionalStream(options: Stream): Unit = js.native
  def optionalStream(options: Stream, message: String): Unit = js.native
  def optionalString(): Unit = js.native
  def optionalString(options: String): Unit = js.native
  def optionalString(options: String, message: String): Unit = js.native
  def optionalUuid(): Unit = js.native
  def optionalUuid(options: String): Unit = js.native
  def optionalUuid(options: String, message: String): Unit = js.native
  def regexp(regexp: RegExp): Unit = js.native
  def regexp(regexp: RegExp, message: String): Unit = js.native
  def stream(stream: Stream): Unit = js.native
  def stream(stream: Stream, message: String): Unit = js.native
  def strictEqual[T](actual: T, expected: T): Unit = js.native
  def strictEqual[T](actual: T, expected: T, message: String): Unit = js.native
  def string(str: String): Unit = js.native
  def string(str: String, message: String): Unit = js.native
  def throws(block: js.Any): Unit = js.native
  def throws(block: js.Any, error: js.Any): Unit = js.native
  def throws(block: js.Any, error: js.Any, message: String): Unit = js.native
  def uuid(uuid: String): Unit = js.native
  def uuid(uuid: String, message: String): Unit = js.native
}

