package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The name of the filter. The valid values for Name depend on which API operation you're using with the filter (DescribeAutoScalingGroups or DescribeTags).  DescribeAutoScalingGroups  Valid values for Name include the following:     tag-key - Accepts tag keys. The results only include information about the Auto Scaling groups associated with these tag keys.     tag-value - Accepts tag values. The results only include information about the Auto Scaling groups associated with these tag values.     tag:&lt;key&gt; - Accepts the key/value combination of the tag. Use the tag key in the filter name and the tag value as the filter value. The results only include information about the Auto Scaling groups associated with the specified key/value combination.     DescribeTags  Valid values for Name include the following:     auto-scaling-group - Accepts the names of Auto Scaling groups. The results only include information about the tags associated with these Auto Scaling groups.     key - Accepts tag keys. The results only include information about the tags associated with these tag keys.     value - Accepts tag values. The results only include information about the tags associated with these tag values.     propagate-at-launch - Accepts a Boolean value, which specifies whether tags propagate to instances at launch. The results only include information about the tags associated with the specified Boolean value.   
    */
  var Name: js.UndefOr[XmlString] = js.undefined
  
  /**
    * One or more filter values. Filter values are case-sensitive.  If you specify multiple values for a filter, the values are automatically logically joined with an OR, and the request returns all results that match any of the specified values. For example, specify "tag:environment" for the filter name and "production,development" for the filter values to find Auto Scaling groups with the tag "environment=production" or "environment=development".
    */
  var Values: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Values] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: XmlString*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
