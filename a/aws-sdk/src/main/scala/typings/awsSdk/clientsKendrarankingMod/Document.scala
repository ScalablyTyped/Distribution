package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  /**
    * The body text of the search service's document.
    */
  var Body: js.UndefOr[DocumentBody] = js.undefined
  
  /**
    * The optional group identifier of the document from the search service. Documents with the same group identifier are grouped together and processed as one document within the service.
    */
  var GroupId: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.GroupId] = js.undefined
  
  /**
    * The identifier of the document from the search service.
    */
  var Id: DocumentId
  
  /**
    * The original document score or rank from the search service. Amazon Kendra Intelligent Ranking gives the document a new score or rank based on its intelligent search algorithms.
    */
  var OriginalScore: Float
  
  /**
    * The title of the search service's document.
    */
  var Title: js.UndefOr[DocumentTitle] = js.undefined
  
  /**
    * The body text of the search service's document represented as a list of tokens or words. You must choose to provide Body or TokenizedBody. You cannot provide both.
    */
  var TokenizedBody: js.UndefOr[BodyTokensList] = js.undefined
  
  /**
    * The title of the search service's document represented as a list of tokens or words. You must choose to provide Title or TokenizedTitle. You cannot provide both.
    */
  var TokenizedTitle: js.UndefOr[TitleTokensList] = js.undefined
}
object Document {
  
  inline def apply(Id: DocumentId, OriginalScore: Float): Document = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OriginalScore = OriginalScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setBody(value: DocumentBody): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setGroupId(value: GroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOriginalScore(value: Float): Self = StObject.set(x, "OriginalScore", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: DocumentTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setTokenizedBody(value: BodyTokensList): Self = StObject.set(x, "TokenizedBody", value.asInstanceOf[js.Any])
    
    inline def setTokenizedBodyUndefined: Self = StObject.set(x, "TokenizedBody", js.undefined)
    
    inline def setTokenizedBodyVarargs(value: Tokens*): Self = StObject.set(x, "TokenizedBody", js.Array(value*))
    
    inline def setTokenizedTitle(value: TitleTokensList): Self = StObject.set(x, "TokenizedTitle", value.asInstanceOf[js.Any])
    
    inline def setTokenizedTitleUndefined: Self = StObject.set(x, "TokenizedTitle", js.undefined)
    
    inline def setTokenizedTitleVarargs(value: Tokens*): Self = StObject.set(x, "TokenizedTitle", js.Array(value*))
  }
}
