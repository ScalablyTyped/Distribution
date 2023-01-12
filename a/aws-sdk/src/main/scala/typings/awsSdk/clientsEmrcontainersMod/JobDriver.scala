package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDriver extends StObject {
  
  /**
    * The job driver for job type.
    */
  var sparkSqlJobDriver: js.UndefOr[SparkSqlJobDriver] = js.undefined
  
  /**
    * The job driver parameters specified for spark submit.
    */
  var sparkSubmitJobDriver: js.UndefOr[SparkSubmitJobDriver] = js.undefined
}
object JobDriver {
  
  inline def apply(): JobDriver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDriver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobDriver] (val x: Self) extends AnyVal {
    
    inline def setSparkSqlJobDriver(value: SparkSqlJobDriver): Self = StObject.set(x, "sparkSqlJobDriver", value.asInstanceOf[js.Any])
    
    inline def setSparkSqlJobDriverUndefined: Self = StObject.set(x, "sparkSqlJobDriver", js.undefined)
    
    inline def setSparkSubmitJobDriver(value: SparkSubmitJobDriver): Self = StObject.set(x, "sparkSubmitJobDriver", value.asInstanceOf[js.Any])
    
    inline def setSparkSubmitJobDriverUndefined: Self = StObject.set(x, "sparkSubmitJobDriver", js.undefined)
  }
}
