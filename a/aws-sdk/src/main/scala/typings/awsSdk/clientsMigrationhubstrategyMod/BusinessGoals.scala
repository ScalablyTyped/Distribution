package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessGoals extends StObject {
  
  /**
    *  Business goal to reduce license costs. 
    */
  var licenseCostReduction: js.UndefOr[BusinessGoalsInteger] = js.undefined
  
  /**
    *  Business goal to modernize infrastructure by moving to cloud native technologies. 
    */
  var modernizeInfrastructureWithCloudNativeTechnologies: js.UndefOr[BusinessGoalsInteger] = js.undefined
  
  /**
    *  Business goal to reduce the operational overhead on the team by moving into managed services. 
    */
  var reduceOperationalOverheadWithManagedServices: js.UndefOr[BusinessGoalsInteger] = js.undefined
  
  /**
    *  Business goal to achieve migration at a fast pace. 
    */
  var speedOfMigration: js.UndefOr[BusinessGoalsInteger] = js.undefined
}
object BusinessGoals {
  
  inline def apply(): BusinessGoals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessGoals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BusinessGoals] (val x: Self) extends AnyVal {
    
    inline def setLicenseCostReduction(value: BusinessGoalsInteger): Self = StObject.set(x, "licenseCostReduction", value.asInstanceOf[js.Any])
    
    inline def setLicenseCostReductionUndefined: Self = StObject.set(x, "licenseCostReduction", js.undefined)
    
    inline def setModernizeInfrastructureWithCloudNativeTechnologies(value: BusinessGoalsInteger): Self = StObject.set(x, "modernizeInfrastructureWithCloudNativeTechnologies", value.asInstanceOf[js.Any])
    
    inline def setModernizeInfrastructureWithCloudNativeTechnologiesUndefined: Self = StObject.set(x, "modernizeInfrastructureWithCloudNativeTechnologies", js.undefined)
    
    inline def setReduceOperationalOverheadWithManagedServices(value: BusinessGoalsInteger): Self = StObject.set(x, "reduceOperationalOverheadWithManagedServices", value.asInstanceOf[js.Any])
    
    inline def setReduceOperationalOverheadWithManagedServicesUndefined: Self = StObject.set(x, "reduceOperationalOverheadWithManagedServices", js.undefined)
    
    inline def setSpeedOfMigration(value: BusinessGoalsInteger): Self = StObject.set(x, "speedOfMigration", value.asInstanceOf[js.Any])
    
    inline def setSpeedOfMigrationUndefined: Self = StObject.set(x, "speedOfMigration", js.undefined)
  }
}
