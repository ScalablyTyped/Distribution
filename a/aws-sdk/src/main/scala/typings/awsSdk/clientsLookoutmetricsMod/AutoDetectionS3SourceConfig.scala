package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDetectionS3SourceConfig extends StObject {
  
  /**
    * The config's historical data path list.
    */
  var HistoricalDataPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.HistoricalDataPathList] = js.undefined
  
  /**
    * The config's templated path list.
    */
  var TemplatedPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.TemplatedPathList] = js.undefined
}
object AutoDetectionS3SourceConfig {
  
  inline def apply(): AutoDetectionS3SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDetectionS3SourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoDetectionS3SourceConfig] (val x: Self) extends AnyVal {
    
    inline def setHistoricalDataPathList(value: HistoricalDataPathList): Self = StObject.set(x, "HistoricalDataPathList", value.asInstanceOf[js.Any])
    
    inline def setHistoricalDataPathListUndefined: Self = StObject.set(x, "HistoricalDataPathList", js.undefined)
    
    inline def setHistoricalDataPathListVarargs(value: HistoricalDataPath*): Self = StObject.set(x, "HistoricalDataPathList", js.Array(value*))
    
    inline def setTemplatedPathList(value: TemplatedPathList): Self = StObject.set(x, "TemplatedPathList", value.asInstanceOf[js.Any])
    
    inline def setTemplatedPathListUndefined: Self = StObject.set(x, "TemplatedPathList", js.undefined)
    
    inline def setTemplatedPathListVarargs(value: TemplatedPath*): Self = StObject.set(x, "TemplatedPathList", js.Array(value*))
  }
}
