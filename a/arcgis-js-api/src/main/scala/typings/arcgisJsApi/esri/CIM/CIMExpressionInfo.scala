package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMExpressionInfo extends StObject {
  
  /**
    * The Arcade expression used to evaluate and return the value that a property expects.
    */
  var expression: js.UndefOr[String] = js.native
  
  /**
    * The Name of the expression.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ReturnType of the expression.
    */
  var returnType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionReturnType * / any */ String
  ] = js.native
  
  /**
    * The human readable text that describes the expression.
    */
  var title: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo = js.native
}
object CIMExpressionInfo {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo): CIMExpressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMExpressionInfo]
  }
  
  @scala.inline
  implicit class CIMExpressionInfoMutableBuilder[Self <: CIMExpressionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReturnType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExpressionReturnType * / any */ String
    ): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
