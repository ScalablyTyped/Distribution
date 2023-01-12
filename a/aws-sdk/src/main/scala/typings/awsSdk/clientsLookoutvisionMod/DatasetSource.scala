package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSource extends StObject {
  
  /**
    * Location information for the manifest file.
    */
  var GroundTruthManifest: js.UndefOr[DatasetGroundTruthManifest] = js.undefined
}
object DatasetSource {
  
  inline def apply(): DatasetSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetSource] (val x: Self) extends AnyVal {
    
    inline def setGroundTruthManifest(value: DatasetGroundTruthManifest): Self = StObject.set(x, "GroundTruthManifest", value.asInstanceOf[js.Any])
    
    inline def setGroundTruthManifestUndefined: Self = StObject.set(x, "GroundTruthManifest", js.undefined)
  }
}
