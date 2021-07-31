package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLogPatternRequest extends StObject {
  
  /**
    * The name of the log pattern.
    */
  var PatternName: LogPatternName
  
  /**
    * The name of the log pattern set.
    */
  var PatternSetName: LogPatternSetName
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsSdk.applicationinsightsMod.ResourceGroupName
}
object DescribeLogPatternRequest {
  
  @scala.inline
  def apply(
    PatternName: LogPatternName,
    PatternSetName: LogPatternSetName,
    ResourceGroupName: ResourceGroupName
  ): DescribeLogPatternRequest = {
    val __obj = js.Dynamic.literal(PatternName = PatternName.asInstanceOf[js.Any], PatternSetName = PatternSetName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLogPatternRequest]
  }
  
  @scala.inline
  implicit class DescribeLogPatternRequestMutableBuilder[Self <: DescribeLogPatternRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}
