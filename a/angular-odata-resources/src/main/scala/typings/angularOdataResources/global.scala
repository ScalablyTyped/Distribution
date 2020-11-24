package typings.angularOdataResources

import typings.angularOdataResources.OData.IExecutable
import typings.angularOdataResources.OData.ProviderCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object OData extends js.Object {
    
    @js.native
    class BinaryOperation protected ()
      extends typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrPredicate: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.UndefOr[scala.Nothing], value: js.Any) = this()
      def this(propertyOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
    }
    
    @js.native
    class Global protected ()
      extends typings.angularOdataResources.OData.Global {
      def this(
        ODataBinaryOperation: js.Any,
        ODataProvider: js.Any,
        ODataValue: js.Any,
        ODataProperty: js.Any,
        ODataMethodCall: js.Any,
        ODataPredicate: js.Any,
        ODataOrderByStatement: js.Any
      ) = this()
    }
    /* static members */
    @js.native
    object Global extends js.Object {
      
      @JSName("$inject")
      var $inject: js.Array[String] = js.native
    }
    
    @js.native
    class MethodCall protected ()
      extends typings.angularOdataResources.OData.MethodCall {
      def this(methodName: String, args: js.Any*) = this()
    }
    
    @js.native
    class Operators ()
      extends typings.angularOdataResources.OData.Operators
    
    @js.native
    class OrderByStatement protected ()
      extends typings.angularOdataResources.OData.OrderByStatement {
      def this(propertyName: String) = this()
      def this(propertyName: String, sortOrder: String) = this()
    }
    
    @js.native
    class Predicate protected ()
      extends typings.angularOdataResources.OData.BinaryOperation {
      def this(propertyOrValueOrPredicate: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.UndefOr[scala.Nothing], value: js.Any) = this()
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
    }
    /* static members */
    @js.native
    object Predicate extends js.Object {
      
      def and(andStatements: js.Any): IExecutable = js.native
      
      def create(propertyOrPredicate: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
      
      def or(orStatements: js.Array[_]): IExecutable = js.native
    }
    
    @js.native
    class Property protected ()
      extends typings.angularOdataResources.OData.Property {
      def this(value: String) = this()
    }
    
    @js.native
    class Provider[T] protected ()
      extends typings.angularOdataResources.OData.Provider[T] {
      def this(callback: ProviderCallback[T]) = this()
    }
    
    @js.native
    class Value protected ()
      extends typings.angularOdataResources.OData.Value {
      def this(value: js.Any) = this()
      def this(value: js.Any, `type`: String) = this()
    }
    
    @js.native
    class ValueTypes ()
      extends typings.angularOdataResources.OData.ValueTypes
    /* static members */
    @js.native
    object ValueTypes extends js.Object {
      
      var Boolean: String = js.native
      
      var Byte: String = js.native
      
      var DateTime: String = js.native
      
      var Decimal: String = js.native
      
      var Double: String = js.native
      
      var Guid: String = js.native
      
      var Int32: String = js.native
      
      var Single: String = js.native
      
      var String: java.lang.String = js.native
    }
  }
}
