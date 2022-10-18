package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentLatestVersion extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: js.UndefOr[ComponentVersionARN] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * The time at which the component was created, expressed in ISO 8601 format.
    */
  var creationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the component version.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platforms that the component version supports.
    */
  var platforms: js.UndefOr[ComponentPlatformList] = js.undefined
  
  /**
    * The publisher of the component version.
    */
  var publisher: js.UndefOr[NonEmptyString] = js.undefined
}
object ComponentLatestVersion {
  
  inline def apply(): ComponentLatestVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentLatestVersion]
  }
  
  extension [Self <: ComponentLatestVersion](x: Self) {
    
    inline def setArn(value: ComponentVersionARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPlatforms(value: ComponentPlatformList): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: ComponentPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
    
    inline def setPublisher(value: NonEmptyString): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
