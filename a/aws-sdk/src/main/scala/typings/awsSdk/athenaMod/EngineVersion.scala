package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineVersion extends StObject {
  
  /**
    * Read only. The engine version on which the query runs. If the user requests a valid engine version other than Auto, the effective engine version is the same as the engine version that the user requested. If the user requests Auto, the effective engine version is chosen by Athena. When a request to update the engine version is made by a CreateWorkGroup or UpdateWorkGroup operation, the EffectiveEngineVersion field is ignored.
    */
  var EffectiveEngineVersion: js.UndefOr[NameString] = js.undefined
  
  /**
    * The engine version requested by the user. Possible values are determined by the output of ListEngineVersions, including Auto. The default is Auto.
    */
  var SelectedEngineVersion: js.UndefOr[NameString] = js.undefined
}
object EngineVersion {
  
  inline def apply(): EngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineVersion]
  }
  
  extension [Self <: EngineVersion](x: Self) {
    
    inline def setEffectiveEngineVersion(value: NameString): Self = StObject.set(x, "EffectiveEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEffectiveEngineVersionUndefined: Self = StObject.set(x, "EffectiveEngineVersion", js.undefined)
    
    inline def setSelectedEngineVersion(value: NameString): Self = StObject.set(x, "SelectedEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setSelectedEngineVersionUndefined: Self = StObject.set(x, "SelectedEngineVersion", js.undefined)
  }
}
