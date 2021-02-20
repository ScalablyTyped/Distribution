package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  object SyncAsync {
    
    @JSImport("@angular/compiler/src/util", "SyncAsync.all")
    @js.native
    def all[T_2](syncAsyncValues: js.Array[SyncAsync[T_2]]): SyncAsync[js.Array[T_2]] = js.native
    
    @JSImport("@angular/compiler/src/util", "SyncAsync.assertSync")
    @js.native
    def assertSync[T](value: SyncAsync[T]): T = js.native
    
    @JSImport("@angular/compiler/src/util", "SyncAsync.then")
    @js.native
    def `then`[T_1, R](value: SyncAsync[T_1], cb: js.Function1[/* value */ T_1, SyncAsync[R]]): SyncAsync[R] = js.native
  }
  type SyncAsync[T] = T | js.Promise[T]
  
  @JSImport("@angular/compiler/src/util", "ValueTransformer")
  @js.native
  class ValueTransformer () extends ValueVisitor
  
  @JSImport("@angular/compiler/src/util", "Version")
  @js.native
  class Version protected () extends StObject {
    def this(full: String) = this()
    
    var full: String = js.native
    
    val major: String = js.native
    
    val minor: String = js.native
    
    val patch: String = js.native
  }
  
  @JSImport("@angular/compiler/src/util", "dashCaseToCamelCase")
  @js.native
  def dashCaseToCamelCase(input: String): String = js.native
  
  @JSImport("@angular/compiler/src/util", "error")
  @js.native
  def error(msg: String): scala.Nothing = js.native
  
  @JSImport("@angular/compiler/src/util", "escapeRegExp")
  @js.native
  def escapeRegExp(s: String): String = js.native
  
  @JSImport("@angular/compiler/src/util", "getParseErrors")
  @js.native
  def getParseErrors(error: Error): js.Array[ParseError] = js.native
  
  @JSImport("@angular/compiler/src/util", "isDefined")
  @js.native
  def isDefined(`val`: js.Any): Boolean = js.native
  
  @JSImport("@angular/compiler/src/util", "isPromise")
  @js.native
  def isPromise[T](obj: js.Any): /* is std.Promise<T> */ Boolean = js.native
  
  @JSImport("@angular/compiler/src/util", "isSyntaxError")
  @js.native
  def isSyntaxError(error: Error): Boolean = js.native
  
  @JSImport("@angular/compiler/src/util", "newArray")
  @js.native
  def newArray[T](size: Double): js.Array[T] = js.native
  @JSImport("@angular/compiler/src/util", "newArray")
  @js.native
  def newArray[T](size: Double, value: T): js.Array[T] = js.native
  
  @JSImport("@angular/compiler/src/util", "noUndefined")
  @js.native
  def noUndefined[T](): T = js.native
  @JSImport("@angular/compiler/src/util", "noUndefined")
  @js.native
  def noUndefined[T](`val`: T): T = js.native
  
  @JSImport("@angular/compiler/src/util", "partitionArray")
  @js.native
  def partitionArray[T, F](arr: js.Array[T | F], conditionFn: js.Function1[/* value */ T | F, Boolean]): js.Tuple2[js.Array[T], js.Array[F]] = js.native
  
  @JSImport("@angular/compiler/src/util", "resolveForwardRef")
  @js.native
  def resolveForwardRef(`type`: js.Any): js.Any = js.native
  
  @JSImport("@angular/compiler/src/util", "splitAtColon")
  @js.native
  def splitAtColon(input: String, defaultValues: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("@angular/compiler/src/util", "splitAtPeriod")
  @js.native
  def splitAtPeriod(input: String, defaultValues: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("@angular/compiler/src/util", "stringify")
  @js.native
  def stringify(token: js.Any): String = js.native
  
  @JSImport("@angular/compiler/src/util", "syntaxError")
  @js.native
  def syntaxError(msg: String): Error = js.native
  @JSImport("@angular/compiler/src/util", "syntaxError")
  @js.native
  def syntaxError(msg: String, parseErrors: js.Array[ParseError]): Error = js.native
  
  @JSImport("@angular/compiler/src/util", "utf8Encode")
  @js.native
  def utf8Encode(str: String): js.Array[Byte] = js.native
  
  @JSImport("@angular/compiler/src/util", "visitValue")
  @js.native
  def visitValue(value: js.Any, visitor: ValueVisitor, context: js.Any): js.Any = js.native
  
  type Byte = Double
  
  @js.native
  trait Console extends StObject {
    
    def log(message: String): Unit = js.native
    
    def warn(message: String): Unit = js.native
  }
  object Console {
    
    @scala.inline
    def apply(log: String => Unit, warn: String => Unit): Console = {
      val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Console]
    }
    
    @scala.inline
    implicit class ConsoleMutableBuilder[Self <: Console] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OutputContext extends StObject {
    
    var constantPool: ConstantPool = js.native
    
    var genFilePath: String = js.native
    
    def importExpr(reference: js.Any): Expression = js.native
    def importExpr(reference: js.Any, typeParams: js.UndefOr[scala.Nothing], useSummaries: Boolean): Expression = js.native
    def importExpr(reference: js.Any, typeParams: js.Array[Type]): Expression = js.native
    def importExpr(reference: js.Any, typeParams: js.Array[Type], useSummaries: Boolean): Expression = js.native
    def importExpr(reference: js.Any, typeParams: Null, useSummaries: Boolean): Expression = js.native
    
    var statements: js.Array[Statement] = js.native
  }
  
  @js.native
  trait ValueVisitor extends StObject {
    
    def visitArray(arr: js.Array[_], context: js.Any): js.Any = js.native
    
    def visitOther(value: js.Any, context: js.Any): js.Any = js.native
    
    def visitPrimitive(value: js.Any, context: js.Any): js.Any = js.native
    
    def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any = js.native
  }
  object ValueVisitor {
    
    @scala.inline
    def apply(
      visitArray: (js.Array[_], js.Any) => js.Any,
      visitOther: (js.Any, js.Any) => js.Any,
      visitPrimitive: (js.Any, js.Any) => js.Any,
      visitStringMap: (StringDictionary[js.Any], js.Any) => js.Any
    ): ValueVisitor = {
      val __obj = js.Dynamic.literal(visitArray = js.Any.fromFunction2(visitArray), visitOther = js.Any.fromFunction2(visitOther), visitPrimitive = js.Any.fromFunction2(visitPrimitive), visitStringMap = js.Any.fromFunction2(visitStringMap))
      __obj.asInstanceOf[ValueVisitor]
    }
    
    @scala.inline
    implicit class ValueVisitorMutableBuilder[Self <: ValueVisitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisitArray(value: (js.Array[_], js.Any) => js.Any): Self = StObject.set(x, "visitArray", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitOther(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "visitOther", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitPrimitive(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "visitPrimitive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitStringMap(value: (StringDictionary[js.Any], js.Any) => js.Any): Self = StObject.set(x, "visitStringMap", js.Any.fromFunction2(value))
    }
  }
}
