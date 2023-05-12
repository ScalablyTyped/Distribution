package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeSpecification extends StObject {
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var SizeInGB: Integer
  
  /**
    * The throughput, in mebibyte per second (MiB/s). This optional parameter can be a number from 125 - 1000 and is valid only for gp3 volumes.
    */
  var Throughput: js.UndefOr[ThroughputVal] = js.undefined
  
  /**
    * The volume type. Volume types supported are gp3, gp2, io1, st1, sc1, and standard.
    */
  var VolumeType: String
}
object VolumeSpecification {
  
  inline def apply(SizeInGB: Integer, VolumeType: String): VolumeSpecification = {
    val __obj = js.Dynamic.literal(SizeInGB = SizeInGB.asInstanceOf[js.Any], VolumeType = VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeSpecification] (val x: Self) extends AnyVal {
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setSizeInGB(value: Integer): Self = StObject.set(x, "SizeInGB", value.asInstanceOf[js.Any])
    
    inline def setThroughput(value: ThroughputVal): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
  }
}
