package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanThreatName extends StObject {
  
  /**
    * List of infected files in EBS volume with details.
    */
  var FilePaths: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.FilePaths] = js.undefined
  
  /**
    * Total number of files infected with given threat.
    */
  var ItemCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the identified threat.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Severity of threat identified as part of the malware scan.
    */
  var Severity: js.UndefOr[String] = js.undefined
}
object ScanThreatName {
  
  inline def apply(): ScanThreatName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanThreatName]
  }
  
  extension [Self <: ScanThreatName](x: Self) {
    
    inline def setFilePaths(value: FilePaths): Self = StObject.set(x, "FilePaths", value.asInstanceOf[js.Any])
    
    inline def setFilePathsUndefined: Self = StObject.set(x, "FilePaths", js.undefined)
    
    inline def setFilePathsVarargs(value: ScanFilePath*): Self = StObject.set(x, "FilePaths", js.Array(value*))
    
    inline def setItemCount(value: Integer): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
  }
}
