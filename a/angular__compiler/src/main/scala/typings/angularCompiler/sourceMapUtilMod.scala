package typings.angularCompiler

import typings.angularCompiler.anon.Column
import typings.angularCompiler.sourceMapMod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapUtilMod {
  
  @JSImport("@angular/compiler/testing/src/output/source_map_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractSourceMap(source: String): SourceMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractSourceMap")(source.asInstanceOf[js.Any]).asInstanceOf[SourceMap | Null]
  
  inline def originalPositionFor(sourceMap: SourceMap, genPosition: Column): SourceLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("originalPositionFor")(sourceMap.asInstanceOf[js.Any], genPosition.asInstanceOf[js.Any])).asInstanceOf[SourceLocation]
  
  trait SourceLocation extends StObject {
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object SourceLocation {
    
    inline def apply(column: Double, line: Double, source: String): SourceLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    extension [Self <: SourceLocation](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
