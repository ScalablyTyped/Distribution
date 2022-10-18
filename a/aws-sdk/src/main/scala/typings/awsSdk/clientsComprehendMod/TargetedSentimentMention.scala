package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedSentimentMention extends StObject {
  
  /**
    * The offset into the document text where the mention begins.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The offset into the document text where the mention ends.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The confidence that all the entities mentioned in the group relate to the same entity.
    */
  var GroupScore: js.UndefOr[Float] = js.undefined
  
  /**
    * Contains the sentiment and sentiment score for the mention.
    */
  var MentionSentiment: js.UndefOr[typings.awsSdk.clientsComprehendMod.MentionSentiment] = js.undefined
  
  /**
    * Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The text in the document that identifies the entity.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the entity. Amazon Comprehend supports a variety of entity types.
    */
  var Type: js.UndefOr[TargetedSentimentEntityType] = js.undefined
}
object TargetedSentimentMention {
  
  inline def apply(): TargetedSentimentMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedSentimentMention]
  }
  
  extension [Self <: TargetedSentimentMention](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setGroupScore(value: Float): Self = StObject.set(x, "GroupScore", value.asInstanceOf[js.Any])
    
    inline def setGroupScoreUndefined: Self = StObject.set(x, "GroupScore", js.undefined)
    
    inline def setMentionSentiment(value: MentionSentiment): Self = StObject.set(x, "MentionSentiment", value.asInstanceOf[js.Any])
    
    inline def setMentionSentimentUndefined: Self = StObject.set(x, "MentionSentiment", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setType(value: TargetedSentimentEntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
