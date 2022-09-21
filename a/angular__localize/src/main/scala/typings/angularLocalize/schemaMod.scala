package typings.angularLocalize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  trait Schema extends StObject {
    
    /**
      * The name of the project.
      * @deprecated use the `project` option instead.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the project.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Will this project use $localize at runtime?
      *
      * If true then the dependency is included in the `dependencies` section of package.json, rather
      * than `devDependencies`.
      */
    var useAtRuntime: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(): Schema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setUseAtRuntime(value: Boolean): Self = StObject.set(x, "useAtRuntime", value.asInstanceOf[js.Any])
      
      inline def setUseAtRuntimeUndefined: Self = StObject.set(x, "useAtRuntime", js.undefined)
    }
  }
}
