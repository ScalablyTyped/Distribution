package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gnss extends StObject {
  
  /**
    * Optional assistance altitude, which is the altitude of the device at capture time, specified in meters above the WGS84 reference ellipsoid.
    */
  var AssistAltitude: js.UndefOr[Coordinate] = js.undefined
  
  /**
    * Optional assistance position information, specified using latitude and longitude values in degrees. The coordinates are inside the WGS84 reference frame.
    */
  var AssistPosition: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AssistPosition] = js.undefined
  
  /**
    * Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds GPS time (GPST). If capture time is not specified, the local server time is used.
    */
  var CaptureTime: js.UndefOr[GPST] = js.undefined
  
  /**
    * Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not specified, default value of 300 is used.
    */
  var CaptureTimeAccuracy: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.CaptureTimeAccuracy] = js.undefined
  
  /**
    * Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
    */
  var Payload: GnssNav
  
  /**
    * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
    */
  var Use2DSolver: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Use2DSolver] = js.undefined
}
object Gnss {
  
  inline def apply(Payload: GnssNav): Gnss = {
    val __obj = js.Dynamic.literal(Payload = Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gnss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gnss] (val x: Self) extends AnyVal {
    
    inline def setAssistAltitude(value: Coordinate): Self = StObject.set(x, "AssistAltitude", value.asInstanceOf[js.Any])
    
    inline def setAssistAltitudeUndefined: Self = StObject.set(x, "AssistAltitude", js.undefined)
    
    inline def setAssistPosition(value: AssistPosition): Self = StObject.set(x, "AssistPosition", value.asInstanceOf[js.Any])
    
    inline def setAssistPositionUndefined: Self = StObject.set(x, "AssistPosition", js.undefined)
    
    inline def setAssistPositionVarargs(value: Coordinate*): Self = StObject.set(x, "AssistPosition", js.Array(value*))
    
    inline def setCaptureTime(value: GPST): Self = StObject.set(x, "CaptureTime", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeAccuracy(value: CaptureTimeAccuracy): Self = StObject.set(x, "CaptureTimeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setCaptureTimeAccuracyUndefined: Self = StObject.set(x, "CaptureTimeAccuracy", js.undefined)
    
    inline def setCaptureTimeUndefined: Self = StObject.set(x, "CaptureTime", js.undefined)
    
    inline def setPayload(value: GnssNav): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setUse2DSolver(value: Use2DSolver): Self = StObject.set(x, "Use2DSolver", value.asInstanceOf[js.Any])
    
    inline def setUse2DSolverUndefined: Self = StObject.set(x, "Use2DSolver", js.undefined)
  }
}
