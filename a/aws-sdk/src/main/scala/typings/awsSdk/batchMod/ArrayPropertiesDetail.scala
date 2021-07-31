package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPropertiesDetail extends StObject {
  
  /**
    * The job index within the array that is associated with this job. This parameter is returned for array job children.
    */
  var index: js.UndefOr[Integer] = js.undefined
  
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.undefined
  
  /**
    * A summary of the number of array job children in each available job status. This parameter is returned for parent array jobs.
    */
  var statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.undefined
}
object ArrayPropertiesDetail {
  
  @scala.inline
  def apply(): ArrayPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayPropertiesDetail]
  }
  
  @scala.inline
  implicit class ArrayPropertiesDetailMutableBuilder[Self <: ArrayPropertiesDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Integer): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatusSummary(value: ArrayJobStatusSummary): Self = StObject.set(x, "statusSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusSummaryUndefined: Self = StObject.set(x, "statusSummary", js.undefined)
  }
}
