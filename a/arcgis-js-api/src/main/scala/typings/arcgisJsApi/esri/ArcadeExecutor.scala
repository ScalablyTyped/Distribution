package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcadeExecutor
  extends StObject
     with Object {
  
  /**
    * A function that can be invoked to evaluate the compiled expression for a set of profile variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  def execute(profileVariableInstances: Any): ResultType
  def execute(profileVariableInstances: Any, context: ExecuteContext): ResultType
  
  /**
    * Asynchronous function that evaluates the compiled expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  def executeAsync(profileVariableInstances: Any): js.Promise[ResultType]
  def executeAsync(profileVariableInstances: Any, context: ExecuteContext): js.Promise[ResultType]
  /**
    * Asynchronous function that evaluates the compiled expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  @JSName("executeAsync")
  var executeAsync_Original: ExecuteFunctionAsync
  
  /**
    * A function that can be invoked to evaluate the compiled expression for a set of profile variables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  @JSName("execute")
  var execute_Original: ExecuteFunction
  
  /**
    * References the names of fields used in the compiled expression when working with the `$feature` profile variable or functions that expect field names, such as `Expects`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  var fieldsUsed: js.Array[String]
  
  /**
    * Indicates whether the compiled expression accesses data using a FeatureSet function and therefore must be executed using the `executeAsync` function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#ArcadeExecutor)
    */
  var isAsync: Boolean
}
object ArcadeExecutor {
  
  inline def apply(
    constructor: js.Function,
    execute: ExecuteFunction,
    executeAsync: ExecuteFunctionAsync,
    fieldsUsed: js.Array[String],
    hasOwnProperty: PropertyKey => Boolean,
    isAsync: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ArcadeExecutor = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], executeAsync = executeAsync.asInstanceOf[js.Any], fieldsUsed = fieldsUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isAsync = isAsync.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ArcadeExecutor]
  }
  
  extension [Self <: ArcadeExecutor](x: Self) {
    
    inline def setExecute(value: ExecuteFunction): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setExecuteAsync(value: ExecuteFunctionAsync): Self = StObject.set(x, "executeAsync", value.asInstanceOf[js.Any])
    
    inline def setFieldsUsed(value: js.Array[String]): Self = StObject.set(x, "fieldsUsed", value.asInstanceOf[js.Any])
    
    inline def setFieldsUsedVarargs(value: String*): Self = StObject.set(x, "fieldsUsed", js.Array(value*))
    
    inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
  }
}
