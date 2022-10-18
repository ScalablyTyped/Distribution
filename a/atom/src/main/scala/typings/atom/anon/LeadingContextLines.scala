package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeadingContextLines extends StObject {
  
  var leadingContextLines: js.Array[String]
  
  var lineText: String
  
  var lineTextOffset: Double
  
  var matchText: String
  
  var range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  
  var trailingContextLines: js.Array[String]
}
object LeadingContextLines {
  
  inline def apply(
    leadingContextLines: js.Array[String],
    lineText: String,
    lineTextOffset: Double,
    matchText: String,
    range: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    trailingContextLines: js.Array[String]
  ): LeadingContextLines = {
    val __obj = js.Dynamic.literal(leadingContextLines = leadingContextLines.asInstanceOf[js.Any], lineText = lineText.asInstanceOf[js.Any], lineTextOffset = lineTextOffset.asInstanceOf[js.Any], matchText = matchText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], trailingContextLines = trailingContextLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadingContextLines]
  }
  
  extension [Self <: LeadingContextLines](x: Self) {
    
    inline def setLeadingContextLines(value: js.Array[String]): Self = StObject.set(x, "leadingContextLines", value.asInstanceOf[js.Any])
    
    inline def setLeadingContextLinesVarargs(value: String*): Self = StObject.set(x, "leadingContextLines", js.Array(value*))
    
    inline def setLineText(value: String): Self = StObject.set(x, "lineText", value.asInstanceOf[js.Any])
    
    inline def setLineTextOffset(value: Double): Self = StObject.set(x, "lineTextOffset", value.asInstanceOf[js.Any])
    
    inline def setMatchText(value: String): Self = StObject.set(x, "matchText", value.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTrailingContextLines(value: js.Array[String]): Self = StObject.set(x, "trailingContextLines", value.asInstanceOf[js.Any])
    
    inline def setTrailingContextLinesVarargs(value: String*): Self = StObject.set(x, "trailingContextLines", js.Array(value*))
  }
}
