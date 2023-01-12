package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomDataIdentifierResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom data identifier.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
    */
  var deleted: js.UndefOr[boolean] = js.undefined
  
  /**
    * The custom description of the custom data identifier.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the custom data identifier.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression contains any string in this array, Amazon Macie ignores it. Ignore words are case sensitive.
    */
  var ignoreWords: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An array that lists specific character sequences (keywords), one of which must precede and be within proximity (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
    */
  var keywords: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The maximum number of characters that can exist between the end of at least one complete character sequence specified by the keywords array and the end of the text that matches the regex pattern. If a complete keyword precedes all the text that matches the pattern and the keyword is within the specified distance, Amazon Macie includes the result. Otherwise, Macie excludes the result.
    */
  var maximumMatchDistance: js.UndefOr[integer] = js.undefined
  
  /**
    * The custom name of the custom data identifier.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The regular expression (regex) that defines the pattern to match.
    */
  var regex: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies the severity that's assigned to findings that the custom data identifier produces, based on the number of occurrences of text that matches the custom data identifier's detection criteria. By default, Amazon Macie creates findings for S3 objects that contain at least one occurrence of text that matches the detection criteria, and Macie assigns the MEDIUM severity to those findings.
    */
  var severityLevels: js.UndefOr[SeverityLevelList] = js.undefined
  
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data identifier.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetCustomDataIdentifierResponse {
  
  inline def apply(): GetCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomDataIdentifierResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCustomDataIdentifierResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDeleted(value: boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIgnoreWords(value: listOfString): Self = StObject.set(x, "ignoreWords", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWordsUndefined: Self = StObject.set(x, "ignoreWords", js.undefined)
    
    inline def setIgnoreWordsVarargs(value: string*): Self = StObject.set(x, "ignoreWords", js.Array(value*))
    
    inline def setKeywords(value: listOfString): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: string*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setMaximumMatchDistance(value: integer): Self = StObject.set(x, "maximumMatchDistance", value.asInstanceOf[js.Any])
    
    inline def setMaximumMatchDistanceUndefined: Self = StObject.set(x, "maximumMatchDistance", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegex(value: string): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setSeverityLevels(value: SeverityLevelList): Self = StObject.set(x, "severityLevels", value.asInstanceOf[js.Any])
    
    inline def setSeverityLevelsUndefined: Self = StObject.set(x, "severityLevels", js.undefined)
    
    inline def setSeverityLevelsVarargs(value: SeverityLevel*): Self = StObject.set(x, "severityLevels", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
