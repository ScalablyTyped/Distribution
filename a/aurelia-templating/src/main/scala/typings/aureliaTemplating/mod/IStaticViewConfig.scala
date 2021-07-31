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
  
  @scala.inline
  def apply(template: String | HTMLTemplateElement): IStaticViewConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticViewConfig]
  }
  
  @scala.inline
  implicit class IStaticViewConfigMutableBuilder[Self <: IStaticViewConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencies(
      value: js.Array[js.Function] | (js.Function0[
          js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]
        ])
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesFunction0(value: () => js.Array[js.Function | (js.Promise[js.Function | (Record[String, js.Function])])]): Self = StObject.set(x, "dependencies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: js.Function*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String | HTMLTemplateElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
