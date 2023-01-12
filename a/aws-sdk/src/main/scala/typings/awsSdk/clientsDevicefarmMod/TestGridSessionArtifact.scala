package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestGridSessionArtifact extends StObject {
  
  /**
    * The file name of the artifact.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactType] = js.undefined
  
  /**
    * A semi-stable URL to the content of the object.
    */
  var url: js.UndefOr[SensitiveString] = js.undefined
}
object TestGridSessionArtifact {
  
  inline def apply(): TestGridSessionArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestGridSessionArtifact] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setType(value: TestGridSessionArtifactType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: SensitiveString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
