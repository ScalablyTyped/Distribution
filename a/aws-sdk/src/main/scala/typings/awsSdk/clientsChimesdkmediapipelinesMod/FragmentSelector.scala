package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentSelector extends StObject {
  
  /**
    * The origin of the timestamps to use, Server or Producer. For more information, see StartSelectorType in the Amazon Kinesis Video Streams Developer Guide.
    */
  var FragmentSelectorType: typings.awsSdk.clientsChimesdkmediapipelinesMod.FragmentSelectorType
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typings.awsSdk.clientsChimesdkmediapipelinesMod.TimestampRange
}
object FragmentSelector {
  
  inline def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentSelector] (val x: Self) extends AnyVal {
    
    inline def setFragmentSelectorType(value: FragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setTimestampRange(value: TimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
  }
}
