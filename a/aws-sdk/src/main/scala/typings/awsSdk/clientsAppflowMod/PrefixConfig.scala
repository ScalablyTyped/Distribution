package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixConfig extends StObject {
  
  /**
    * Specifies whether the destination file path includes either or both of the following elements:  EXECUTION_ID  The ID that Amazon AppFlow assigns to the flow run.  SCHEMA_VERSION  The version number of your data schema. Amazon AppFlow assigns this version number. The version number increases by one when you change any of the following settings in your flow configuration:   Source-to-destination field mappings   Field data types   Partition keys    
    */
  var pathPrefixHierarchy: js.UndefOr[PathPrefixHierarchy] = js.undefined
  
  /**
    * Determines the level of granularity for the date and time that's included in the prefix. 
    */
  var prefixFormat: js.UndefOr[PrefixFormat] = js.undefined
  
  /**
    * Determines the format of the prefix, and whether it applies to the file name, file path, or both. 
    */
  var prefixType: js.UndefOr[PrefixType] = js.undefined
}
object PrefixConfig {
  
  inline def apply(): PrefixConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrefixConfig] (val x: Self) extends AnyVal {
    
    inline def setPathPrefixHierarchy(value: PathPrefixHierarchy): Self = StObject.set(x, "pathPrefixHierarchy", value.asInstanceOf[js.Any])
    
    inline def setPathPrefixHierarchyUndefined: Self = StObject.set(x, "pathPrefixHierarchy", js.undefined)
    
    inline def setPathPrefixHierarchyVarargs(value: PathPrefix*): Self = StObject.set(x, "pathPrefixHierarchy", js.Array(value*))
    
    inline def setPrefixFormat(value: PrefixFormat): Self = StObject.set(x, "prefixFormat", value.asInstanceOf[js.Any])
    
    inline def setPrefixFormatUndefined: Self = StObject.set(x, "prefixFormat", js.undefined)
    
    inline def setPrefixType(value: PrefixType): Self = StObject.set(x, "prefixType", value.asInstanceOf[js.Any])
    
    inline def setPrefixTypeUndefined: Self = StObject.set(x, "prefixType", js.undefined)
  }
}
