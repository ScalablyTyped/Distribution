package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProposedSegmentChange extends StObject {
  
  /**
    * The rule number in the policy document that applies to this change.
    */
  var AttachmentPolicyRuleNumber: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the segment to change.
    */
  var SegmentName: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The list of key-value tags that changed for the segment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ProposedSegmentChange {
  
  inline def apply(): ProposedSegmentChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProposedSegmentChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProposedSegmentChange] (val x: Self) extends AnyVal {
    
    inline def setAttachmentPolicyRuleNumber(value: Integer): Self = StObject.set(x, "AttachmentPolicyRuleNumber", value.asInstanceOf[js.Any])
    
    inline def setAttachmentPolicyRuleNumberUndefined: Self = StObject.set(x, "AttachmentPolicyRuleNumber", js.undefined)
    
    inline def setSegmentName(value: ConstrainedString): Self = StObject.set(x, "SegmentName", value.asInstanceOf[js.Any])
    
    inline def setSegmentNameUndefined: Self = StObject.set(x, "SegmentName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
