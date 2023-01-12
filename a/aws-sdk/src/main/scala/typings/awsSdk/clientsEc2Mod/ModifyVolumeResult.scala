package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVolumeResult extends StObject {
  
  /**
    * Information about the volume modification.
    */
  var VolumeModification: js.UndefOr[typings.awsSdk.clientsEc2Mod.VolumeModification] = js.undefined
}
object ModifyVolumeResult {
  
  inline def apply(): ModifyVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVolumeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVolumeResult] (val x: Self) extends AnyVal {
    
    inline def setVolumeModification(value: VolumeModification): Self = StObject.set(x, "VolumeModification", value.asInstanceOf[js.Any])
    
    inline def setVolumeModificationUndefined: Self = StObject.set(x, "VolumeModification", js.undefined)
  }
}
