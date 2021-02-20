package typings.assert

import typings.assert.anon.Actual
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("assert", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError () extends Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    var operator: String = js.native
  }
  
  /** @deprecated Use `deepStrictEqual` instead */
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "deepEqual")
  @js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "deepStrictEqual")
  @js.native
  def deepStrictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit]): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  @JSImport("assert", "doesNotThrow")
  @js.native
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = js.native
  
  /** @deprecated Use `strictEqual` instead */
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "equal")
  @js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "fail")
  @js.native
  def fail(): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.UndefOr[scala.Nothing],
    message: String,
    operator: String
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.UndefOr[scala.Nothing],
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(
    actual: js.Any,
    expected: js.UndefOr[scala.Nothing],
    message: js.UndefOr[scala.Nothing],
    operator: String
  ): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
  @JSImport("assert", "fail")
  @js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
  
  @JSImport("assert", "ifError")
  @js.native
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = js.native
  
  /** @deprecated Use `notDeepStrictEqual` instead */
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notDeepEqual")
  @js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notDeepStrictEqual")
  @js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  /** @deprecated Use `notStrictEqual` instead */
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notEqual")
  @js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("assert", "notStrictEqual")
  @js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any): /* asserts value */ Boolean = js.native
  @JSImport("assert", "ok")
  @js.native
  def ok(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  
  @JSImport("assert", "strict")
  @js.native
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  @JSImport("assert", "strictEqual")
  @js.native
  def strictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit]): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: RegExp): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], error: RegExp, message: String): Unit = js.native
  @JSImport("assert", "throws")
  @js.native
  def throws(block: js.Function0[Unit], message: String): Unit = js.native
}
