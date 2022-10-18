package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChapCredentialsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.clientsStoragegatewayMod.TargetARN
}
object DescribeChapCredentialsInput {
  
  inline def apply(TargetARN: TargetARN): DescribeChapCredentialsInput = {
    val __obj = js.Dynamic.literal(TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChapCredentialsInput]
  }
  
  extension [Self <: DescribeChapCredentialsInput](x: Self) {
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
  }
}
