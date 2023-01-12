package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentRequest extends StObject {
  
  /**
    * An optional description for this segment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A name for the segment.
    */
  var name: SegmentName
  
  /**
    * The pattern to use for the segment. For more information about pattern syntax, see  Segment rule pattern syntax.
    */
  var pattern: SegmentPattern
  
  /**
    * Assigns one or more tags (key-value pairs) to the segment. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with a segment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSegmentRequest {
  
  inline def apply(name: SegmentName, pattern: SegmentPattern): CreateSegmentRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSegmentRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: SegmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: SegmentPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
