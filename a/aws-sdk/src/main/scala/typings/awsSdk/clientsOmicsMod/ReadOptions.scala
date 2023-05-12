package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  /**
    * The file's comment character.
    */
  var comment: js.UndefOr[CommentChar] = js.undefined
  
  /**
    * The file's encoding.
    */
  var encoding: js.UndefOr[Encoding] = js.undefined
  
  /**
    * A character for escaping quotes in the file.
    */
  var escape: js.UndefOr[EscapeChar] = js.undefined
  
  /**
    * Whether quotes need to be escaped in the file.
    */
  var escapeQuotes: js.UndefOr[EscapeQuotes] = js.undefined
  
  /**
    * Whether the file has a header row.
    */
  var header: js.UndefOr[Header] = js.undefined
  
  /**
    * A line separator for the file.
    */
  var lineSep: js.UndefOr[LineSep] = js.undefined
  
  /**
    * The file's quote character.
    */
  var quote: js.UndefOr[Quote] = js.undefined
  
  /**
    * Whether all values need to be quoted, or just those that contain quotes.
    */
  var quoteAll: js.UndefOr[QuoteAll] = js.undefined
  
  /**
    * The file's field separator.
    */
  var sep: js.UndefOr[Separator] = js.undefined
}
object ReadOptions {
  
  inline def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    inline def setComment(value: CommentChar): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEscape(value: EscapeChar): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeQuotes(value: EscapeQuotes): Self = StObject.set(x, "escapeQuotes", value.asInstanceOf[js.Any])
    
    inline def setEscapeQuotesUndefined: Self = StObject.set(x, "escapeQuotes", js.undefined)
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setHeader(value: Header): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLineSep(value: LineSep): Self = StObject.set(x, "lineSep", value.asInstanceOf[js.Any])
    
    inline def setLineSepUndefined: Self = StObject.set(x, "lineSep", js.undefined)
    
    inline def setQuote(value: Quote): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteAll(value: QuoteAll): Self = StObject.set(x, "quoteAll", value.asInstanceOf[js.Any])
    
    inline def setQuoteAllUndefined: Self = StObject.set(x, "quoteAll", js.undefined)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setSep(value: Separator): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
    
    inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
  }
}
