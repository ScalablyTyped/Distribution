package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisConfigMap
  extends StObject
     with StreamConfigBaseMap {
  
  var kinesisStreamName: js.UndefOr[String | Null] = js.undefined
}
object KinesisConfigMap {
  
  inline def apply(): KinesisConfigMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisConfigMap]
  }
  
  extension [Self <: KinesisConfigMap](x: Self) {
    
    inline def setKinesisStreamName(value: String): Self = StObject.set(x, "kinesisStreamName", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamNameNull: Self = StObject.set(x, "kinesisStreamName", null)
    
    inline def setKinesisStreamNameUndefined: Self = StObject.set(x, "kinesisStreamName", js.undefined)
  }
}
