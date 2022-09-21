package typings.ambientWeatherApi

import typings.ambientWeatherApi.ambientWeatherApiStrings.Point
import typings.ambientWeatherApi.mod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Coordinates extends StObject {
    
    var coordinates: js.Tuple2[Double, Double]
    
    var `type`: Point
  }
  object Coordinates {
    
    inline def apply(coordinates: js.Tuple2[Double, Double]): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Coordinates]
    }
    
    extension [Self <: Coordinates](x: Self) {
      
      inline def setCoordinates(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ambient-weather-api.ambient-weather-api.DeviceData & {  device :ambient-weather-api.ambient-weather-api.Device} */
  trait DeviceDatadeviceDevice extends StObject {
    
    /** 24 Hour Rain, in */
    var `24hourrainin`: js.UndefOr[Double] = js.undefined
    
    /** Absolute Pressure, inHg */
    var baromabsin: js.UndefOr[Double] = js.undefined
    
    /** Relative Pressure, inHg */
    var baromrelin: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt1: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt10: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt2: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt3: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt4: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt5: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt6: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt7: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt8: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt9: js.UndefOr[Double] = js.undefined
    
    /** PM2.5 Air Quality Sensor Battery indication, OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var batt_25: js.UndefOr[Double] = js.undefined
    
    var batt_co2: js.UndefOr[String] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var battin: js.UndefOr[Double] = js.undefined
    
    /** OK/Low indication, Int, 1=OK, 0=Low (Meteobridge Users 1=Low, 0=OK) */
    var battout: js.UndefOr[Double] = js.undefined
    
    /** CO2 Meter, ppm */
    var co2: js.UndefOr[Double] = js.undefined
    
    /** Daily Rain, in */
    var dailyrainin: js.UndefOr[Double] = js.undefined
    
    var date: String
    
    /** Date, int (milliseconds from 01-01-1970, rounded down to nearest minute on server) */
    var dateutc: Double
    
    var device: Device
    
    var dewPoint: js.UndefOr[Double] = js.undefined
    
    var dewPointin: js.UndefOr[Double] = js.undefined
    
    /** Event Rain, in */
    var eventrainin: js.UndefOr[Double] = js.undefined
    
    // No official documentation for this properties
    var feelsLike: js.UndefOr[Double] = js.undefined
    
    var feelsLikein: js.UndefOr[Double] = js.undefined
    
    /** Hourly Rain Rate, in/hr */
    var hourlyrainin: js.UndefOr[Double] = js.undefined
    
    /** Outdoor Humidity, 0-100% */
    var humidity: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #1, 0-100% */
    var humidity1: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #10, 0-100% */
    var humidity10: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #2, 0-100% */
    var humidity2: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #3, 0-100% */
    var humidity3: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #4, 0-100% */
    var humidity4: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #5, 0-100% */
    var humidity5: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #6, 0-100% */
    var humidity6: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #7, 0-100% */
    var humidity7: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #8, 0-100% */
    var humidity8: js.UndefOr[Double] = js.undefined
    
    /** Humidity Sensor #9, 0-100% */
    var humidity9: js.UndefOr[Double] = js.undefined
    
    /** Indoor Humidity, 0-100% */
    var humidityin: js.UndefOr[Double] = js.undefined
    
    var lastRain: js.UndefOr[String] = js.undefined
    
    /** Maximum wind speed in last day, mph */
    var maxdailygust: js.UndefOr[Double] = js.undefined
    
    /** Monthly Rain, in */
    var monthlyrainin: js.UndefOr[Double] = js.undefined
    
    /** PM2.5 Air Quality, Float, µg/m^3 */
    var pm25: js.UndefOr[Double] = js.undefined
    
    /** PM2.5 Air Quality 24 hour average, Float, µg/m^3 */
    var pm25_24h: js.UndefOr[Double] = js.undefined
    
    /** PM2.5 Air Quality, Indoor, Float, µg/m^3 */
    var pm25_in: js.UndefOr[Double] = js.undefined
    
    /** PM2.5 Air Quality 24 hour average, Indoor, Float, µg/m^3 */
    var pm25_in_24h: js.UndefOr[Double] = js.undefined
    
    /** Relay 1, 0 or 1 */
    var relay1: js.UndefOr[Double] = js.undefined
    
    /** Relay 10, 0 or 1 */
    var relay10: js.UndefOr[Double] = js.undefined
    
    /** Relay 2, 0 or 1 */
    var relay2: js.UndefOr[Double] = js.undefined
    
    /** Relay 3, 0 or 1 */
    var relay3: js.UndefOr[Double] = js.undefined
    
    /** Relay 4, 0 or 1 */
    var relay4: js.UndefOr[Double] = js.undefined
    
    /** Relay 5, 0 or 1 */
    var relay5: js.UndefOr[Double] = js.undefined
    
    /** Relay 6, 0 or 1 */
    var relay6: js.UndefOr[Double] = js.undefined
    
    /** Relay 7, 0 or 1 */
    var relay7: js.UndefOr[Double] = js.undefined
    
    /** Relay 8, 0 or 1 */
    var relay8: js.UndefOr[Double] = js.undefined
    
    /** Relay 9, 0 or 1 */
    var relay9: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #1, % */
    var soilhum1: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #10, % */
    var soilhum10: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #2, % */
    var soilhum2: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #3, % */
    var soilhum3: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #4, % */
    var soilhum4: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #5, % */
    var soilhum5: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #6, % */
    var soilhum6: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #7, % */
    var soilhum7: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #8, % */
    var soilhum8: js.UndefOr[Double] = js.undefined
    
    /** Soil Humidity Sensor #9, % */
    var soilhum9: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #10, ºF */
    var soiltemp10f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #1, ºF */
    var soiltemp1f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #2, ºF */
    var soiltemp2f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #3, ºF */
    var soiltemp3f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #4, ºF */
    var soiltemp4f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #5, ºF */
    var soiltemp5f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #6, ºF */
    var soiltemp6f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #7, ºF */
    var soiltemp7f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #8, ºF */
    var soiltemp8f: js.UndefOr[Double] = js.undefined
    
    /** Soil Temperature Sensor #9, ºF */
    var soiltemp9f: js.UndefOr[Double] = js.undefined
    
    /** Solar Radiation, W/m^2 */
    var solarradiation: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #10, ºF */
    var temp10f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #1, ºF */
    var temp1f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #2, ºF */
    var temp2f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #3, ºF */
    var temp3f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #4, ºF */
    var temp4f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #5, ºF */
    var temp5f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #6, ºF */
    var temp6f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #7, ºF */
    var temp7f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #8, ºF */
    var temp8f: js.UndefOr[Double] = js.undefined
    
    /** Temperature Sensor #9, ºF */
    var temp9f: js.UndefOr[Double] = js.undefined
    
    /** Outdoor Temperature, ºF */
    var tempf: js.UndefOr[Double] = js.undefined
    
    /** Indoor Temperature, ºF */
    var tempinf: js.UndefOr[Double] = js.undefined
    
    /** Total Rain, in (since last factory reset) */
    var totalrainin: js.UndefOr[Double] = js.undefined
    
    /** IANA Time Zone, String */
    var tz: String
    
    /** Ultra-Violet Radiation Index, integer on all devices EXCEPT WS-8478. */
    var uv: js.UndefOr[Double] = js.undefined
    
    /** Weekly Rain, in */
    var weeklyrainin: js.UndefOr[Double] = js.undefined
    
    /** instantaneous wind direction, 0-360º */
    var winddir: js.UndefOr[Double] = js.undefined
    
    /** Average wind direction, 10 minute average, 0-360º */
    var winddir_avg10m: js.UndefOr[Double] = js.undefined
    
    /** Average wind direction, 2 minute average, mph */
    var winddir_avg2m: js.UndefOr[Double] = js.undefined
    
    /** Wind direction at which the wind gust occurred, 0-360º */
    var windgustdir: js.UndefOr[Double] = js.undefined
    
    /** max wind speed in the last 10 minutes, mph */
    var windgustmph: js.UndefOr[Double] = js.undefined
    
    /** Average wind speed, 10 minute average, mph */
    var windspdmph_avg10m: js.UndefOr[Double] = js.undefined
    
    /** Average wind speed, 2 minute average, mph */
    var windspdmph_avg2m: js.UndefOr[Double] = js.undefined
    
    /** instantaneous wind speed, mph */
    var windspeedmph: js.UndefOr[Double] = js.undefined
    
    /** Yearly Rain, in */
    var yearlyrainin: js.UndefOr[Double] = js.undefined
  }
  object DeviceDatadeviceDevice {
    
    inline def apply(date: String, dateutc: Double, device: Device, tz: String): DeviceDatadeviceDevice = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateutc = dateutc.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], tz = tz.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceDatadeviceDevice]
    }
    
    extension [Self <: DeviceDatadeviceDevice](x: Self) {
      
      inline def set24hourrainin(value: Double): Self = StObject.set(x, "24hourrainin", value.asInstanceOf[js.Any])
      
      inline def set24hourraininUndefined: Self = StObject.set(x, "24hourrainin", js.undefined)
      
      inline def setBaromabsin(value: Double): Self = StObject.set(x, "baromabsin", value.asInstanceOf[js.Any])
      
      inline def setBaromabsinUndefined: Self = StObject.set(x, "baromabsin", js.undefined)
      
      inline def setBaromrelin(value: Double): Self = StObject.set(x, "baromrelin", value.asInstanceOf[js.Any])
      
      inline def setBaromrelinUndefined: Self = StObject.set(x, "baromrelin", js.undefined)
      
      inline def setBatt1(value: Double): Self = StObject.set(x, "batt1", value.asInstanceOf[js.Any])
      
      inline def setBatt10(value: Double): Self = StObject.set(x, "batt10", value.asInstanceOf[js.Any])
      
      inline def setBatt10Undefined: Self = StObject.set(x, "batt10", js.undefined)
      
      inline def setBatt1Undefined: Self = StObject.set(x, "batt1", js.undefined)
      
      inline def setBatt2(value: Double): Self = StObject.set(x, "batt2", value.asInstanceOf[js.Any])
      
      inline def setBatt2Undefined: Self = StObject.set(x, "batt2", js.undefined)
      
      inline def setBatt3(value: Double): Self = StObject.set(x, "batt3", value.asInstanceOf[js.Any])
      
      inline def setBatt3Undefined: Self = StObject.set(x, "batt3", js.undefined)
      
      inline def setBatt4(value: Double): Self = StObject.set(x, "batt4", value.asInstanceOf[js.Any])
      
      inline def setBatt4Undefined: Self = StObject.set(x, "batt4", js.undefined)
      
      inline def setBatt5(value: Double): Self = StObject.set(x, "batt5", value.asInstanceOf[js.Any])
      
      inline def setBatt5Undefined: Self = StObject.set(x, "batt5", js.undefined)
      
      inline def setBatt6(value: Double): Self = StObject.set(x, "batt6", value.asInstanceOf[js.Any])
      
      inline def setBatt6Undefined: Self = StObject.set(x, "batt6", js.undefined)
      
      inline def setBatt7(value: Double): Self = StObject.set(x, "batt7", value.asInstanceOf[js.Any])
      
      inline def setBatt7Undefined: Self = StObject.set(x, "batt7", js.undefined)
      
      inline def setBatt8(value: Double): Self = StObject.set(x, "batt8", value.asInstanceOf[js.Any])
      
      inline def setBatt8Undefined: Self = StObject.set(x, "batt8", js.undefined)
      
      inline def setBatt9(value: Double): Self = StObject.set(x, "batt9", value.asInstanceOf[js.Any])
      
      inline def setBatt9Undefined: Self = StObject.set(x, "batt9", js.undefined)
      
      inline def setBatt_25(value: Double): Self = StObject.set(x, "batt_25", value.asInstanceOf[js.Any])
      
      inline def setBatt_25Undefined: Self = StObject.set(x, "batt_25", js.undefined)
      
      inline def setBatt_co2(value: String): Self = StObject.set(x, "batt_co2", value.asInstanceOf[js.Any])
      
      inline def setBatt_co2Undefined: Self = StObject.set(x, "batt_co2", js.undefined)
      
      inline def setBattin(value: Double): Self = StObject.set(x, "battin", value.asInstanceOf[js.Any])
      
      inline def setBattinUndefined: Self = StObject.set(x, "battin", js.undefined)
      
      inline def setBattout(value: Double): Self = StObject.set(x, "battout", value.asInstanceOf[js.Any])
      
      inline def setBattoutUndefined: Self = StObject.set(x, "battout", js.undefined)
      
      inline def setCo2(value: Double): Self = StObject.set(x, "co2", value.asInstanceOf[js.Any])
      
      inline def setCo2Undefined: Self = StObject.set(x, "co2", js.undefined)
      
      inline def setDailyrainin(value: Double): Self = StObject.set(x, "dailyrainin", value.asInstanceOf[js.Any])
      
      inline def setDailyraininUndefined: Self = StObject.set(x, "dailyrainin", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateutc(value: Double): Self = StObject.set(x, "dateutc", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDewPoint(value: Double): Self = StObject.set(x, "dewPoint", value.asInstanceOf[js.Any])
      
      inline def setDewPointUndefined: Self = StObject.set(x, "dewPoint", js.undefined)
      
      inline def setDewPointin(value: Double): Self = StObject.set(x, "dewPointin", value.asInstanceOf[js.Any])
      
      inline def setDewPointinUndefined: Self = StObject.set(x, "dewPointin", js.undefined)
      
      inline def setEventrainin(value: Double): Self = StObject.set(x, "eventrainin", value.asInstanceOf[js.Any])
      
      inline def setEventraininUndefined: Self = StObject.set(x, "eventrainin", js.undefined)
      
      inline def setFeelsLike(value: Double): Self = StObject.set(x, "feelsLike", value.asInstanceOf[js.Any])
      
      inline def setFeelsLikeUndefined: Self = StObject.set(x, "feelsLike", js.undefined)
      
      inline def setFeelsLikein(value: Double): Self = StObject.set(x, "feelsLikein", value.asInstanceOf[js.Any])
      
      inline def setFeelsLikeinUndefined: Self = StObject.set(x, "feelsLikein", js.undefined)
      
      inline def setHourlyrainin(value: Double): Self = StObject.set(x, "hourlyrainin", value.asInstanceOf[js.Any])
      
      inline def setHourlyraininUndefined: Self = StObject.set(x, "hourlyrainin", js.undefined)
      
      inline def setHumidity(value: Double): Self = StObject.set(x, "humidity", value.asInstanceOf[js.Any])
      
      inline def setHumidity1(value: Double): Self = StObject.set(x, "humidity1", value.asInstanceOf[js.Any])
      
      inline def setHumidity10(value: Double): Self = StObject.set(x, "humidity10", value.asInstanceOf[js.Any])
      
      inline def setHumidity10Undefined: Self = StObject.set(x, "humidity10", js.undefined)
      
      inline def setHumidity1Undefined: Self = StObject.set(x, "humidity1", js.undefined)
      
      inline def setHumidity2(value: Double): Self = StObject.set(x, "humidity2", value.asInstanceOf[js.Any])
      
      inline def setHumidity2Undefined: Self = StObject.set(x, "humidity2", js.undefined)
      
      inline def setHumidity3(value: Double): Self = StObject.set(x, "humidity3", value.asInstanceOf[js.Any])
      
      inline def setHumidity3Undefined: Self = StObject.set(x, "humidity3", js.undefined)
      
      inline def setHumidity4(value: Double): Self = StObject.set(x, "humidity4", value.asInstanceOf[js.Any])
      
      inline def setHumidity4Undefined: Self = StObject.set(x, "humidity4", js.undefined)
      
      inline def setHumidity5(value: Double): Self = StObject.set(x, "humidity5", value.asInstanceOf[js.Any])
      
      inline def setHumidity5Undefined: Self = StObject.set(x, "humidity5", js.undefined)
      
      inline def setHumidity6(value: Double): Self = StObject.set(x, "humidity6", value.asInstanceOf[js.Any])
      
      inline def setHumidity6Undefined: Self = StObject.set(x, "humidity6", js.undefined)
      
      inline def setHumidity7(value: Double): Self = StObject.set(x, "humidity7", value.asInstanceOf[js.Any])
      
      inline def setHumidity7Undefined: Self = StObject.set(x, "humidity7", js.undefined)
      
      inline def setHumidity8(value: Double): Self = StObject.set(x, "humidity8", value.asInstanceOf[js.Any])
      
      inline def setHumidity8Undefined: Self = StObject.set(x, "humidity8", js.undefined)
      
      inline def setHumidity9(value: Double): Self = StObject.set(x, "humidity9", value.asInstanceOf[js.Any])
      
      inline def setHumidity9Undefined: Self = StObject.set(x, "humidity9", js.undefined)
      
      inline def setHumidityUndefined: Self = StObject.set(x, "humidity", js.undefined)
      
      inline def setHumidityin(value: Double): Self = StObject.set(x, "humidityin", value.asInstanceOf[js.Any])
      
      inline def setHumidityinUndefined: Self = StObject.set(x, "humidityin", js.undefined)
      
      inline def setLastRain(value: String): Self = StObject.set(x, "lastRain", value.asInstanceOf[js.Any])
      
      inline def setLastRainUndefined: Self = StObject.set(x, "lastRain", js.undefined)
      
      inline def setMaxdailygust(value: Double): Self = StObject.set(x, "maxdailygust", value.asInstanceOf[js.Any])
      
      inline def setMaxdailygustUndefined: Self = StObject.set(x, "maxdailygust", js.undefined)
      
      inline def setMonthlyrainin(value: Double): Self = StObject.set(x, "monthlyrainin", value.asInstanceOf[js.Any])
      
      inline def setMonthlyraininUndefined: Self = StObject.set(x, "monthlyrainin", js.undefined)
      
      inline def setPm25(value: Double): Self = StObject.set(x, "pm25", value.asInstanceOf[js.Any])
      
      inline def setPm25Undefined: Self = StObject.set(x, "pm25", js.undefined)
      
      inline def setPm25_24h(value: Double): Self = StObject.set(x, "pm25_24h", value.asInstanceOf[js.Any])
      
      inline def setPm25_24hUndefined: Self = StObject.set(x, "pm25_24h", js.undefined)
      
      inline def setPm25_in(value: Double): Self = StObject.set(x, "pm25_in", value.asInstanceOf[js.Any])
      
      inline def setPm25_inUndefined: Self = StObject.set(x, "pm25_in", js.undefined)
      
      inline def setPm25_in_24h(value: Double): Self = StObject.set(x, "pm25_in_24h", value.asInstanceOf[js.Any])
      
      inline def setPm25_in_24hUndefined: Self = StObject.set(x, "pm25_in_24h", js.undefined)
      
      inline def setRelay1(value: Double): Self = StObject.set(x, "relay1", value.asInstanceOf[js.Any])
      
      inline def setRelay10(value: Double): Self = StObject.set(x, "relay10", value.asInstanceOf[js.Any])
      
      inline def setRelay10Undefined: Self = StObject.set(x, "relay10", js.undefined)
      
      inline def setRelay1Undefined: Self = StObject.set(x, "relay1", js.undefined)
      
      inline def setRelay2(value: Double): Self = StObject.set(x, "relay2", value.asInstanceOf[js.Any])
      
      inline def setRelay2Undefined: Self = StObject.set(x, "relay2", js.undefined)
      
      inline def setRelay3(value: Double): Self = StObject.set(x, "relay3", value.asInstanceOf[js.Any])
      
      inline def setRelay3Undefined: Self = StObject.set(x, "relay3", js.undefined)
      
      inline def setRelay4(value: Double): Self = StObject.set(x, "relay4", value.asInstanceOf[js.Any])
      
      inline def setRelay4Undefined: Self = StObject.set(x, "relay4", js.undefined)
      
      inline def setRelay5(value: Double): Self = StObject.set(x, "relay5", value.asInstanceOf[js.Any])
      
      inline def setRelay5Undefined: Self = StObject.set(x, "relay5", js.undefined)
      
      inline def setRelay6(value: Double): Self = StObject.set(x, "relay6", value.asInstanceOf[js.Any])
      
      inline def setRelay6Undefined: Self = StObject.set(x, "relay6", js.undefined)
      
      inline def setRelay7(value: Double): Self = StObject.set(x, "relay7", value.asInstanceOf[js.Any])
      
      inline def setRelay7Undefined: Self = StObject.set(x, "relay7", js.undefined)
      
      inline def setRelay8(value: Double): Self = StObject.set(x, "relay8", value.asInstanceOf[js.Any])
      
      inline def setRelay8Undefined: Self = StObject.set(x, "relay8", js.undefined)
      
      inline def setRelay9(value: Double): Self = StObject.set(x, "relay9", value.asInstanceOf[js.Any])
      
      inline def setRelay9Undefined: Self = StObject.set(x, "relay9", js.undefined)
      
      inline def setSoilhum1(value: Double): Self = StObject.set(x, "soilhum1", value.asInstanceOf[js.Any])
      
      inline def setSoilhum10(value: Double): Self = StObject.set(x, "soilhum10", value.asInstanceOf[js.Any])
      
      inline def setSoilhum10Undefined: Self = StObject.set(x, "soilhum10", js.undefined)
      
      inline def setSoilhum1Undefined: Self = StObject.set(x, "soilhum1", js.undefined)
      
      inline def setSoilhum2(value: Double): Self = StObject.set(x, "soilhum2", value.asInstanceOf[js.Any])
      
      inline def setSoilhum2Undefined: Self = StObject.set(x, "soilhum2", js.undefined)
      
      inline def setSoilhum3(value: Double): Self = StObject.set(x, "soilhum3", value.asInstanceOf[js.Any])
      
      inline def setSoilhum3Undefined: Self = StObject.set(x, "soilhum3", js.undefined)
      
      inline def setSoilhum4(value: Double): Self = StObject.set(x, "soilhum4", value.asInstanceOf[js.Any])
      
      inline def setSoilhum4Undefined: Self = StObject.set(x, "soilhum4", js.undefined)
      
      inline def setSoilhum5(value: Double): Self = StObject.set(x, "soilhum5", value.asInstanceOf[js.Any])
      
      inline def setSoilhum5Undefined: Self = StObject.set(x, "soilhum5", js.undefined)
      
      inline def setSoilhum6(value: Double): Self = StObject.set(x, "soilhum6", value.asInstanceOf[js.Any])
      
      inline def setSoilhum6Undefined: Self = StObject.set(x, "soilhum6", js.undefined)
      
      inline def setSoilhum7(value: Double): Self = StObject.set(x, "soilhum7", value.asInstanceOf[js.Any])
      
      inline def setSoilhum7Undefined: Self = StObject.set(x, "soilhum7", js.undefined)
      
      inline def setSoilhum8(value: Double): Self = StObject.set(x, "soilhum8", value.asInstanceOf[js.Any])
      
      inline def setSoilhum8Undefined: Self = StObject.set(x, "soilhum8", js.undefined)
      
      inline def setSoilhum9(value: Double): Self = StObject.set(x, "soilhum9", value.asInstanceOf[js.Any])
      
      inline def setSoilhum9Undefined: Self = StObject.set(x, "soilhum9", js.undefined)
      
      inline def setSoiltemp10f(value: Double): Self = StObject.set(x, "soiltemp10f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp10fUndefined: Self = StObject.set(x, "soiltemp10f", js.undefined)
      
      inline def setSoiltemp1f(value: Double): Self = StObject.set(x, "soiltemp1f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp1fUndefined: Self = StObject.set(x, "soiltemp1f", js.undefined)
      
      inline def setSoiltemp2f(value: Double): Self = StObject.set(x, "soiltemp2f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp2fUndefined: Self = StObject.set(x, "soiltemp2f", js.undefined)
      
      inline def setSoiltemp3f(value: Double): Self = StObject.set(x, "soiltemp3f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp3fUndefined: Self = StObject.set(x, "soiltemp3f", js.undefined)
      
      inline def setSoiltemp4f(value: Double): Self = StObject.set(x, "soiltemp4f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp4fUndefined: Self = StObject.set(x, "soiltemp4f", js.undefined)
      
      inline def setSoiltemp5f(value: Double): Self = StObject.set(x, "soiltemp5f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp5fUndefined: Self = StObject.set(x, "soiltemp5f", js.undefined)
      
      inline def setSoiltemp6f(value: Double): Self = StObject.set(x, "soiltemp6f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp6fUndefined: Self = StObject.set(x, "soiltemp6f", js.undefined)
      
      inline def setSoiltemp7f(value: Double): Self = StObject.set(x, "soiltemp7f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp7fUndefined: Self = StObject.set(x, "soiltemp7f", js.undefined)
      
      inline def setSoiltemp8f(value: Double): Self = StObject.set(x, "soiltemp8f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp8fUndefined: Self = StObject.set(x, "soiltemp8f", js.undefined)
      
      inline def setSoiltemp9f(value: Double): Self = StObject.set(x, "soiltemp9f", value.asInstanceOf[js.Any])
      
      inline def setSoiltemp9fUndefined: Self = StObject.set(x, "soiltemp9f", js.undefined)
      
      inline def setSolarradiation(value: Double): Self = StObject.set(x, "solarradiation", value.asInstanceOf[js.Any])
      
      inline def setSolarradiationUndefined: Self = StObject.set(x, "solarradiation", js.undefined)
      
      inline def setTemp10f(value: Double): Self = StObject.set(x, "temp10f", value.asInstanceOf[js.Any])
      
      inline def setTemp10fUndefined: Self = StObject.set(x, "temp10f", js.undefined)
      
      inline def setTemp1f(value: Double): Self = StObject.set(x, "temp1f", value.asInstanceOf[js.Any])
      
      inline def setTemp1fUndefined: Self = StObject.set(x, "temp1f", js.undefined)
      
      inline def setTemp2f(value: Double): Self = StObject.set(x, "temp2f", value.asInstanceOf[js.Any])
      
      inline def setTemp2fUndefined: Self = StObject.set(x, "temp2f", js.undefined)
      
      inline def setTemp3f(value: Double): Self = StObject.set(x, "temp3f", value.asInstanceOf[js.Any])
      
      inline def setTemp3fUndefined: Self = StObject.set(x, "temp3f", js.undefined)
      
      inline def setTemp4f(value: Double): Self = StObject.set(x, "temp4f", value.asInstanceOf[js.Any])
      
      inline def setTemp4fUndefined: Self = StObject.set(x, "temp4f", js.undefined)
      
      inline def setTemp5f(value: Double): Self = StObject.set(x, "temp5f", value.asInstanceOf[js.Any])
      
      inline def setTemp5fUndefined: Self = StObject.set(x, "temp5f", js.undefined)
      
      inline def setTemp6f(value: Double): Self = StObject.set(x, "temp6f", value.asInstanceOf[js.Any])
      
      inline def setTemp6fUndefined: Self = StObject.set(x, "temp6f", js.undefined)
      
      inline def setTemp7f(value: Double): Self = StObject.set(x, "temp7f", value.asInstanceOf[js.Any])
      
      inline def setTemp7fUndefined: Self = StObject.set(x, "temp7f", js.undefined)
      
      inline def setTemp8f(value: Double): Self = StObject.set(x, "temp8f", value.asInstanceOf[js.Any])
      
      inline def setTemp8fUndefined: Self = StObject.set(x, "temp8f", js.undefined)
      
      inline def setTemp9f(value: Double): Self = StObject.set(x, "temp9f", value.asInstanceOf[js.Any])
      
      inline def setTemp9fUndefined: Self = StObject.set(x, "temp9f", js.undefined)
      
      inline def setTempf(value: Double): Self = StObject.set(x, "tempf", value.asInstanceOf[js.Any])
      
      inline def setTempfUndefined: Self = StObject.set(x, "tempf", js.undefined)
      
      inline def setTempinf(value: Double): Self = StObject.set(x, "tempinf", value.asInstanceOf[js.Any])
      
      inline def setTempinfUndefined: Self = StObject.set(x, "tempinf", js.undefined)
      
      inline def setTotalrainin(value: Double): Self = StObject.set(x, "totalrainin", value.asInstanceOf[js.Any])
      
      inline def setTotalraininUndefined: Self = StObject.set(x, "totalrainin", js.undefined)
      
      inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setUv(value: Double): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      inline def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
      
      inline def setWeeklyrainin(value: Double): Self = StObject.set(x, "weeklyrainin", value.asInstanceOf[js.Any])
      
      inline def setWeeklyraininUndefined: Self = StObject.set(x, "weeklyrainin", js.undefined)
      
      inline def setWinddir(value: Double): Self = StObject.set(x, "winddir", value.asInstanceOf[js.Any])
      
      inline def setWinddirUndefined: Self = StObject.set(x, "winddir", js.undefined)
      
      inline def setWinddir_avg10m(value: Double): Self = StObject.set(x, "winddir_avg10m", value.asInstanceOf[js.Any])
      
      inline def setWinddir_avg10mUndefined: Self = StObject.set(x, "winddir_avg10m", js.undefined)
      
      inline def setWinddir_avg2m(value: Double): Self = StObject.set(x, "winddir_avg2m", value.asInstanceOf[js.Any])
      
      inline def setWinddir_avg2mUndefined: Self = StObject.set(x, "winddir_avg2m", js.undefined)
      
      inline def setWindgustdir(value: Double): Self = StObject.set(x, "windgustdir", value.asInstanceOf[js.Any])
      
      inline def setWindgustdirUndefined: Self = StObject.set(x, "windgustdir", js.undefined)
      
      inline def setWindgustmph(value: Double): Self = StObject.set(x, "windgustmph", value.asInstanceOf[js.Any])
      
      inline def setWindgustmphUndefined: Self = StObject.set(x, "windgustmph", js.undefined)
      
      inline def setWindspdmph_avg10m(value: Double): Self = StObject.set(x, "windspdmph_avg10m", value.asInstanceOf[js.Any])
      
      inline def setWindspdmph_avg10mUndefined: Self = StObject.set(x, "windspdmph_avg10m", js.undefined)
      
      inline def setWindspdmph_avg2m(value: Double): Self = StObject.set(x, "windspdmph_avg2m", value.asInstanceOf[js.Any])
      
      inline def setWindspdmph_avg2mUndefined: Self = StObject.set(x, "windspdmph_avg2m", js.undefined)
      
      inline def setWindspeedmph(value: Double): Self = StObject.set(x, "windspeedmph", value.asInstanceOf[js.Any])
      
      inline def setWindspeedmphUndefined: Self = StObject.set(x, "windspeedmph", js.undefined)
      
      inline def setYearlyrainin(value: Double): Self = StObject.set(x, "yearlyrainin", value.asInstanceOf[js.Any])
      
      inline def setYearlyraininUndefined: Self = StObject.set(x, "yearlyrainin", js.undefined)
    }
  }
  
  trait Devices extends StObject {
    
    var devices: js.Array[Device]
  }
  object Devices {
    
    inline def apply(devices: js.Array[Device]): Devices = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Devices]
    }
    
    extension [Self <: Devices](x: Self) {
      
      inline def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
    }
  }
  
  trait EndDate extends StObject {
    
    var endDate: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object EndDate {
    
    inline def apply(): EndDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndDate]
    }
    
    extension [Self <: EndDate](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
