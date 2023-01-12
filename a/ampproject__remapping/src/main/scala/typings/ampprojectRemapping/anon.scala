package typings.ampprojectRemapping

import typings.ampprojectRemapping.distTypesSourceMapTreeMod.SourceMapSegmentObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column
    extends StObject
       with SourceMapSegmentObject {
    
    var column: Double
    
    var content: String | Null
    
    var line: Double
    
    var name: String
    
    var source: String
  }
  object Column {
    
    inline def apply(column: Double, line: Double, name: String, source: String): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content
    extends StObject
       with SourceMapSegmentObject {
    
    var column: Null
    
    var content: Null
    
    var line: Null
    
    var name: Null
    
    var source: Null
  }
  object Content {
    
    inline def apply(column: Null, content: Null, line: Null, name: Null, source: Null): Content = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Null): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Null): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setName(value: Null): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Null): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
