package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringJsonDatasetFormat extends StObject {
  
  /**
    * Indicates if the file should be read as a json object per line. 
    */
  var Line: js.UndefOr[Boolean] = js.undefined
}
object MonitoringJsonDatasetFormat {
  
  inline def apply(): MonitoringJsonDatasetFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringJsonDatasetFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringJsonDatasetFormat] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Boolean): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
  }
}
