package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.DRAFT
import typings.appBuilderLib.appBuilderLibStrings.PUBLISHED
import typings.appBuilderLib.appBuilderLibStrings.YANKED
import typings.appBuilderLib.appBuilderLibStrings.alpha
import typings.appBuilderLib.appBuilderLibStrings.beta
import typings.appBuilderLib.appBuilderLibStrings.dev
import typings.appBuilderLib.appBuilderLibStrings.rc
import typings.appBuilderLib.appBuilderLibStrings.stable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: stable | rc | beta | alpha | dev
  
  var created: String
  
  var description: String | Null
  
  var metadata: StringDictionary[Any]
  
  var name: String | Null
  
  var semver: Build
  
  var status: DRAFT | PUBLISHED | YANKED
  
  var tag: String
  
  var updated: String
  
  var version: String
  
  var yanked: String | Null
}
object Channel {
  
  inline def apply(
    channel: stable | rc | beta | alpha | dev,
    created: String,
    metadata: StringDictionary[Any],
    semver: Build,
    status: DRAFT | PUBLISHED | YANKED,
    tag: String,
    updated: String,
    version: String
  ): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], semver = semver.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], description = null, name = null, yanked = null)
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: stable | rc | beta | alpha | dev): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setSemver(value: Build): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DRAFT | PUBLISHED | YANKED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setYanked(value: String): Self = StObject.set(x, "yanked", value.asInstanceOf[js.Any])
    
    inline def setYankedNull: Self = StObject.set(x, "yanked", null)
  }
}
