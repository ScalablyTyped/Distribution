package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMExpressionInfo extends StObject {
  
  /**
    * The Arcade expression used to evaluate and return the value that a property expects.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The Name of the expression.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The ReturnType of the expression.
    */
  var returnType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionReturnType * / any */ String
  ] = js.undefined
  
  /**
    * The human readable text that describes the expression.
    */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo
}
object CIMExpressionInfo {
  
  inline def apply(): CIMExpressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMExpressionInfo")
    __obj.asInstanceOf[CIMExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturnType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionReturnType * / any */ String
    ): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
