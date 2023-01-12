package typings.assert

import typings.assert.assertStrings.deepEqual
import typings.assert.assertStrings.deepStrictEqual
import typings.assert.assertStrings.equal
import typings.assert.assertStrings.ifError
import typings.assert.assertStrings.notDeepEqual
import typings.assert.assertStrings.notEqual
import typings.assert.assertStrings.ok
import typings.assert.assertStrings.strict
import typings.assert.assertStrings.strictEqual
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    /** The `actual` property on the error instance. */
    var actual: js.UndefOr[Any] = js.undefined
    
    /** The `expected` property on the error instance. */
    var expected: js.UndefOr[Any] = js.undefined
    
    /** If provided, the error message is set to this value. */
    var message: js.UndefOr[String] = js.undefined
    
    /** The `operator` property on the error instance. */
    var operator: js.UndefOr[String] = js.undefined
    
    /** If provided, the generated stack trace omits frames before this function. */
    // tslint:disable-next-line:ban-types
    var stackStartFn: js.UndefOr[js.Function] = js.undefined
  }
  object Actual {
    
    inline def apply(): Actual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actual]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setExpected(value: Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setStackStartFn(value: js.Function): Self = StObject.set(x, "stackStartFn", value.asInstanceOf[js.Any])
      
      inline def setStackStartFnUndefined: Self = StObject.set(x, "stackStartFn", js.undefined)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(value: Any): /* asserts value */ Boolean = js.native
    def apply(value: Any, message: String): /* asserts value */ Boolean = js.native
    def apply(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
  }
  
  @js.native
  trait DeepEqual extends StObject {
    
    def apply(value: Any): /* asserts value */ Boolean = js.native
    def apply(value: Any, message: String): /* asserts value */ Boolean = js.native
    def apply(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
    
    def deepEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def deepEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def deepEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    @JSName("deepEqual")
    var deepEqual_Original: FnCall = js.native
    
    def deepStrictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def deepStrictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def deepStrictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    @JSName("deepStrictEqual")
    var deepStrictEqual_Original: FnCall = js.native
    
    def equal[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def equal[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def equal[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    @JSName("equal")
    var equal_Original: FnCall = js.native
    
    def ifError(value: Any): /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
    @JSName("ifError")
    var ifError_Original: js.Function1[
        /* value */ Any, 
        /* asserts value is TsTypeUnion(IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray()), TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean
      ] = js.native
    
    def notDeepEqual(actual: Any, expected: Any): Unit = js.native
    def notDeepEqual(actual: Any, expected: Any, message: String): Unit = js.native
    def notDeepEqual(actual: Any, expected: Any, message: js.Error): Unit = js.native
    @JSName("notDeepEqual")
    var notDeepEqual_Original: js.Function3[
        /* actual */ Any, 
        /* expected */ Any, 
        /* message */ js.UndefOr[String | js.Error], 
        Unit
      ] = js.native
    
    def notEqual(actual: Any, expected: Any): Unit = js.native
    def notEqual(actual: Any, expected: Any, message: String): Unit = js.native
    def notEqual(actual: Any, expected: Any, message: js.Error): Unit = js.native
    @JSName("notEqual")
    var notEqual_Original: js.Function3[
        /* actual */ Any, 
        /* expected */ Any, 
        /* message */ js.UndefOr[String | js.Error], 
        Unit
      ] = js.native
    
    // Mapped types and assertion functions are incompatible?
    // TS2775: Assertions require every name in the call target
    // to be declared with an explicit type annotation.
    def ok(value: Any): /* asserts value */ Boolean = js.native
    def ok(value: Any, message: String): /* asserts value */ Boolean = js.native
    def ok(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
    // Mapped types and assertion functions are incompatible?
    // TS2775: Assertions require every name in the call target
    // to be declared with an explicit type annotation.
    @JSName("ok")
    var ok_Original: js.Function2[
        /* value */ Any, 
        /* message */ js.UndefOr[String | js.Error], 
        /* asserts value */ Boolean
      ] = js.native
    
    def strict(value: Any): /* asserts value */ Boolean = js.native
    def strict(value: Any, message: String): /* asserts value */ Boolean = js.native
    def strict(value: Any, message: js.Error): /* asserts value */ Boolean = js.native
    
    def strictEqual[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def strictEqual[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def strictEqual[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    @JSName("strictEqual")
    var strictEqual_Original: FnCall = js.native
    
    @JSName("strict")
    var strict_Original: (Omit[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any, 
        equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
      ]) & Call = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](actual: Any, expected: T): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def apply[T](actual: Any, expected: T, message: String): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
    def apply[T](actual: Any, expected: T, message: js.Error): /* asserts actual is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  }
}
