package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoDatabaseMigrationPreference extends StObject {
  
  /**
    *  The target database engine for database migration preference that you specify. 
    */
  var targetDatabaseEngine: TargetDatabaseEngines
}
object NoDatabaseMigrationPreference {
  
  inline def apply(targetDatabaseEngine: TargetDatabaseEngines): NoDatabaseMigrationPreference = {
    val __obj = js.Dynamic.literal(targetDatabaseEngine = targetDatabaseEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoDatabaseMigrationPreference]
  }
  
  extension [Self <: NoDatabaseMigrationPreference](x: Self) {
    
    inline def setTargetDatabaseEngine(value: TargetDatabaseEngines): Self = StObject.set(x, "targetDatabaseEngine", value.asInstanceOf[js.Any])
    
    inline def setTargetDatabaseEngineVarargs(value: TargetDatabaseEngine*): Self = StObject.set(x, "targetDatabaseEngine", js.Array(value*))
  }
}
