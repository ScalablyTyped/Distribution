package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counters extends StObject {
  
  /**
    * The number of errored entities.
    */
  var errored: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of failed entities.
    */
  var failed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of passed entities.
    */
  var passed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of skipped entities.
    */
  var skipped: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of stopped entities.
    */
  var stopped: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of entities.
    */
  var total: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of warned entities.
    */
  var warned: js.UndefOr[Integer] = js.undefined
}
object Counters {
  
  inline def apply(): Counters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Counters] (val x: Self) extends AnyVal {
    
    inline def setErrored(value: Integer): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
    
    inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
    
    inline def setFailed(value: Integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setPassed(value: Integer): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
    
    inline def setPassedUndefined: Self = StObject.set(x, "passed", js.undefined)
    
    inline def setSkipped(value: Integer): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
    
    inline def setStopped(value: Integer): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    inline def setTotal(value: Integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setWarned(value: Integer): Self = StObject.set(x, "warned", value.asInstanceOf[js.Any])
    
    inline def setWarnedUndefined: Self = StObject.set(x, "warned", js.undefined)
  }
}
