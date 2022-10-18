package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceProperties extends StObject {
  
  /**
    * An array of CPUs.
    */
  var cpus: js.UndefOr[Cpus] = js.undefined
  
  /**
    * An array of disks.
    */
  var disks: js.UndefOr[RecoveryInstanceDisks] = js.undefined
  
  /**
    * Hints used to uniquely identify a machine.
    */
  var identificationHints: js.UndefOr[IdentificationHints] = js.undefined
  
  /**
    * The date and time the Recovery Instance properties were last updated on.
    */
  var lastUpdatedDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * An array of network interfaces.
    */
  var networkInterfaces: js.UndefOr[NetworkInterfaces] = js.undefined
  
  /**
    * Operating system.
    */
  var os: js.UndefOr[OS] = js.undefined
  
  /**
    * The amount of RAM in bytes.
    */
  var ramBytes: js.UndefOr[PositiveInteger] = js.undefined
}
object RecoveryInstanceProperties {
  
  inline def apply(): RecoveryInstanceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceProperties]
  }
  
  extension [Self <: RecoveryInstanceProperties](x: Self) {
    
    inline def setCpus(value: Cpus): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setCpusVarargs(value: CPU*): Self = StObject.set(x, "cpus", js.Array(value*))
    
    inline def setDisks(value: RecoveryInstanceDisks): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setDisksVarargs(value: RecoveryInstanceDisk*): Self = StObject.set(x, "disks", js.Array(value*))
    
    inline def setIdentificationHints(value: IdentificationHints): Self = StObject.set(x, "identificationHints", value.asInstanceOf[js.Any])
    
    inline def setIdentificationHintsUndefined: Self = StObject.set(x, "identificationHints", js.undefined)
    
    inline def setLastUpdatedDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setNetworkInterfaces(value: NetworkInterfaces): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value*))
    
    inline def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
    
    inline def setRamBytes(value: PositiveInteger): Self = StObject.set(x, "ramBytes", value.asInstanceOf[js.Any])
    
    inline def setRamBytesUndefined: Self = StObject.set(x, "ramBytes", js.undefined)
  }
}
