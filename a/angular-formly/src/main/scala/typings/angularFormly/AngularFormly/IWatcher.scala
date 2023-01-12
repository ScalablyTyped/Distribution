package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which has at least two properties called expression and listener. The watch.expression
  * is added to the formly-form directive's scope (to allow it to run even when hide is true). You
  * can specify a type ($watchCollection or $watchGroup) via the watcher.type property (defaults to
  * $watch) and whether you want it to be a deep watch via the watcher.deep property (defaults to false).
  *
  * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
  */
trait IWatcher extends StObject {
  
  var deep: js.UndefOr[Boolean] = js.undefined
  
  //Defaults to false
  var expression: js.UndefOr[
    String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean])
  ] = js.undefined
  
  def listener(
    field: IFieldRuntimeObject,
    newValue: Any,
    oldValue: Any,
    scope: ITemplateScope,
    stopWatching: js.Function
  ): Unit
  
  var `type`: js.UndefOr[String] = js.undefined
}
object IWatcher {
  
  inline def apply(listener: (IFieldRuntimeObject, Any, Any, ITemplateScope, js.Function) => Unit): IWatcher = {
    val __obj = js.Dynamic.literal(listener = js.Any.fromFunction5(listener))
    __obj.asInstanceOf[IWatcher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWatcher] (val x: Self) extends AnyVal {
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    inline def setExpression(
      value: String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean])
    ): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionFunction2(value: (/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope) => Boolean): Self = StObject.set(x, "expression", js.Any.fromFunction2(value))
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setListener(value: (IFieldRuntimeObject, Any, Any, ITemplateScope, js.Function) => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction5(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
