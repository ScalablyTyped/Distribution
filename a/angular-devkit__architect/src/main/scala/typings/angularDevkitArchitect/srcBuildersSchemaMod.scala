package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersSchemaMod {
  
  trait Builder extends StObject {
    
    /**
      * The builder class module.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      * Builder description.
      */
    var description: String
    
    /**
      * The next generation builder module.
      */
    var implementation: js.UndefOr[String] = js.undefined
    
    /**
      * Schema for builder option validation.
      */
    var schema: String
  }
  object Builder {
    
    inline def apply(description: String, schema: String): Builder = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Builder]
    }
    
    extension [Self <: Builder](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait Schema extends StObject {
    
    /**
      * Link to schema.
      */
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    var builders: StringDictionary[Builder]
  }
  object Schema {
    
    inline def apply(builders: StringDictionary[Builder]): Schema = {
      val __obj = js.Dynamic.literal(builders = builders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setBuilders(value: StringDictionary[Builder]): Self = StObject.set(x, "builders", value.asInstanceOf[js.Any])
    }
  }
}
