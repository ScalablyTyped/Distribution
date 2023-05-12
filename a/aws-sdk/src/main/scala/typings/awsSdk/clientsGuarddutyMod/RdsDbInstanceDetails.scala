package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbInstanceDetails extends StObject {
  
  /**
    * The identifier of the database cluster that contains the database instance ID involved in the finding.
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the database instance involved in the finding.
    */
  var DbInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier associated to the database instance that was involved in the finding.
    */
  var DbInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine of the database instance involved in the finding.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the database engine that was involved in the finding.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Instance tag key-value pairs associated with the database instance ID.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Tags] = js.undefined
}
object RdsDbInstanceDetails {
  
  inline def apply(): RdsDbInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbInstanceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsDbInstanceDetails] (val x: Self) extends AnyVal {
    
    inline def setDbClusterIdentifier(value: String): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbClusterIdentifierUndefined: Self = StObject.set(x, "DbClusterIdentifier", js.undefined)
    
    inline def setDbInstanceArn(value: String): Self = StObject.set(x, "DbInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceArnUndefined: Self = StObject.set(x, "DbInstanceArn", js.undefined)
    
    inline def setDbInstanceIdentifier(value: String): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
