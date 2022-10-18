package typings.adhan

import typings.adhan.anon.Abyad
import typings.adhan.libTypesTypeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesAstronomicalMod {
  
  object default {
    
    @JSImport("adhan/lib/types/Astronomical", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def altitudeOfCelestialBody(observerLatitude: Double, declination: Double, localHourAngle: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("altitudeOfCelestialBody")(observerLatitude.asInstanceOf[js.Any], declination.asInstanceOf[js.Any], localHourAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def apparentObliquityOfTheEcliptic(julianCentury: Double, meanObliquityOfTheEcliptic: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("apparentObliquityOfTheEcliptic")(julianCentury.asInstanceOf[js.Any], meanObliquityOfTheEcliptic.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def apparentSolarLongitude(julianCentury: Double, meanLongitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("apparentSolarLongitude")(julianCentury.asInstanceOf[js.Any], meanLongitude.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def approximateTransit(longitude: Double, siderealTime: Double, rightAscension: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTransit")(longitude.asInstanceOf[js.Any], siderealTime.asInstanceOf[js.Any], rightAscension.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def ascendingLunarNodeLongitude(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ascendingLunarNodeLongitude")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def correctedHourAngle(
      approximateTransit: Double,
      angle: Double,
      coordinates: typings.adhan.libTypesCoordinatesMod.default,
      afterTransit: Boolean,
      siderealTime: Double,
      rightAscension: Double,
      previousRightAscension: Double,
      nextRightAscension: Double,
      declination: Double,
      previousDeclination: Double,
      nextDeclination: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctedHourAngle")(approximateTransit.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], afterTransit.asInstanceOf[js.Any], siderealTime.asInstanceOf[js.Any], rightAscension.asInstanceOf[js.Any], previousRightAscension.asInstanceOf[js.Any], nextRightAscension.asInstanceOf[js.Any], declination.asInstanceOf[js.Any], previousDeclination.asInstanceOf[js.Any], nextDeclination.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def correctedTransit(
      approximateTransit: Double,
      longitude: Double,
      siderealTime: Double,
      rightAscension: Double,
      previousRightAscension: Double,
      nextRightAscension: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("correctedTransit")(approximateTransit.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], siderealTime.asInstanceOf[js.Any], rightAscension.asInstanceOf[js.Any], previousRightAscension.asInstanceOf[js.Any], nextRightAscension.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def daysSinceSolstice(dayOfYear: Double, year: Double, latitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysSinceSolstice")(dayOfYear.asInstanceOf[js.Any], year.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def interpolate(y2: Double, y1: Double, y3: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(y2.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def interpolateAngles(y2: Double, y1: Double, y3: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateAngles")(y2.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def julianCentury(julianDay: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("julianCentury")(julianDay.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def julianDay(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("julianDay")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def julianDay(year: Double, month: Double, day: Double, hours: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("julianDay")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hours.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def meanLunarLongitude(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("meanLunarLongitude")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def meanObliquityOfTheEcliptic(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("meanObliquityOfTheEcliptic")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def meanSiderealTime(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("meanSiderealTime")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def meanSolarAnomaly(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("meanSolarAnomaly")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def meanSolarLongitude(julianCentury: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("meanSolarLongitude")(julianCentury.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def nutationInLongitude(julianCentury: Double, solarLongitude: Double, lunarLongitude: Double, ascendingNode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nutationInLongitude")(julianCentury.asInstanceOf[js.Any], solarLongitude.asInstanceOf[js.Any], lunarLongitude.asInstanceOf[js.Any], ascendingNode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def nutationInObliquity(julianCentury: Double, solarLongitude: Double, lunarLongitude: Double, ascendingNode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nutationInObliquity")(julianCentury.asInstanceOf[js.Any], solarLongitude.asInstanceOf[js.Any], lunarLongitude.asInstanceOf[js.Any], ascendingNode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def seasonAdjustedEveningTwilight(latitude: Double, dayOfYear: Double, year: Double, sunset: js.Date, shafaq: ValueOf[Abyad]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seasonAdjustedEveningTwilight")(latitude.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any], year.asInstanceOf[js.Any], sunset.asInstanceOf[js.Any], shafaq.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def seasonAdjustedMorningTwilight(latitude: Double, dayOfYear: Double, year: Double, sunrise: js.Date): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seasonAdjustedMorningTwilight")(latitude.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any], year.asInstanceOf[js.Any], sunrise.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def solarEquationOfTheCenter(julianCentury: Double, meanAnomaly: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("solarEquationOfTheCenter")(julianCentury.asInstanceOf[js.Any], meanAnomaly.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
