package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JdbcTarget extends StObject {
  
  /**
    * The name of the connection to use to connect to the JDBC target.
    */
  var ConnectionName: js.UndefOr[typings.awsSdk.clientsGlueMod.ConnectionName] = js.undefined
  
  /**
    * Specify a value of RAWTYPES or COMMENTS to enable additional metadata in table responses. RAWTYPES provides the native-level datatype. COMMENTS provides comments associated with a column or table in the database. If you do not need additional metadata, keep the field empty.
    */
  var EnableAdditionalMetadata: js.UndefOr[typings.awsSdk.clientsGlueMod.EnableAdditionalMetadata] = js.undefined
  
  /**
    * A list of glob patterns used to exclude from the crawl. For more information, see Catalog Tables with a Crawler.
    */
  var Exclusions: js.UndefOr[PathList] = js.undefined
  
  /**
    * The path of the JDBC target.
    */
  var Path: js.UndefOr[typings.awsSdk.clientsGlueMod.Path] = js.undefined
}
object JdbcTarget {
  
  inline def apply(): JdbcTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JdbcTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JdbcTarget] (val x: Self) extends AnyVal {
    
    inline def setConnectionName(value: ConnectionName): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setEnableAdditionalMetadata(value: EnableAdditionalMetadata): Self = StObject.set(x, "EnableAdditionalMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAdditionalMetadataUndefined: Self = StObject.set(x, "EnableAdditionalMetadata", js.undefined)
    
    inline def setEnableAdditionalMetadataVarargs(value: JdbcMetadataEntry*): Self = StObject.set(x, "EnableAdditionalMetadata", js.Array(value*))
    
    inline def setExclusions(value: PathList): Self = StObject.set(x, "Exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "Exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: Path*): Self = StObject.set(x, "Exclusions", js.Array(value*))
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
