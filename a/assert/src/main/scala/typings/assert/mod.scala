package typings.assert

import typings.assert.anon.Actual
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("assert", "AssertionError")
  @js.native
  class AssertionError ()
    extends StObject
       with Error {
    def this(options: Actual) = this()
    
    var actual: js.Any = js.native
    
    var expected: js.Any = js.native
    
    var generatedMessage: Boolean = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var operator: String = js.native
  }
  
  /** @deprecated Use `deepStrictEqual` instead */
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def deepStrictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doesNotThrow(block: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doesNotThrow")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated Use `strictEqual` instead */
  @scala.inline
  def equal(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fail(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")().asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: js.Any, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: js.Any, expected: Unit, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: js.Any, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: String, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  @scala.inline
  def fail(actual: Unit, expected: Unit, message: Unit, operator: String): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def ifError(value: js.Any): js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifError")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())*/ Boolean
  ]]
  
  /** @deprecated Use `notDeepStrictEqual` instead */
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notDeepStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @deprecated Use `notStrictEqual` instead */
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notStrictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ok(value: js.Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  @scala.inline
  def ok(value: js.Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
  
  @JSImport("assert", "strict")
  @js.native
  val strict: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ js.Any = js.native
  
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  @scala.inline
  def strictEqual[T](actual: js.Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("strictEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def throws(block: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], error: RegExp, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], error.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def throws(block: js.Function0[Unit], message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(block.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
