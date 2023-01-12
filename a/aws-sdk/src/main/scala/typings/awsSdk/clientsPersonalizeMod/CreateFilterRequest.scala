package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFilterRequest extends StObject {
  
  /**
    * The ARN of the dataset group that the filter will belong to.
    */
  var datasetGroupArn: Arn
  
  /**
    * The filter expression defines which items are included or excluded from recommendations. Filter expression must follow specific format rules. For information about filter expression structure and syntax, see Filter expressions.
    */
  var filterExpression: FilterExpression
  
  /**
    * The name of the filter to create.
    */
  var name: Name
  
  /**
    * A list of tags to apply to the filter.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateFilterRequest {
  
  inline def apply(datasetGroupArn: Arn, filterExpression: FilterExpression, name: Name): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], filterExpression = filterExpression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setFilterExpression(value: FilterExpression): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
