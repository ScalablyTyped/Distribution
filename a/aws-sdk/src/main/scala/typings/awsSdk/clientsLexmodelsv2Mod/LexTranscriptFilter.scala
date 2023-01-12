package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexTranscriptFilter extends StObject {
  
  /**
    * The object that contains a date range filter that will be applied to the transcript. Specify this object if you want Amazon Lex to only read the files that are within the date range.
    */
  var dateRangeFilter: js.UndefOr[DateRangeFilter] = js.undefined
}
object LexTranscriptFilter {
  
  inline def apply(): LexTranscriptFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexTranscriptFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexTranscriptFilter] (val x: Self) extends AnyVal {
    
    inline def setDateRangeFilter(value: DateRangeFilter): Self = StObject.set(x, "dateRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setDateRangeFilterUndefined: Self = StObject.set(x, "dateRangeFilter", js.undefined)
  }
}
