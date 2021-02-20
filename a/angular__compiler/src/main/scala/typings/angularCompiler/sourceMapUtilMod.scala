package typings.angularCompiler

import typings.angularCompiler.anon.Column
import typings.angularCompiler.sourceMapMod.SourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapUtilMod {
  
  @JSImport("@angular/compiler/testing/src/output/source_map_util", "extractSourceMap")
  @js.native
  def extractSourceMap(source: String): SourceMap | Null = js.native
  
  @JSImport("@angular/compiler/testing/src/output/source_map_util", "originalPositionFor")
  @js.native
  def originalPositionFor(sourceMap: SourceMap, genPosition: Column): SourceLocation = js.native
  
  @js.native
  trait SourceLocation extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var source: String = js.native
  }
  object SourceLocation {
    
    @scala.inline
    def apply(column: Double, line: Double, source: String): SourceLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit class SourceLocationMutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
