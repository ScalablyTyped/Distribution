package typings.angularOdataResources

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.OData.IExecutable
import typings.angularOdataResources.OData.ProviderCallback
import typings.angularOdataResources.anon.Add
import typings.angularOdataResources.anon.TypeofPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OData {
    
    @JSGlobal("OData.BinaryOperation")
    @js.native
    open class BinaryOperation protected ()
      extends StObject
         with typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrPredicate: Any) = this()
      def this(propertyOrPredicate: Any, valueOrOperator: Any) = this()
      def this(propertyOrPredicate: Any, valueOrOperator: Any, value: Any) = this()
      def this(propertyOrPredicate: Any, valueOrOperator: Unit, value: Any) = this()
    }
    
    @JSGlobal("OData.Global")
    @js.native
    open class Global protected ()
      extends StObject
         with typings.angularOdataResources.OData.Global {
      def this(
        ODataBinaryOperation: Any,
        ODataProvider: Any,
        ODataValue: Any,
        ODataProperty: Any,
        ODataMethodCall: Any,
        ODataPredicate: Any,
        ODataOrderByStatement: Any
      ) = this()
      
      /* CompleteClass */
      var BinaryOperation: Instantiable3[
            /* propertyOrPredicate */ Any, 
            /* valueOrOperator */ js.UndefOr[Any], 
            /* value */ js.UndefOr[Any], 
            typings.angularOdataResources.OData.BinaryOperation
          ] = js.native
      
      /* CompleteClass */
      var Func: Instantiable2[
            /* methodName */ String, 
            /* args (repeated) */ Any, 
            typings.angularOdataResources.OData.MethodCall
          ] = js.native
      
      /* CompleteClass */
      var OrderBy: Instantiable2[
            /* propertyName */ String, 
            /* sortOrder */ js.UndefOr[String], 
            typings.angularOdataResources.OData.OrderByStatement
          ] = js.native
      
      /* CompleteClass */
      var Predicate: TypeofPredicate & (Instantiable3[
            /* propertyOrValueOrPredicate */ Any, 
            /* valueOrOperator */ js.UndefOr[Any], 
            /* value */ js.UndefOr[Any], 
            typings.angularOdataResources.OData.Predicate
          ]) = js.native
      
      /* CompleteClass */
      var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property] = js.native
      
      /* CompleteClass */
      var Provider: typings.angularOdataResources.OData.Provider[Any] = js.native
      
      /* CompleteClass */
      var Value: Instantiable2[
            /* value */ Any, 
            /* type */ js.UndefOr[String], 
            typings.angularOdataResources.OData.Value
          ] = js.native
    }
    object Global {
      
      @JSGlobal("OData.Global")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("OData.Global.$inject")
      @js.native
      def inject: js.Array[String] = js.native
      
      inline def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("OData.MethodCall")
    @js.native
    open class MethodCall protected ()
      extends StObject
         with typings.angularOdataResources.OData.MethodCall {
      def this(methodName: String, args: Any*) = this()
    }
    
    @JSGlobal("OData.Operators")
    @js.native
    open class Operators ()
      extends StObject
         with typings.angularOdataResources.OData.Operators {
      
      /* CompleteClass */
      override def convert(from: String): Any = js.native
      
      /* CompleteClass */
      var operators: Add = js.native
      
      /* private */ /* CompleteClass */
      var rtrim: Any = js.native
      
      /* private */ /* CompleteClass */
      override def trim(value: Any): Any = js.native
    }
    
    @JSGlobal("OData.OrderByStatement")
    @js.native
    open class OrderByStatement protected ()
      extends StObject
         with typings.angularOdataResources.OData.OrderByStatement {
      def this(propertyName: String) = this()
      def this(propertyName: String, sortOrder: String) = this()
    }
    
    @JSGlobal("OData.Predicate")
    @js.native
    open class Predicate protected ()
      extends StObject
         with typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrValueOrPredicate: Any) = this()
      def this(propertyOrValueOrPredicate: Any, valueOrOperator: Any) = this()
      def this(propertyOrValueOrPredicate: Any, valueOrOperator: Any, value: Any) = this()
      def this(propertyOrValueOrPredicate: Any, valueOrOperator: Unit, value: Any) = this()
    }
    object Predicate {
      
      @JSGlobal("OData.Predicate")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def and(andStatements: Any): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(andStatements.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
      
      /* static member */
      inline def create(propertyOrPredicate: Any): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
      inline def create(propertyOrPredicate: Any, operatorOrValue: Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      inline def create(propertyOrPredicate: Any, operatorOrValue: Any, value: Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      inline def create(propertyOrPredicate: Any, operatorOrValue: Unit, value: Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      
      /* static member */
      inline def or(orStatements: js.Array[Any]): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(orStatements.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
    }
    
    @JSGlobal("OData.Property")
    @js.native
    open class Property protected ()
      extends StObject
         with typings.angularOdataResources.OData.Property {
      def this(value: String) = this()
    }
    
    @JSGlobal("OData.Provider")
    @js.native
    open class Provider[T] protected ()
      extends StObject
         with typings.angularOdataResources.OData.Provider[T] {
      def this(callback: ProviderCallback[T]) = this()
    }
    
    @JSGlobal("OData.Value")
    @js.native
    open class Value protected ()
      extends StObject
         with typings.angularOdataResources.OData.Value {
      def this(value: Any) = this()
      def this(value: Any, `type`: String) = this()
      
      /* private */ /* CompleteClass */
      override def escapeIllegalChars(haystack: Any): Any = js.native
      
      /* CompleteClass */
      override def execute(): String = js.native
      
      /* CompleteClass */
      override def executeWithType(): Any = js.native
      
      /* CompleteClass */
      override def executeWithUndefinedType(): Any = js.native
      
      /* private */ /* CompleteClass */
      override def generateDate(date: Any): Any = js.native
      
      /* private */ /* CompleteClass */
      var illegalChars: Any = js.native
      
      /* private */ /* CompleteClass */
      var `type`: Any = js.native
      
      /* private */ /* CompleteClass */
      var value: Any = js.native
    }
    
    @JSGlobal("OData.ValueTypes")
    @js.native
    open class ValueTypes ()
      extends StObject
         with typings.angularOdataResources.OData.ValueTypes
    object ValueTypes {
      
      @JSGlobal("OData.ValueTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Boolean")
      @js.native
      def Boolean: String = js.native
      inline def Boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Byte")
      @js.native
      def Byte: String = js.native
      inline def Byte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Byte")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.DateTime")
      @js.native
      def DateTime: String = js.native
      inline def DateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Decimal")
      @js.native
      def Decimal: String = js.native
      inline def Decimal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Double")
      @js.native
      def Double: String = js.native
      inline def Double_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Guid")
      @js.native
      def Guid: String = js.native
      inline def Guid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Guid")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Int32")
      @js.native
      def Int32: String = js.native
      inline def Int32_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Single")
      @js.native
      def Single: String = js.native
      inline def Single_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.String")
      @js.native
      def String: java.lang.String = js.native
      inline def String_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    }
  }
}
