package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedResultsItem extends StObject {
  
  /**
    * One or more additional attributes associated with the featured result.
    */
  var AdditionalAttributes: js.UndefOr[AdditionalResultAttributeList] = js.undefined
  
  /**
    * An array of document attributes assigned to a featured document in the search results. For example, the document author (_author) or the source URI (_source_uri) of the document.
    */
  var DocumentAttributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  var DocumentExcerpt: js.UndefOr[TextWithHighlights] = js.undefined
  
  /**
    * The identifier of the featured document.
    */
  var DocumentId: js.UndefOr[typings.awsSdk.clientsKendraMod.DocumentId] = js.undefined
  
  var DocumentTitle: js.UndefOr[TextWithHighlights] = js.undefined
  
  /**
    * The source URI location of the featured document.
    */
  var DocumentURI: js.UndefOr[Url] = js.undefined
  
  /**
    * A token that identifies a particular featured result from a particular query. Use this token to provide click-through feedback for the result. For more information, see Submitting feedback.
    */
  var FeedbackToken: js.UndefOr[typings.awsSdk.clientsKendraMod.FeedbackToken] = js.undefined
  
  /**
    * The identifier of the featured result.
    */
  var Id: js.UndefOr[ResultId] = js.undefined
  
  /**
    * The type of document within the featured result response. For example, a response could include a question-answer type that's relevant to the query.
    */
  var Type: js.UndefOr[QueryResultType] = js.undefined
}
object FeaturedResultsItem {
  
  inline def apply(): FeaturedResultsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedResultsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedResultsItem] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAttributes(value: AdditionalResultAttributeList): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    inline def setAdditionalAttributesVarargs(value: AdditionalResultAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value*))
    
    inline def setDocumentAttributes(value: DocumentAttributeList): Self = StObject.set(x, "DocumentAttributes", value.asInstanceOf[js.Any])
    
    inline def setDocumentAttributesUndefined: Self = StObject.set(x, "DocumentAttributes", js.undefined)
    
    inline def setDocumentAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "DocumentAttributes", js.Array(value*))
    
    inline def setDocumentExcerpt(value: TextWithHighlights): Self = StObject.set(x, "DocumentExcerpt", value.asInstanceOf[js.Any])
    
    inline def setDocumentExcerptUndefined: Self = StObject.set(x, "DocumentExcerpt", js.undefined)
    
    inline def setDocumentId(value: DocumentId): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setDocumentTitle(value: TextWithHighlights): Self = StObject.set(x, "DocumentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "DocumentTitle", js.undefined)
    
    inline def setDocumentURI(value: Url): Self = StObject.set(x, "DocumentURI", value.asInstanceOf[js.Any])
    
    inline def setDocumentURIUndefined: Self = StObject.set(x, "DocumentURI", js.undefined)
    
    inline def setFeedbackToken(value: FeedbackToken): Self = StObject.set(x, "FeedbackToken", value.asInstanceOf[js.Any])
    
    inline def setFeedbackTokenUndefined: Self = StObject.set(x, "FeedbackToken", js.undefined)
    
    inline def setId(value: ResultId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setType(value: QueryResultType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
