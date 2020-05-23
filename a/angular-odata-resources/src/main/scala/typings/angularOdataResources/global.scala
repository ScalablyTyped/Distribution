package typings.angularOdataResources

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.OData.IExecutable
import typings.angularOdataResources.OData.ProviderCallback
import typings.angularOdataResources.anon.Add
import typings.angularOdataResources.anon.TypeofPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
      /* CompleteClass */
      override var BinaryOperation: Instantiable3[
            /* propertyOrPredicate */ js.Any, 
            js.UndefOr[/* valueOrOperator */ js.Any], 
            js.UndefOr[/* value */ js.Any], 
            typings.angularOdataResources.OData.BinaryOperation
          ] = js.native
      /* CompleteClass */
      override var Func: Instantiable2[
            /* methodName */ String, 
            /* args (repeated) */ js.Any, 
            typings.angularOdataResources.OData.MethodCall
          ] = js.native
      /* CompleteClass */
      override var OrderBy: Instantiable2[
            /* propertyName */ String, 
            js.UndefOr[/* sortOrder */ String], 
            typings.angularOdataResources.OData.OrderByStatement
          ] = js.native
      /* CompleteClass */
      override var Predicate: TypeofPredicate = js.native
      /* CompleteClass */
      override var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property] = js.native
      /* CompleteClass */
      override var Provider: typings.angularOdataResources.OData.Provider[_] = js.native
      /* CompleteClass */
      override var Value: Instantiable2[
            /* value */ js.Any, 
            js.UndefOr[/* type */ String], 
            typings.angularOdataResources.OData.Value
          ] = js.native
    }
    
    @js.native
    class MethodCall protected ()
      extends typings.angularOdataResources.OData.MethodCall {
      def this(methodName: String, args: js.Any*) = this()
    }
    
    @js.native
    class Operators ()
      extends typings.angularOdataResources.OData.Operators {
      /* CompleteClass */
      override var operators: Add = js.native
      /* CompleteClass */
      override var rtrim: js.Any = js.native
      /* CompleteClass */
      override def convert(from: String): js.Any = js.native
      /* CompleteClass */
      /* private */ override def trim(value: js.Any): js.Any = js.native
    }
    
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
      def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
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
      /* CompleteClass */
      override var illegalChars: js.Any = js.native
      /* CompleteClass */
      override var `type`: js.Any = js.native
      /* CompleteClass */
      override var value: js.Any = js.native
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
    }
    
    @js.native
    class ValueTypes ()
      extends typings.angularOdataResources.OData.ValueTypes
    
    /* static members */
    @js.native
    object Global extends js.Object {
      @JSName("$inject")
      var $inject: js.Array[String] = js.native
    }
    
    /* static members */
    @js.native
    object Predicate extends js.Object {
      def and(andStatements: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
      def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
      def or(orStatements: js.Array[_]): IExecutable = js.native
    }
    
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

