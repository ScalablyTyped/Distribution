package typings.aureliaTemplating.mod

import typings.std.HTMLTemplateElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStaticViewConfig extends StObject {
  
  var dependencies: js.UndefOr[
    js.Array[js.Function] | (js.Function0[
      js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
    ])
  ] = js.undefined
  
  var template: String | HTMLTemplateElement
}
object IStaticViewConfig {
  
  inline def apply(template: String | HTMLTemplateElement): IStaticViewConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
  
  extension [Self <: IStaticViewConfig](x: Self) {
    
    inline def setDependencies(
      value: js.Array[js.Function] | (js.Function0[
          js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
        ])
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesFunction0(value: () => js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]): Self = StObject.set(x, "dependencies", js.Any.fromFunction0(value))
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: js.Function*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setTemplate(value: String | HTMLTemplateElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
