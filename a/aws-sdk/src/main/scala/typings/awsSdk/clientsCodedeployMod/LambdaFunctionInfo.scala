package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionInfo extends StObject {
  
  /**
    *  The version of a Lambda function that production traffic points to. 
    */
  var currentVersion: js.UndefOr[Version] = js.undefined
  
  /**
    *  The alias of a Lambda function. For more information, see Lambda Function Aliases in the Lambda Developer Guide.
    */
  var functionAlias: js.UndefOr[LambdaFunctionAlias] = js.undefined
  
  /**
    *  The name of a Lambda function. 
    */
  var functionName: js.UndefOr[LambdaFunctionName] = js.undefined
  
  /**
    *  The version of a Lambda function that production traffic points to after the Lambda function is deployed. 
    */
  var targetVersion: js.UndefOr[Version] = js.undefined
  
  /**
    *  The percentage of production traffic that the target version of a Lambda function receives. 
    */
  var targetVersionWeight: js.UndefOr[TrafficWeight] = js.undefined
}
object LambdaFunctionInfo {
  
  inline def apply(): LambdaFunctionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionInfo] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: Version): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setFunctionAlias(value: LambdaFunctionAlias): Self = StObject.set(x, "functionAlias", value.asInstanceOf[js.Any])
    
    inline def setFunctionAliasUndefined: Self = StObject.set(x, "functionAlias", js.undefined)
    
    inline def setFunctionName(value: LambdaFunctionName): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setTargetVersion(value: Version): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    
    inline def setTargetVersionWeight(value: TrafficWeight): Self = StObject.set(x, "targetVersionWeight", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionWeightUndefined: Self = StObject.set(x, "targetVersionWeight", js.undefined)
  }
}
