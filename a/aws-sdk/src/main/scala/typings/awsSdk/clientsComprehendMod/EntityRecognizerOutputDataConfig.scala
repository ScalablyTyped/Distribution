package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerOutputDataConfig extends StObject {
  
  /**
    * The Amazon S3 prefix for the data lake location of the flywheel statistics.
    */
  var FlywheelStatsS3Prefix: js.UndefOr[S3Uri] = js.undefined
}
object EntityRecognizerOutputDataConfig {
  
  inline def apply(): EntityRecognizerOutputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerOutputDataConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityRecognizerOutputDataConfig] (val x: Self) extends AnyVal {
    
    inline def setFlywheelStatsS3Prefix(value: S3Uri): Self = StObject.set(x, "FlywheelStatsS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setFlywheelStatsS3PrefixUndefined: Self = StObject.set(x, "FlywheelStatsS3Prefix", js.undefined)
  }
}
