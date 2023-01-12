package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsOutput extends StObject {
  
  /**
    *  A list of ImportSummary objects. 
    */
  var ImportSummaryList: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ImportSummaryList] = js.undefined
  
  /**
    *  If this value is returned, there are additional results to be displayed. To retrieve them, call ListImports again, with NextToken set to this value. 
    */
  var NextToken: js.UndefOr[ImportNextToken] = js.undefined
}
object ListImportsOutput {
  
  inline def apply(): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsOutput] (val x: Self) extends AnyVal {
    
    inline def setImportSummaryList(value: ImportSummaryList): Self = StObject.set(x, "ImportSummaryList", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryListUndefined: Self = StObject.set(x, "ImportSummaryList", js.undefined)
    
    inline def setImportSummaryListVarargs(value: ImportSummary*): Self = StObject.set(x, "ImportSummaryList", js.Array(value*))
    
    inline def setNextToken(value: ImportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
