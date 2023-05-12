package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEksClusterDetails extends StObject {
  
  /**
    * Information about the installed EKS add-on.
    */
  var AddonDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AddonDetails] = js.undefined
  
  /**
    * Name of the EKS cluster.
    */
  var ClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents all the nodes within the EKS cluster in your account.
    */
  var CompatibleNodes: js.UndefOr[Long] = js.undefined
  
  /**
    * Represents the nodes within the EKS cluster that have a HEALTHY coverage status.
    */
  var CoveredNodes: js.UndefOr[Long] = js.undefined
}
object CoverageEksClusterDetails {
  
  inline def apply(): CoverageEksClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageEksClusterDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEksClusterDetails] (val x: Self) extends AnyVal {
    
    inline def setAddonDetails(value: AddonDetails): Self = StObject.set(x, "AddonDetails", value.asInstanceOf[js.Any])
    
    inline def setAddonDetailsUndefined: Self = StObject.set(x, "AddonDetails", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setCompatibleNodes(value: Long): Self = StObject.set(x, "CompatibleNodes", value.asInstanceOf[js.Any])
    
    inline def setCompatibleNodesUndefined: Self = StObject.set(x, "CompatibleNodes", js.undefined)
    
    inline def setCoveredNodes(value: Long): Self = StObject.set(x, "CoveredNodes", value.asInstanceOf[js.Any])
    
    inline def setCoveredNodesUndefined: Self = StObject.set(x, "CoveredNodes", js.undefined)
  }
}
