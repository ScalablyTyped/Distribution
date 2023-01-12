package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of logs provided during QoS callbacks.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVQualityOfServiceReport extends StObject {
  
  /**
    * The log showing what assets were accessed and when
    */
  var accessLog: js.UndefOr[String] = js.undefined
  
  /**
    * The log showing any playback errors.
    */
  var errorLog: js.UndefOr[String] = js.undefined
}
object ATVQualityOfServiceReport {
  
  inline def apply(): ATVQualityOfServiceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ATVQualityOfServiceReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATVQualityOfServiceReport] (val x: Self) extends AnyVal {
    
    inline def setAccessLog(value: String): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
    
    inline def setErrorLog(value: String): Self = StObject.set(x, "errorLog", value.asInstanceOf[js.Any])
    
    inline def setErrorLogUndefined: Self = StObject.set(x, "errorLog", js.undefined)
  }
}
