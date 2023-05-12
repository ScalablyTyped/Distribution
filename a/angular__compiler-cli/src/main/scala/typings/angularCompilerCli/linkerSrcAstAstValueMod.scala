package typings.angularCompilerCli

import typings.angularCompiler.mod.WrappedNodeExpr
import typings.angularCompilerCli.linkerSrcAstAstHostMod.AstHost
import typings.angularCompilerCli.linkerSrcAstAstHostMod.Range
import typings.std.Extract
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcAstAstValueMod {
  
  @JSImport("@angular/compiler-cli/linker/src/ast/ast_value", "AstObject")
  @js.native
  /* private */ open class AstObject[T /* <: js.Object */, TExpression] () extends StObject {
    
    val expression: TExpression = js.native
    
    /**
      * Returns an array of `AstValue` objects parsed from the property called `propertyName`.
      *
      * Throws an error if there is no such property or the property is not an array.
      */
    def getArray[K /* <: PropertyKey[T] */](propertyName: K): js.Array[
        AstValue[
          ArrayValueType[
            /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
          ], 
          TExpression
        ]
      ] = js.native
    
    /**
      * Returns the boolean value of the property called `propertyName`.
      *
      * Throws an error if there is no such property or the property is not a boolean.
      */
    def getBoolean[K /* <: PropertyKey[T] */](propertyName: K): Boolean = js.native
    
    /**
      * Returns the raw `TExpression` value of the property called `propertyName`.
      *
      * Throws an error if there is no such property.
      */
    def getNode(propertyName: PropertyKey[T]): TExpression = js.native
    
    /**
      * Returns the number value of the property called `propertyName`.
      *
      * Throws an error if there is no such property or the property is not a number.
      */
    def getNumber[K /* <: PropertyKey[T] */](propertyName: K): Double = js.native
    
    /**
      * Returns the nested `AstObject` parsed from the property called `propertyName`.
      *
      * Throws an error if there is no such property or the property is not an object.
      */
    def getObject[K /* <: PropertyKey[T] */](propertyName: K): AstObject[
        ObjectType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ], 
        TExpression
      ] = js.native
    
    /**
      * Returns a `WrappedNodeExpr` object that wraps the expression at the property called
      * `propertyName`.
      *
      * Throws an error if there is no such property.
      */
    def getOpaque(propertyName: PropertyKey[T]): WrappedNodeExpr[TExpression] = js.native
    
    /* private */ var getRequiredProperty: Any = js.native
    
    /**
      * Returns the string value of the property called `propertyName`.
      *
      * Throws an error if there is no such property or the property is not a string.
      */
    def getString[K /* <: PropertyKey[T] */](propertyName: K): String = js.native
    
    /**
      * Returns an `AstValue` that wraps the value of the property called `propertyName`.
      *
      * Throws an error if there is no such property.
      */
    def getValue[K /* <: PropertyKey[T] */](propertyName: K): AstValue[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
        TExpression
      ] = js.native
    
    /**
      * Returns true if the object has a property called `propertyName`.
      */
    def has(propertyName: PropertyKey[T]): Boolean = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var obj: Any = js.native
    
    /**
      * Converts the AstObject to a raw JavaScript object, mapping each property value (as an
      * `AstValue`) to the generic type (`T`) via the `mapper` function.
      */
    def toLiteral[V](mapper: js.Function2[/* value */ AstValue[ObjectValueType[T], TExpression], /* key */ String, V]): Record[String, V] = js.native
    
    /**
      * Converts the AstObject to a JavaScript Map, mapping each property value (as an
      * `AstValue`) to the generic type (`T`) via the `mapper` function.
      */
    def toMap[V](mapper: js.Function1[/* value */ AstValue[ObjectValueType[T], TExpression], V]): Map[String, V] = js.native
  }
  /* static members */
  object AstObject {
    
    @JSImport("@angular/compiler-cli/linker/src/ast/ast_value", "AstObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new `AstObject` from the given `expression` and `host`.
      */
    inline def parse[T /* <: js.Object */, TExpression](expression: TExpression, host: AstHost[TExpression]): AstObject[T, TExpression] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(expression.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[AstObject[T, TExpression]]
  }
  
  @JSImport("@angular/compiler-cli/linker/src/ast/ast_value", "AstValue")
  @js.native
  open class AstValue[T, TExpression] protected () extends StObject {
    def this(expression: TExpression, host: AstHost[TExpression]) = this()
    
    val expression: TExpression = js.native
    
    def getArguments(): js.Array[AstValue[Any, TExpression]] = js.native
    
    /**
      * Parse this value into an array of `AstValue` objects, or error if it is not an array literal.
      */
    def getArray(): js.Array[AstValue[ArrayValueType[T], TExpression]] = js.native
    
    /**
      * Parse the boolean from this value, or error if it is not a boolean.
      */
    def getBoolean(): Boolean = js.native
    
    def getCallee(): AstValue[Any, TExpression] = js.native
    
    /**
      * Extract the return value as an `AstValue` from this value as a function expression, or error if
      * it is not a function expression.
      */
    def getFunctionReturnValue[R](): AstValue[R, TExpression] = js.native
    
    /**
      * Parse the number from this value, or error if it is not a number.
      */
    def getNumber(): Double = js.native
    
    /**
      * Parse this value into an `AstObject`, or error if it is not an object literal.
      */
    def getObject(): AstObject[ObjectType[T], TExpression] = js.native
    
    /**
      * Return the `TExpression` of this value wrapped in a `WrappedNodeExpr`.
      */
    def getOpaque(): WrappedNodeExpr[TExpression] = js.native
    
    /**
      * Get the range of the location of this value in the original source.
      */
    def getRange(): Range = js.native
    
    /**
      * Parse the string from this value, or error if it is not a string.
      */
    def getString(): String = js.native
    
    /**
      * Get the name of the symbol represented by the given expression node, or `null` if it is not a
      * symbol.
      */
    def getSymbolName(): String | Null = js.native
    
    /* private */ var host: Any = js.native
    
    /**
      * Is this value an array literal?
      */
    def isArray(): Boolean = js.native
    
    /**
      * Is this value a boolean?
      */
    def isBoolean(): Boolean = js.native
    
    def isCallExpression(): Boolean = js.native
    
    /**
      * Is this value a function expression?
      */
    def isFunction(): Boolean = js.native
    
    /**
      * Is this value a number?
      */
    def isNumber(): Boolean = js.native
    
    /**
      * Is this value an object literal?
      */
    def isObject(): Boolean = js.native
    
    /**
      * Is this value a string?
      */
    def isString(): Boolean = js.native
  }
  
  /**
    * Represents the value type of an array literal.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<infer R> ? R : never
    }}}
    */
  @js.native
  trait ArrayValueType[T] extends StObject
  
  /**
    * Ensures that `This` has its generic type `Actual` conform to the expected generic type in
    * `Expected`, to disallow calling a method if the generic type does not conform.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Actual extends Expected ? This : never
    }}}
    */
  type ConformsTo[This, Actual, Expected] = This
  
  /**
    * Represents only those types in `T` that are object types.
    */
  type ObjectType[T] = Extract[T, js.Object]
  
  /**
    * Represents the value type of an object literal.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Record<string, infer R> ? R : never
    }}}
    */
  @js.native
  trait ObjectValueType[T] extends StObject
  
  /**
    * Represents only the string keys of type `T`.
    */
  type PropertyKey[T] = /* keyof T */ String
}
