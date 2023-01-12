package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StagingSourceServer extends StObject {
  
  /**
    * The ARN of the source server.
    */
  var arn: js.UndefOr[SourceServerARN] = js.undefined
  
  /**
    * Hostname of staging source server.
    */
  var hostname: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * A list of tags associated with the staging source server.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object StagingSourceServer {
  
  inline def apply(): StagingSourceServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StagingSourceServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StagingSourceServer] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SourceServerARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setHostname(value: BoundedString): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
