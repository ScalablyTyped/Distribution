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
    class BinaryOperation protected ()
      extends StObject
         with typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrPredicate: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: Unit, value: js.Any) = this()
    }
    
    @JSGlobal("OData.Global")
    @js.native
    class Global protected ()
      extends StObject
         with typings.angularOdataResources.OData.Global {
      def this(
        ODataBinaryOperation: js.Any,
        ODataProvider: js.Any,
        ODataValue: js.Any,
        ODataProperty: js.Any,
        ODataMethodCall: js.Any,
        ODataPredicate: js.Any,
        ODataOrderByStatement: js.Any
      ) = this()
      
      /* CompleteClass */
      var BinaryOperation: Instantiable3[
            /* propertyOrPredicate */ js.Any, 
            /* valueOrOperator */ js.UndefOr[js.Any], 
            /* value */ js.UndefOr[js.Any], 
            typings.angularOdataResources.OData.BinaryOperation
          ] = js.native
      
      /* CompleteClass */
      var Func: Instantiable2[
            /* methodName */ String, 
            /* args (repeated) */ js.Any, 
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
            /* propertyOrValueOrPredicate */ js.Any, 
            /* valueOrOperator */ js.UndefOr[js.Any], 
            /* value */ js.UndefOr[js.Any], 
            typings.angularOdataResources.OData.Predicate
          ]) = js.native
      
      /* CompleteClass */
      var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property] = js.native
      
      /* CompleteClass */
      var Provider: typings.angularOdataResources.OData.Provider[js.Any] = js.native
      
      /* CompleteClass */
      var Value: Instantiable2[
            /* value */ js.Any, 
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
      
      @scala.inline
      def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("OData.MethodCall")
    @js.native
    class MethodCall protected ()
      extends StObject
         with typings.angularOdataResources.OData.MethodCall {
      def this(methodName: String, args: js.Any*) = this()
    }
    
    @JSGlobal("OData.Operators")
    @js.native
    class Operators ()
      extends StObject
         with typings.angularOdataResources.OData.Operators {
      
      /* CompleteClass */
      override def convert(from: String): js.Any = js.native
      
      /* CompleteClass */
      var operators: Add = js.native
      
      /* CompleteClass */
      var rtrim: js.Any = js.native
      
      /* CompleteClass */
      /* private */ override def trim(value: js.Any): js.Any = js.native
    }
    
    @JSGlobal("OData.OrderByStatement")
    @js.native
    class OrderByStatement protected ()
      extends StObject
         with typings.angularOdataResources.OData.OrderByStatement {
      def this(propertyName: String) = this()
      def this(propertyName: String, sortOrder: String) = this()
    }
    
    @JSGlobal("OData.Predicate")
    @js.native
    class Predicate protected ()
      extends StObject
         with typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrValueOrPredicate: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: Unit, value: js.Any) = this()
    }
    object Predicate {
      
      @JSGlobal("OData.Predicate")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @scala.inline
      def and(andStatements: js.Any): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(andStatements.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
      
      /* static member */
      @scala.inline
      def create(propertyOrPredicate: js.Any): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
      @scala.inline
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      @scala.inline
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      @scala.inline
      def create(propertyOrPredicate: js.Any, operatorOrValue: Unit, value: js.Any): IExecutable = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(propertyOrPredicate.asInstanceOf[js.Any], operatorOrValue.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IExecutable]
      
      /* static member */
      @scala.inline
      def or(orStatements: js.Array[js.Any]): IExecutable = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(orStatements.asInstanceOf[js.Any]).asInstanceOf[IExecutable]
    }
    
    @JSGlobal("OData.Property")
    @js.native
    class Property protected ()
      extends StObject
         with typings.angularOdataResources.OData.Property {
      def this(value: String) = this()
    }
    
    @JSGlobal("OData.Provider")
    @js.native
    class Provider[T] protected ()
      extends StObject
         with typings.angularOdataResources.OData.Provider[T] {
      def this(callback: ProviderCallback[T]) = this()
    }
    
    @JSGlobal("OData.Value")
    @js.native
    class Value protected ()
      extends StObject
         with typings.angularOdataResources.OData.Value {
      def this(value: js.Any) = this()
      def this(value: js.Any, `type`: String) = this()
      
      /* CompleteClass */
      /* private */ override def escapeIllegalChars(haystack: js.Any): js.Any = js.native
      
      /* CompleteClass */
      override def execute(): String = js.native
      
      /* CompleteClass */
      override def executeWithType(): js.Any = js.native
      
      /* CompleteClass */
      override def executeWithUndefinedType(): js.Any = js.native
      
      /* CompleteClass */
      /* private */ override def generateDate(date: js.Any): js.Any = js.native
      
      /* CompleteClass */
      var illegalChars: js.Any = js.native
      
      /* CompleteClass */
      var `type`: js.Any = js.native
      
      /* CompleteClass */
      var value: js.Any = js.native
    }
    
    @JSGlobal("OData.ValueTypes")
    @js.native
    class ValueTypes ()
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
      @scala.inline
      def Boolean_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Byte")
      @js.native
      def Byte: String = js.native
      @scala.inline
      def Byte_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Byte")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.DateTime")
      @js.native
      def DateTime: String = js.native
      @scala.inline
      def DateTime_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Decimal")
      @js.native
      def Decimal: String = js.native
      @scala.inline
      def Decimal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Double")
      @js.native
      def Double: String = js.native
      @scala.inline
      def Double_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Guid")
      @js.native
      def Guid: String = js.native
      @scala.inline
      def Guid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Guid")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Int32")
      @js.native
      def Int32: String = js.native
      @scala.inline
      def Int32_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.Single")
      @js.native
      def Single: String = js.native
      @scala.inline
      def Single_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("OData.ValueTypes.String")
      @js.native
      def String: java.lang.String = js.native
      @scala.inline
      def String_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    }
  }
}
