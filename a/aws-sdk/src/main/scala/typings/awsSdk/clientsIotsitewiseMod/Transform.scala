package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  /**
    * The mathematical expression that defines the transformation function. You can specify up to 10 variables per expression. You can specify up to 10 functions per expression.  For more information, see Quotas in the IoT SiteWise User Guide.
    */
  var expression: Expression
  
  /**
    * The processing configuration for the given transform property. You can configure transforms to be kept at the edge or forwarded to the Amazon Web Services Cloud. You can also configure transforms to be computed at the edge or in the cloud.
    */
  var processingConfig: js.UndefOr[TransformProcessingConfig] = js.undefined
  
  /**
    * The list of variables used in the expression.
    */
  var variables: ExpressionVariables
}
object Transform {
  
  inline def apply(expression: Expression, variables: ExpressionVariables): Transform = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfig(value: TransformProcessingConfig): Self = StObject.set(x, "processingConfig", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigUndefined: Self = StObject.set(x, "processingConfig", js.undefined)
    
    inline def setVariables(value: ExpressionVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: ExpressionVariable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
