package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusConfigMap extends StObject {
  
  var statusLevel: js.UndefOr[StatusLevelMap] = js.undefined
  
  var statusStreamName: js.UndefOr[String] = js.undefined
}
object StatusConfigMap {
  
  inline def apply(): StatusConfigMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusConfigMap]
  }
  
  extension [Self <: StatusConfigMap](x: Self) {
    
    inline def setStatusLevel(value: StatusLevelMap): Self = StObject.set(x, "statusLevel", value.asInstanceOf[js.Any])
    
    inline def setStatusLevelUndefined: Self = StObject.set(x, "statusLevel", js.undefined)
    
    inline def setStatusStreamName(value: String): Self = StObject.set(x, "statusStreamName", value.asInstanceOf[js.Any])
    
    inline def setStatusStreamNameUndefined: Self = StObject.set(x, "statusStreamName", js.undefined)
  }
}
