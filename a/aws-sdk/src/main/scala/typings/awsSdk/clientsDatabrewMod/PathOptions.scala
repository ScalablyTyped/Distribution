package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOptions extends StObject {
  
  /**
    * If provided, this structure imposes a limit on a number of files that should be selected.
    */
  var FilesLimit: js.UndefOr[typings.awsSdk.clientsDatabrewMod.FilesLimit] = js.undefined
  
  /**
    * If provided, this structure defines a date range for matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3.
    */
  var LastModifiedDateCondition: js.UndefOr[FilterExpression] = js.undefined
  
  /**
    * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their definitions.
    */
  var Parameters: js.UndefOr[PathParametersMap] = js.undefined
}
object PathOptions {
  
  inline def apply(): PathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOptions] (val x: Self) extends AnyVal {
    
    inline def setFilesLimit(value: FilesLimit): Self = StObject.set(x, "FilesLimit", value.asInstanceOf[js.Any])
    
    inline def setFilesLimitUndefined: Self = StObject.set(x, "FilesLimit", js.undefined)
    
    inline def setLastModifiedDateCondition(value: FilterExpression): Self = StObject.set(x, "LastModifiedDateCondition", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateConditionUndefined: Self = StObject.set(x, "LastModifiedDateCondition", js.undefined)
    
    inline def setParameters(value: PathParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
