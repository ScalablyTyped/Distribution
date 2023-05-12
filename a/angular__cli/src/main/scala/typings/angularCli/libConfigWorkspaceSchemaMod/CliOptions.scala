package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CliOptions extends StObject {
  
  /**
    * Share pseudonymous usage data with the Angular Team at Google.
    */
  var analytics: js.UndefOr[Analytics] = js.undefined
  
  /**
    * Control disk cache.
    */
  var cache: js.UndefOr[Cache] = js.undefined
  
  /**
    * Specify which package manager tool to use.
    */
  var packageManager: js.UndefOr[PackageManager] = js.undefined
  
  /**
    * The list of schematic collections to use.
    */
  var schematicCollections: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Control CLI specific console warnings
    */
  var warnings: js.UndefOr[Warnings] = js.undefined
}
object CliOptions {
  
  inline def apply(): CliOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CliOptions] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setSchematicCollections(value: js.Array[String]): Self = StObject.set(x, "schematicCollections", value.asInstanceOf[js.Any])
    
    inline def setSchematicCollectionsUndefined: Self = StObject.set(x, "schematicCollections", js.undefined)
    
    inline def setSchematicCollectionsVarargs(value: String*): Self = StObject.set(x, "schematicCollections", js.Array(value*))
    
    inline def setWarnings(value: Warnings): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
