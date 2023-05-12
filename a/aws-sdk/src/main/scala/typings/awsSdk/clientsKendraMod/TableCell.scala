package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCell extends StObject {
  
  /**
    *  TRUE means that the table cell should be treated as a header.
    */
  var Header: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE means that the table cell has a high enough confidence and is relevant to the query, so the value or content should be highlighted.
    */
  var Highlighted: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE if the response of the table cell is the top answer. This is the cell value or content with the highest confidence score or is the most relevant to the query.
    */
  var TopAnswer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The actual value or content within a table cell. A table cell could contain a date value of a year, or a string value of text, for example.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object TableCell {
  
  inline def apply(): TableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableCell] (val x: Self) extends AnyVal {
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "Highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "Highlighted", js.undefined)
    
    inline def setTopAnswer(value: Boolean): Self = StObject.set(x, "TopAnswer", value.asInstanceOf[js.Any])
    
    inline def setTopAnswerUndefined: Self = StObject.set(x, "TopAnswer", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
