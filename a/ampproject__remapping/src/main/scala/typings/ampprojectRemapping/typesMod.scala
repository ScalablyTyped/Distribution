package typings.ampprojectRemapping

import typings.jridgewellTraceMapping.typesMod.SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait LoaderContext extends StObject {
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    val depth: Double
    
    val importer: String
    
    var source: String
  }
  object LoaderContext {
    
    inline def apply(depth: Double, importer: String, source: String): LoaderContext = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderContext]
    }
    
    extension [Self <: LoaderContext](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var decodedMappings: js.UndefOr[Boolean] = js.undefined
    
    var excludeContent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDecodedMappings(value: Boolean): Self = StObject.set(x, "decodedMappings", value.asInstanceOf[js.Any])
      
      inline def setDecodedMappingsUndefined: Self = StObject.set(x, "decodedMappings", js.undefined)
      
      inline def setExcludeContent(value: Boolean): Self = StObject.set(x, "excludeContent", value.asInstanceOf[js.Any])
      
      inline def setExcludeContentUndefined: Self = StObject.set(x, "excludeContent", js.undefined)
    }
  }
  
  type SourceMapLoader = js.Function2[/* file */ String, /* ctx */ LoaderContext, js.UndefOr[SourceMapInput | Null | Unit]]
}
