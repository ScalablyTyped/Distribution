package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateEncryptionKeyResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object RotateEncryptionKeyResult {
  
  inline def apply(): RotateEncryptionKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateEncryptionKeyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotateEncryptionKeyResult] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
