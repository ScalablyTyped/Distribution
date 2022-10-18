package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbInstance extends StObject {
  
  /**
    * The instance's address.
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * The DB instance identifier.
    */
  var DbInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var DbPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true if AWS OpsWorks Stacks is unable to discover the Amazon RDS instance. AWS OpsWorks Stacks attempts to discover the instance only once. If this value is set to true, you must deregister the instance, and then register it again.
    */
  var MissingOnRds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance's ARN.
    */
  var RdsDbInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the stack with which the instance is registered.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object RdsDbInstance {
  
  inline def apply(): RdsDbInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstance]
  }
  
  extension [Self <: RdsDbInstance](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setDbInstanceIdentifier(value: String): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setMissingOnRds(value: Boolean): Self = StObject.set(x, "MissingOnRds", value.asInstanceOf[js.Any])
    
    inline def setMissingOnRdsUndefined: Self = StObject.set(x, "MissingOnRds", js.undefined)
    
    inline def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setRdsDbInstanceArnUndefined: Self = StObject.set(x, "RdsDbInstanceArn", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
