package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassifierFilter extends StObject {
  
  /**
    * The name that you assigned to the document classifier
    */
  var DocumentClassifierName: js.UndefOr[ComprehendArnName] = js.undefined
  
  /**
    * Filters the list of classifiers based on status.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted after the specified time. Classifiers are returned in descending order, newest to oldest.
    */
  var SubmitTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filters the list of classifiers based on the time that the classifier was submitted for processing. Returns only classifiers submitted before the specified time. Classifiers are returned in ascending order, oldest to newest.
    */
  var SubmitTimeBefore: js.UndefOr[js.Date] = js.undefined
}
object DocumentClassifierFilter {
  
  inline def apply(): DocumentClassifierFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierFilter]
  }
  
  extension [Self <: DocumentClassifierFilter](x: Self) {
    
    inline def setDocumentClassifierName(value: ComprehendArnName): Self = StObject.set(x, "DocumentClassifierName", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierNameUndefined: Self = StObject.set(x, "DocumentClassifierName", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubmitTimeAfter(value: js.Date): Self = StObject.set(x, "SubmitTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeAfterUndefined: Self = StObject.set(x, "SubmitTimeAfter", js.undefined)
    
    inline def setSubmitTimeBefore(value: js.Date): Self = StObject.set(x, "SubmitTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeBeforeUndefined: Self = StObject.set(x, "SubmitTimeBefore", js.undefined)
  }
}
