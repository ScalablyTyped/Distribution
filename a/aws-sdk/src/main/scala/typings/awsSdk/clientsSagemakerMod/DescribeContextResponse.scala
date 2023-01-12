package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContextResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the context.
    */
  var ContextArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContextArn] = js.undefined
  
  /**
    * The name of the context.
    */
  var ContextName: js.UndefOr[ExperimentEntityName] = js.undefined
  
  /**
    * The type of the context.
    */
  var ContextType: js.UndefOr[String256] = js.undefined
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the context was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the context.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * When the context was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the lineage group.
    */
  var LineageGroupArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LineageGroupArn] = js.undefined
  
  /**
    * A list of the context's properties.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * The source of the context.
    */
  var Source: js.UndefOr[ContextSource] = js.undefined
}
object DescribeContextResponse {
  
  inline def apply(): DescribeContextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContextResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContextResponse] (val x: Self) extends AnyVal {
    
    inline def setContextArn(value: ContextArn): Self = StObject.set(x, "ContextArn", value.asInstanceOf[js.Any])
    
    inline def setContextArnUndefined: Self = StObject.set(x, "ContextArn", js.undefined)
    
    inline def setContextName(value: ExperimentEntityName): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
    
    inline def setContextNameUndefined: Self = StObject.set(x, "ContextName", js.undefined)
    
    inline def setContextType(value: String256): Self = StObject.set(x, "ContextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "ContextType", js.undefined)
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLineageGroupArn(value: LineageGroupArn): Self = StObject.set(x, "LineageGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLineageGroupArnUndefined: Self = StObject.set(x, "LineageGroupArn", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setSource(value: ContextSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
