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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  @JSImport("@angular/compiler/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SyncAsync {
    
    @JSImport("@angular/compiler/src/util", "SyncAsync")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def all[T_2](syncAsyncValues: js.Array[SyncAsync[T_2]]): SyncAsync[js.Array[T_2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(syncAsyncValues.asInstanceOf[js.Any]).asInstanceOf[SyncAsync[js.Array[T_2]]]
    
    @scala.inline
    def assertSync[T](value: SyncAsync[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assertSync")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def `then`[T_1, R](value: SyncAsync[T_1], cb: js.Function1[/* value */ T_1, SyncAsync[R]]): SyncAsync[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("then")(value.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[SyncAsync[R]]
  }
  type SyncAsync[T] = T | js.Promise[T]
  
  @JSImport("@angular/compiler/src/util", "ValueTransformer")
  @js.native
  class ValueTransformer ()
    extends StObject
       with ValueVisitor {
    
    /* CompleteClass */
    override def visitArray(arr: js.Array[js.Any], context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitOther(value: js.Any, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitPrimitive(value: js.Any, context: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/util", "Version")
  @js.native
  class Version protected () extends StObject {
    def this(full: String) = this()
    
    var full: String = js.native
    
    val major: String = js.native
    
    val minor: String = js.native
    
    val patch: String = js.native
  }
  
  @scala.inline
  def dashCaseToCamelCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dashCaseToCamelCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def error(msg: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def escapeRegExp(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeRegExp")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getParseErrors(error: Error): js.Array[ParseError] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseErrors")(error.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParseError]]
  
  @scala.inline
  def isDefined(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPromise[T](obj: js.Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  @scala.inline
  def isSyntaxError(error: Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntaxError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def newArray[T](size: Double): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("newArray")(size.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def newArray[T](size: Double, value: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("newArray")(size.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def noUndefined[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("noUndefined")().asInstanceOf[T]
  @scala.inline
  def noUndefined[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("noUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def partitionArray[T, F](arr: js.Array[T | F], conditionFn: js.Function1[/* value */ T | F, Boolean]): js.Tuple2[js.Array[T], js.Array[F]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionArray")(arr.asInstanceOf[js.Any], conditionFn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[F]]]
  
  @scala.inline
  def resolveForwardRef(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveForwardRef")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def splitAtColon(input: String, defaultValues: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtColon")(input.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitAtPeriod(input: String, defaultValues: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtPeriod")(input.asInstanceOf[js.Any], defaultValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stringify(token: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def syntaxError(msg: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any]).asInstanceOf[Error]
  @scala.inline
  def syntaxError(msg: String, parseErrors: js.Array[ParseError]): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("syntaxError")(msg.asInstanceOf[js.Any], parseErrors.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  @scala.inline
  def utf8Encode(str: String): js.Array[Byte] = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8Encode")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Byte]]
  
  @scala.inline
  def visitValue(value: js.Any, visitor: ValueVisitor, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visitValue")(value.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Byte = Double
  
  trait Console extends StObject {
    
    def log(message: String): Unit
    
    def warn(message: String): Unit
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
    def importExpr(reference: js.Any, typeParams: js.Array[Type]): Expression = js.native
    def importExpr(reference: js.Any, typeParams: js.Array[Type], useSummaries: Boolean): Expression = js.native
    def importExpr(reference: js.Any, typeParams: Null, useSummaries: Boolean): Expression = js.native
    def importExpr(reference: js.Any, typeParams: Unit, useSummaries: Boolean): Expression = js.native
    
    var statements: js.Array[Statement] = js.native
  }
  
  trait ValueVisitor extends StObject {
    
    def visitArray(arr: js.Array[js.Any], context: js.Any): js.Any
    
    def visitOther(value: js.Any, context: js.Any): js.Any
    
    def visitPrimitive(value: js.Any, context: js.Any): js.Any
    
    def visitStringMap(map: StringDictionary[js.Any], context: js.Any): js.Any
  }
  object ValueVisitor {
    
    @scala.inline
    def apply(
      visitArray: (js.Array[js.Any], js.Any) => js.Any,
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
      def setVisitArray(value: (js.Array[js.Any], js.Any) => js.Any): Self = StObject.set(x, "visitArray", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitOther(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "visitOther", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitPrimitive(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "visitPrimitive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitStringMap(value: (StringDictionary[js.Any], js.Any) => js.Any): Self = StObject.set(x, "visitStringMap", js.Any.fromFunction2(value))
    }
  }
}
