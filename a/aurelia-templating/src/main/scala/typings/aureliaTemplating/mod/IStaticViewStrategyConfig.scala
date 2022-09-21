package typings.aureliaTemplating.mod

import typings.std.HTMLTemplateElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStaticViewStrategyConfig extends StObject {
  
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[js.Array[(js.Promise[Record[String, js.Function]]) | js.Function]])
  ] = js.undefined
  
  var template: String | HTMLTemplateElement
}
object IStaticViewStrategyConfig {
  
  inline def apply(template: String | HTMLTemplateElement): IStaticViewStrategyConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewStrategyConfig]
  }
  
  extension [Self <: IStaticViewStrategyConfig](x: Self) {
    
    inline def setDependencies(
      value: js.Array[js.Function] | (js.Function0[js.Array[(js.Promise[Record[String, js.Function]]) | js.Function]])
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesFunction0(value: () => js.Array[(js.Promise[Record[String, js.Function]]) | js.Function]): Self = StObject.set(x, "dependencies", js.Any.fromFunction0(value))
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: js.Function*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setTemplate(value: String | HTMLTemplateElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
