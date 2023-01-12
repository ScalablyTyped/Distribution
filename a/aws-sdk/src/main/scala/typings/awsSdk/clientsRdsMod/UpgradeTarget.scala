package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeTarget extends StObject {
  
  /**
    * A value that indicates whether the target version is applied to any source DB instances that have AutoMinorVersionUpgrade set to true.
    */
  var AutoUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the database engine that a DB instance can be upgraded to.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the upgrade target database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the upgrade target database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A value that indicates whether upgrading to the target version requires upgrading the major version of the database engine.
    */
  var IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of the supported DB engine modes for the target engine version.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  
  /**
    * A value that indicates whether you can use Babelfish for Aurora PostgreSQL with the target engine version.
    */
  var SupportsBabelfish: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora global databases with the target engine version.
    */
  var SupportsGlobalDatabases: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora parallel query with the target engine version.
    */
  var SupportsParallelQuery: js.UndefOr[BooleanOptional] = js.undefined
}
object UpgradeTarget {
  
  inline def apply(): UpgradeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpgradeTarget] (val x: Self) extends AnyVal {
    
    inline def setAutoUpgrade(value: Boolean): Self = StObject.set(x, "AutoUpgrade", value.asInstanceOf[js.Any])
    
    inline def setAutoUpgradeUndefined: Self = StObject.set(x, "AutoUpgrade", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIsMajorVersionUpgrade(value: Boolean): Self = StObject.set(x, "IsMajorVersionUpgrade", value.asInstanceOf[js.Any])
    
    inline def setIsMajorVersionUpgradeUndefined: Self = StObject.set(x, "IsMajorVersionUpgrade", js.undefined)
    
    inline def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    inline def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value*))
    
    inline def setSupportsBabelfish(value: BooleanOptional): Self = StObject.set(x, "SupportsBabelfish", value.asInstanceOf[js.Any])
    
    inline def setSupportsBabelfishUndefined: Self = StObject.set(x, "SupportsBabelfish", js.undefined)
    
    inline def setSupportsGlobalDatabases(value: BooleanOptional): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    inline def setSupportsParallelQuery(value: BooleanOptional): Self = StObject.set(x, "SupportsParallelQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsParallelQueryUndefined: Self = StObject.set(x, "SupportsParallelQuery", js.undefined)
  }
}
