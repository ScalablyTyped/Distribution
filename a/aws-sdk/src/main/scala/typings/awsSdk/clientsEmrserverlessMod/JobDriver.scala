package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDriver extends StObject {
  
  /**
    * The job driver parameters specified for Hive.
    */
  var hive: js.UndefOr[Hive] = js.undefined
  
  /**
    * The job driver parameters specified for Spark.
    */
  var sparkSubmit: js.UndefOr[SparkSubmit] = js.undefined
}
object JobDriver {
  
  inline def apply(): JobDriver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDriver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobDriver] (val x: Self) extends AnyVal {
    
    inline def setHive(value: Hive): Self = StObject.set(x, "hive", value.asInstanceOf[js.Any])
    
    inline def setHiveUndefined: Self = StObject.set(x, "hive", js.undefined)
    
    inline def setSparkSubmit(value: SparkSubmit): Self = StObject.set(x, "sparkSubmit", value.asInstanceOf[js.Any])
    
    inline def setSparkSubmitUndefined: Self = StObject.set(x, "sparkSubmit", js.undefined)
  }
}
