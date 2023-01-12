package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Occurrences extends StObject {
  
  /**
    * Occurrences of sensitive data detected in Microsoft Excel workbooks, comma-separated value (CSV) files, or tab-separated value (TSV) files.
    */
  var Cells: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Cells] = js.undefined
  
  /**
    * Occurrences of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text files include files such as HTML, XML, JSON, and TXT files.
    */
  var LineRanges: js.UndefOr[Ranges] = js.undefined
  
  /**
    * Occurrences of sensitive data detected in a binary text file.
    */
  var OffsetRanges: js.UndefOr[Ranges] = js.undefined
  
  /**
    * Occurrences of sensitive data in an Adobe Portable Document Format (PDF) file.
    */
  var Pages: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Pages] = js.undefined
  
  /**
    * Occurrences of sensitive data in an Apache Avro object container or an Apache Parquet file.
    */
  var Records: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.Records] = js.undefined
}
object Occurrences {
  
  inline def apply(): Occurrences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Occurrences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Occurrences] (val x: Self) extends AnyVal {
    
    inline def setCells(value: Cells): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: Cell*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setLineRanges(value: Ranges): Self = StObject.set(x, "LineRanges", value.asInstanceOf[js.Any])
    
    inline def setLineRangesUndefined: Self = StObject.set(x, "LineRanges", js.undefined)
    
    inline def setLineRangesVarargs(value: Range*): Self = StObject.set(x, "LineRanges", js.Array(value*))
    
    inline def setOffsetRanges(value: Ranges): Self = StObject.set(x, "OffsetRanges", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangesUndefined: Self = StObject.set(x, "OffsetRanges", js.undefined)
    
    inline def setOffsetRangesVarargs(value: Range*): Self = StObject.set(x, "OffsetRanges", js.Array(value*))
    
    inline def setPages(value: Pages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "Pages", js.Array(value*))
    
    inline def setRecords(value: Records): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "Records", js.undefined)
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
