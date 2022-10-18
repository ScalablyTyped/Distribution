package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseMigrationPreference extends StObject {
  
  /**
    *  Indicates whether you are interested in moving from one type of database to another. For example, from SQL Server to Amazon Aurora MySQL-Compatible Edition. 
    */
  var heterogeneous: js.UndefOr[Heterogeneous] = js.undefined
  
  /**
    *  Indicates whether you are interested in moving to the same type of database into AWS. For example, from SQL Server in your environment to SQL Server on AWS. 
    */
  var homogeneous: js.UndefOr[Homogeneous] = js.undefined
  
  /**
    *  Indicated that you do not prefer heterogeneous or homogeneous. 
    */
  var noPreference: js.UndefOr[NoDatabaseMigrationPreference] = js.undefined
}
object DatabaseMigrationPreference {
  
  inline def apply(): DatabaseMigrationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseMigrationPreference]
  }
  
  extension [Self <: DatabaseMigrationPreference](x: Self) {
    
    inline def setHeterogeneous(value: Heterogeneous): Self = StObject.set(x, "heterogeneous", value.asInstanceOf[js.Any])
    
    inline def setHeterogeneousUndefined: Self = StObject.set(x, "heterogeneous", js.undefined)
    
    inline def setHomogeneous(value: Homogeneous): Self = StObject.set(x, "homogeneous", value.asInstanceOf[js.Any])
    
    inline def setHomogeneousUndefined: Self = StObject.set(x, "homogeneous", js.undefined)
    
    inline def setNoPreference(value: NoDatabaseMigrationPreference): Self = StObject.set(x, "noPreference", value.asInstanceOf[js.Any])
    
    inline def setNoPreferenceUndefined: Self = StObject.set(x, "noPreference", js.undefined)
  }
}
